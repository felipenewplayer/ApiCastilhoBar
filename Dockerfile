FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/burguerApi-0.0.1-SNAPSHOT.jar /app/burguerApi-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/burguerApi-0.0.1-SNAPSHOT.jar"]
