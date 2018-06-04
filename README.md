# xdd-micro
微服务

### xdd-micro-eureka
eureka注册中心

### xdd-micro-producer
生产者

### xdd-micro-consumer
消费者

### xdd-micro-zuul
```
zuul:
  routes:
    name1:
      path: /name1/**
      serviceId: xdd-consumer
    name3:
      path: /name3/**
      serviceId: xdd-producer

http://127.0.0.1:1113/name1/test
    访问xdd-consumer/test请求
http://127.0.0.1:1113/name3/test/test
    访问xdd-producer的/test/test请求
```
