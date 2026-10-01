import { mentorMatchesCategory } from '../constants/mentorDiscovery.js';
import { apiClient } from './apiClient.js';

export const mentorService = {
  async getFeaturedMentors() {
    return apiClient('/api/mentors');
  },

  async searchMentors(filters = {}) {
    const params = new URLSearchParams();
    const { categories = [], ...apiFilters } = filters;
    Object.entries(apiFilters).forEach(([key, value]) => {
      if (Array.isArray(value)) value.forEach(item => params.append(key, item));
      else if (value !== '' && value !== undefined && value !== null && value !== false) params.set(key, value);
    });
    const mentors = await apiClient(`/api/mentors?${params.toString()}`);
    return categories.length ? mentors.filter(mentor => categories.some(category => mentorMatchesCategory(mentor, category))) : mentors;
  }
};
