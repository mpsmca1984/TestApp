#ereka -server docker images
FROM java:8
VOLUME /tmp
ADD target/ereka-server-0.0.1-SNAPSHOT.jar /ereka-server.jar
EXPOSE 8071
ENTRYPOINT ["java","-jar","/ereka-server.jar"]