FROM openjdk:8-jdk-alpine

LABEL 	org.opencontainers.image.title="Customer Service Container OCL-001" \
		org.opencontainers.image.description="Customer micro service with basic infomation" \
		org.opencontainers.image.author="@Sakeb"

ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} customer-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/customer-0.0.1-SNAPSHOT.war"]