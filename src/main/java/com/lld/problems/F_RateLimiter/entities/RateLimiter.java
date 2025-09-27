package com.lld.problems.F_RateLimiter.entities;

public class RateLimiter {

    private final Request request;
  private int requestCount;
  private long windowStart;

  public RateLimiter(Request request) {
    this.request = request;
    this.windowStart = System.currentTimeMillis();
    this.requestCount = 0;
  }

  public boolean allowRequest() {
    long now = System.currentTimeMillis();
    synchronized (this){
      if (now - windowStart > request.timeSpanWindowInSec()) {
        // Reset window
        windowStart = now;
        requestCount = 1;
        return true;
      } else if (requestCount < request.maxRequests()) {
        requestCount++;
        return true;
      }
    }
    return false;
  }
}
