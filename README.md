


== To Run this Project

docker run -d -p 8300:8300 -p 8301:8301 -p 8301:8301/udp -p 8302:8302 -p 8302:8302/udp -p 8400:8400 -p 8500:8500 progrium/consul -advertise 172.17.0.2 -join 192.168.33.10

java -Dspring.cloud.consul.host=172.17.0.2 -Dspring.cloud.consul.port=8500 -Dspring.cloud.consul.config.enabled=true  -jar build/libs/microservice-min-0.0.1-SNAPSHOT.jar