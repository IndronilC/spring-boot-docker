FROM openjdk:8
ADD /build/libs/spring-boot-docker-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]