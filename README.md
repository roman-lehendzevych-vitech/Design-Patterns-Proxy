# Design Patterns: Proxy

### 1. Quick idea about this pattern/Problem which this pattern solve?
The Proxy pattern suggests that you create a new proxy class with the same interface as an original service object. Then you update your app so that it passes the proxy object to all of the original object’s clients. Upon receiving a request from a client, the proxy creates a real service object and delegates all the work to it.

This pattern solve problem such as: you have a massive object that consumes a vast amount of system resources. You need it from time to time, but not always.
### 2. Where should we use this pattern (examples)?
When we need to have the exact copy of the object
### 3. Pros and Cons
Pros:
- You can control the service object without clients knowing about it
- You can manage the lifecycle of the service object when clients don’t care about it
- The proxy works even if the service object isn’t ready or is not available

Cons:
- The code may become more complicated since you need to introduce a lot of new classes
- The response from the service might get delayed