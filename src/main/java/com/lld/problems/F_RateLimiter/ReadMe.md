# Rate Limiter Design

## Entities:
1. Request : MaxRequest and TimeInSecs
2. RateLimiter : Request and computation of rate
## Service:
3. RegisterClientRateLimiter : Create the map of Client-id and rate-limit confgiration
4. RateLimitService: Service to check if request is allowed or not
## Test
5. RateLimiterTester : To test the rate limiter