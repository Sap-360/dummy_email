FROM openjdk:11
WORKDIR /app
ADD target/spring-dummy-email.jar app.jar
ADD entrypoint.sh entrypoint.sh
EXPOSE 8081 5005
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
ENTRYPOINT ["sh","./entrypoint.sh"]