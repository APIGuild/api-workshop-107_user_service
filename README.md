# api-workshop-107_user_service
Build Eureka-Client(user-service)

1.add eureka-client dependencies

    compile('org.springframework.cloud:spring-cloud-starter-eureka')
    compile('org.springframework.boot:spring-boot-starter-actuator')
    compile('org.springframework.boot:spring-boot-starter-aop')
    compile('org.springframework.boot:spring-boot-starter-web')
    
2. add annotations to enable eureka-client


    @SpringBootApplication
    @EnableEurekaClient
    
3. config properties

    
    server.port=10001
    spring.application.name=user-service
    eureka.client.service-url.defaultZone=http://localhost:10000/eureka/
         
4. add ZipKin dependencies

    
    compile('org.springframework.cloud:spring-cloud-starter-zipkin')

5. config ZipKin properties


    spring.zipkin.base-url=http://localhost:20000
    spring.zipkin.enabled=true
    spring.sleuth.sampler.percentage=1
    
6. add spring-cloud-config dependencies


	compile('org.springframework.cloud:spring-cloud-starter-config')

7. enable config properties


    spring.cloud.config.label=master
    spring.cloud.config.profile=dev
    spring.cloud.config.discovery.service-id=config-server
    
    endpoints.restart.enabled=true
    management.security.enabled=false
    
    
