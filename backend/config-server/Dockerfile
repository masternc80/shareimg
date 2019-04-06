FROM alpine-jdk:base
MAINTAINER javaonfly
COPY target/config-server-0.0.1-SNAPSHOT.jar /var/lib/
RUN mkdir /var/lib/config-repo
RUN mkdir /var/lib/logs
ENV logsfolder=/var/lib/logs
COPY Config /var/lib/config-repo
ENTRYPOINT ["/usr/bin/java"]
CMD ["-Dlogsfolder=${logsfolder}", "-jar", "/var/lib/config-server-0.0.1-SNAPSHOT.jar"]
VOLUME /var/lib/config-repo
