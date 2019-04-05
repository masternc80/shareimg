FROM alpine-jdk:base
MAINTAINER javaonfly
COPY target/config-server-0.0.1-SNAPSHOT.jar /opt/lib/
RUN mkdir /var/lib/config-repo
COPY Config /var/lib/config-repo
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/config-server-0.0.1-SNAPSHOT.jar"]
VOLUME /var/lib/config-repo
