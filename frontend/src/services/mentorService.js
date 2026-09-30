import { apiClient } from './apiClient.js';

export const mentorService = {
  async getFeaturedMentors() {
    return apiClient('/api/mentors');
  }
};
