FROM fabric8/java-alpine-openjdk8-jre
ADD ["target/micro-gateway-service-0.0.1-SNAPSHOT.jar", "app.jar"]
EXPOSE 8180 8787
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /app.jar" ]