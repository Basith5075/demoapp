FROM eclipse-temurin:17
EXPOSE 8000
COPY target/helloSpring-0.0.1-SNAPSHOT.jar demoapp.jar
ENTRYPOINT ["java","-jar","/demoapp.jar"]