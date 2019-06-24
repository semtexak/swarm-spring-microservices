FROM openjdk:8-jre-alpine
ADD target/bundle.jar bundle.jar
CMD java -XX:+PrintFlagsFinal $JAVA_OPTIONS -jar /bundle.jar
