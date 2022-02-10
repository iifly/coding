# Bug 收集

## RabbitMQ

### Bug 信息

```
Shutdown Signal: channel error; protocol method: #method<channel.close>(reply-code=406, reply-text=PRECONDITION_FAILED - unknown delivery tag 1, class-id=60, method-id=80)
```

### 原因

当我们在项目中使用 RabbitMQ 将某条监听的消息进行了**手动 ACK **确认，但由于 MQ 默认为当消息消费时自动确认消息，所以导致消息在刚被消费时进行了自动确认，此时又去操作了一遍手动确认，这时你的消息队列已经没有该条消息，所以手动确认时便找不到该条消息

### 解决方法

1. 在`@RabbitListener`注解里添加属性：`ackMode = "MANUAL"`，手动应答。

   ```
   @RabbitListener(queues = "direct.queue",ackMode = "MANUAL")//手动应答
   ```

2. 在配置文件中添加

   ```
   spring.rabbitmq.listener.simple.acknowledge-mode=manual # 手动应答
   ```

---
