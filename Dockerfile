FROM maven:3.9.9-eclipse-temurin-22 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package -Dmaven.test.skip

FROM eclipse-temurin:22-jdk-alpine

ENV APP_HOME=/usr/app

WORKDIR $APP_HOME

RUN apk update && apk add bash --no-cache

COPY --from=builder /app/target/*.jar ./app.jar

EXPOSE 8080

CMD ./start.sh
