package com.lld.problems.F_RateLimiter.service;

public class RateLimiterService {

    private final RegisterClientRateLimiter registry;

        public RateLimiterService(int maxRequests, long windowMillis) {
            this.registry = new RegisterClientRateLimiter(maxRequests, windowMillis);
        }

        public void handleRequest(String clientId) {
            if (registry.allowRequest(clientId)) {
                System.out.println("✅ Allowed request from " + clientId);
            } else {
                System.out.println("❌ Rejected request from " + clientId + " (Rate limit exceeded)");
            }
        }
}
