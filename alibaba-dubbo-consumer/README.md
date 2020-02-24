- 启动参数：

    -Dserver.port=xxxx -Dspring.profiles.active=prod
    
    
- skywalking apm监控启动参数(6.x版本配置grpc端口）：

    -javaagent:/Users/zhurong/Apps/skywalking-agent/skywalking-agent.jar
    -Dskywalking.agent.service_name=alibaba-dubbo-consumer
    -Dskywalking.collector.backend_service=192.168.101.252:11800