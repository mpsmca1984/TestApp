#ereka -server docker images
FROM java:8
VOLUME /tmp
ADD target/employee-producer-0.0.1-SNAPSHOT.jar /employee-producer.jar
EXPOSE 8070
ENTRYPOINT ["java","-jar","/employee-producer.jar"]