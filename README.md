# Spring-Boot-User-Management

#Steps to configure Eureka and Zuul with Spring boot applications

1. Launch Eureka Server
2. Configure "eureka.client.service-url.default-zone=http://localhost:8761/eureka" in Zuul
   and other micro-services. This property needs to be configured in "application.properties".
3. Launch Zuul and other micro-services.
4. Once these applications (including zuul) launched successfully, there instances will be registered in Eureka.
5. Start sending your request via zuul API gateway. This way we are routing, our API via zuul.

URL will look like

http://{zuul host:<zuul server port>}/{spring-application-name}/{parameter}

example
http://localhost:8762/user-management-service/user

localhost:8762 - zuul application running on this host.

user-management-service- configured in application.properties.

user- GET mapping configured in UserManagementController class.

Note: Ribbon is being used within zuul which is used for load balancer.

