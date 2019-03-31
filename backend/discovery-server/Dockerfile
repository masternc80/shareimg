FROM openjdk:10-jdk
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} target/discovery-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/discovery-server-0.0.1-SNAPSHOT.jar"]