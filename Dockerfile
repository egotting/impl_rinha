FROM eclipse-temurin:21 AS builder

WORKDIR /app
COPY . .

RUN chmod +x mvnw && ./mvnw clean package -DskipTests
FROM gcr.io/distroless/java21-debian11

COPY --from=builder /app/target/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
