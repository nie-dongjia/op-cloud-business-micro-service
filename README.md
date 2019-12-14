# op-cloud-business-micro-service
简介： 模拟spring-cloud 微服务调用 关键点 
核心微服务接口实现 
##  分布式微服务调用

接口说明

商品服务：
订单服务：
结算服务： 

#  
运行方式调优 ：
## dev  
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-business-micro-service/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-business-micro-service/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-settlement-business-service-app.jar --spring.profiles.active=dev &  
## uat  
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud-business-micro-service/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-settlement-business-service/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-business-micro-service-app.jar --spring.profiles.active=uat &  
## prod 
nohup java -server -Xms128m -Xmx128m  -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100  -Xloggc:/servers/op-cloud/op-cloud-business-micro-service/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/op-cloud/op-cloud-business-micro-service/logs/HeapDumpOnOutOfMemoryError -jar op-cloud-business-micro-service-app.jar --spring.profiles.active=prod &  





## 老方式：
export JAVA_OPTS="-server -Xms128m -Xmx128m -XX:MaxMetaspaceSize=100M -XX:MetaspaceSize=100M -XX:+UseG1GC -XX:MaxGCPauseMillis=100 -Xloggc:/servers/java/op-store/tomcat7-store-8600-node1/logs/gc.log -XX:-HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/servers/java/op-store/tomcat7-store-8600-node1/logs/HeapDumpOnOutOfMemoryError"





