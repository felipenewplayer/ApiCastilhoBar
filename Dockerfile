# Use a imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Defina o diretório de trabalho no container
WORKDIR /app

# Copie o arquivo .jar para o diretório de trabalho do container
COPY target/burguerApi-0.0.1-SNAPSHOT.jar /app/burguerApi.jar

# Comando para rodar o .jar
CMD ["java", "-jar", "burguerApi.jar"]

# Exponha a porta em que o aplicativo irá rodar
EXPOSE 8080
