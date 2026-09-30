/**
 * Centralized API client for HappyProgramming frontend.
 */
export async function apiClient(endpoint, options = {}) {
  const config = {
    headers: {
      'Content-Type': 'application/json',
      ...options.headers,
    },
    ...options,
  };

  const response = await fetch(endpoint, config);
  if (!response.ok) {
    const errorBody = await response.json().catch(() => ({}));
    throw new Error(errorBody.message || `HTTP error! status: ${response.status}`);
  }

  const result = await response.json();
  return result.data !== undefined ? result.data : result;
}
