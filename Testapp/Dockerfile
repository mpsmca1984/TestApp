FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /target/Testapp-0.0.1-SNAPSHOT.jar Testapp.jar
ENTRYPOINT ["java","-jar","/Testapp.jar"]