FROM openjdk:17-jdk-alpine

COPY target/MetricsExposer-1.0-SNAPSHOT.jar MetricsExposer.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/MetricsExposer.jar"]