package com.lld.problems.F_RateLimiter.service;

import com.lld.problems.F_RateLimiter.entities.RateLimiter;
import com.lld.problems.F_RateLimiter.entities.Request;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegisterClientRateLimiter {
  private final Map<String, RateLimiter> clientLimiters = new ConcurrentHashMap<>();
  Request request;

  public RegisterClientRateLimiter(int maxRequests, long windowInSec) {
   this.request = new Request(maxRequests,windowInSec);
  }

  public boolean allowRequest(String clientId) {
    RateLimiter limiter = clientLimiters.computeIfAbsent(clientId, id -> new RateLimiter(request));
    return limiter.allowRequest();
  }
}
