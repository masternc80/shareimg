FROM alpine-jdk:base
MAINTAINER javaonfly
COPY target/discovery-server-0.0.1-SNAPSHOT.jar /var/lib/
RUN mkdir /var/lib/logs
ENTRYPOINT ["/usr/bin/java"]
ENV catalina.home=/var/lib
CMD ["-jar", "/var/lib/discovery-server-0.0.1-SNAPSHOT.jar"]
VOLUME /tmp
VOLUME /var/lib/logs
