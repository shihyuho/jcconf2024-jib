FROM eclipse-temurin:21-jre-alpine
COPY ./target/demo-1.0.0.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
