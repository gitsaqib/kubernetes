FROM maven:3.8.4-jdk-8-slim

LABEL 	org.opencontainers.image.title="Customer Service Container OCL-001" \
	org.opencontainers.image.description="Customer micro service with basic infomation" \
	org.opencontainers.image.author="@Sakeb"

ENV PORT 8080

COPY kubernetes/services/customer/ /

RUN mvn clean install

COPY target/customer-0.0.1-SNAPSHOT.war customer-0.0.1-SNAPSHOT.war

ENTRYPOINT ["java","-jar","/customer-0.0.1-SNAPSHOT.war"]
