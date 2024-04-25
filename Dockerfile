FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/helloworld-0.0.1-SNAPSHOT.jar /app/helloworld-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/helloworld-0.0.1-SNAPSHOT.jar"]
