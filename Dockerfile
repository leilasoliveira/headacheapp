FROM alpine:3.22.0
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} headacheapp.jar
ENTRYPOINT ["java","-jar","/headacheapp.jar"]