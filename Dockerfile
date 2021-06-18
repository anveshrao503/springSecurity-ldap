FROM openjdk:9
ADD target/practiceRestpoints-0.0.1-SNAPSHOT.jar practiceRestpoints-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "practiceRestpoints-0.0.1-SNAPSHOT.jar"]