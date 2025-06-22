package com.lld.problems.F_RateLimiter;

import com.lld.problems.F_RateLimiter.service.RateLimiterService;

public class RateLimiterTester {

  public static void main(String[] args) throws InterruptedException {
    RateLimiterService service = new RateLimiterService(3, 5000);

    String clientId = "client-1";

    for (int i = 0; i < 6; i++) {
      service.handleRequest(clientId);
      Thread.sleep(1000);
    }
  }
}
