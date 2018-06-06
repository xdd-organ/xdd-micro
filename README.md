# xdd-micro
微服务

### xdd-micro-eureka eureka注册中心


### xdd-micro-producer 生产者


### xdd-micro-consumer 消费者

断路器（Hystrix）
```
启动类添加注解
    @EnableHystrix
    @EnableHystrixDashboard

配置方式一(推荐使用)：
    @RequestMapping("test")
    @HystrixCommand(fallbackMethod = "hiError")
    public String test() {
        return testRemoteInterface.test();
    }

    public String hiError() {
        return "sorry,error!";
    }
    
配置方式二：
    实现接口
    @Component
    public class TestRemoteInterfaceHystric implements TestRemoteInterface{
        @Override
        public String test() {
            return "error";
        }
    }
    
    指定实现类，注解属性fallback
    @Component
    @FeignClient(value = "xdd-producer", fallback = TestRemoteInterface.class)
    public interface TestRemoteInterface {
        @RequestMapping("test/test")
        String test();
    }

```

### xdd-micro-zuul 网关服务
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
