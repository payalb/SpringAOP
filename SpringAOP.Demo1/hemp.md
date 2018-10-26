
AOP: separating ur business logic from service

1) Aspect: service

2) Advice: 
a) MethodBeforeAdvice: before business logic
b) AfterAdvice: after business logic even if exception raised
c) AroundAdvice: MethodInterceptor: before & after
d) AftereturningAdvice: after business logic: success
e) Throws advice: exception is raised

3) Target: business class

4) Proxy clasS: runtime

5) weaving: business logic+ service: proxy bean