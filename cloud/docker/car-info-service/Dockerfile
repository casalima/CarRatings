FROM fedora:modular

LABEL author="Sandro Cardenas"

RUN mkdir /sandro
WORKDIR /sandro
ADD jdk-8u211-linux-x64.tar.gz ./ 

ENV JAVA_HOME /sandro
ENV PATH $PATH:/sandro/jdk1.8.0_211/bin 

ADD car-info-service-0.0.1-SNAPSHOT.jar .

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "car-info-service-0.0.1-SNAPSHOT.jar" ]
