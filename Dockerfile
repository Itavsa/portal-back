FROM maven:3.9-amazoncorretto-20 AS maven
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn package -Dmaven.test.skip

FROM amazoncorretto:20.0.0-alpine3.17
WORKDIR /opt/app
COPY --from=maven /usr/src/app/target/portal-0.0.1-SNAPSHOT.jar /opt/app/
ENTRYPOINT ["java","-jar","portal-0.0.1-SNAPSHOT.jar"]