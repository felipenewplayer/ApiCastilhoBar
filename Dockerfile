# Etapa de Build: Maven + JDK 17
FROM maven:3.8.4-openjdk-17-slim AS build-stage

# Definir o diretório de trabalho
WORKDIR /app

# Copiar todos os arquivos do projeto para o container
COPY . /app

# Rodar o Maven para compilar e gerar o JAR
RUN mvn clean install -DskipTests

# Etapa de Execução: OpenJDK 17
FROM openjdk:17-slim

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o JAR gerado na etapa de build para a etapa de execução
COPY --from=build-stage /app/target/*.jar app.jar

# Expor a porta que a aplicação vai rodar
EXPOSE 8080

# Comando para rodar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
