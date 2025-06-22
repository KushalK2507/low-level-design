package com.lld.problems.F_RateLimiter.entities;

public record Request(int maxRequests,long timeSpanWindowInSec) { }
