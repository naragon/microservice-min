#  A Simple Service Consul Registration Example

To run this example it is easiest with Docker:

* Checkout the source: `git clone git://github.com/naragon/microservice-min.git` 
* Run Consul docker instance: `docker run -d -p 8400:8400 -p 8500:8500 -p 8600:53/udp -h node1 progrium/consul -server -bootstrap`
* Run Java application: `java -Dspring.cloud.consul.host=172.17.0.2 -Dspring.cloud.consul.port=8500 -Dspring.cloud.consul.config.enabled=true  -jar build/libs/microservice-min-0.0.1-SNAPSHOT.jar`
