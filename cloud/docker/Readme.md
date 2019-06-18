# Testing **Car Rating** project on Docker

## Description

For this test, the Docker installation provided by Minikube (on Linux Mint 19) was used

The project has 3 microservices
- car-catalog-service
- car-info-service
- rating-data-service
Each service has its own directory 

In order to create the Docker images for each service, under each directory you will need:
- Dockerfile
- Java jar file for the service     (e.g.: car-catalog-service-0.0.1-SNAPSHOT.jar)
- JDK                               (e.g.: jdk-8u211-linux-x64.tar.gz)

## Steps

![Directory structure](directory-structure.jpg)

- Get the components to create each Docker image
  - Download the appropiate **JDK** version to run each component (e.g.: **jdk-8u211-linux-x64.tar.gz**)
  - Get the proper microservice packaged as **jar file**          (e.g.: **car-catalog-service-0.0.1-SNAPSHOT.jar**)
- Run the image build scripts (**module-build**) for each module (e.g.: **module-build car-catalog-service**)
- Start the Docker container for each microservice
  - module-run-main car-catalog-service
  - module-run car-info-service
  - module-run rating-data-service
- Obtain the IP address to be used during test
  - If calling from outside minikube, use **minikube status**
  - If calling from inside minikube (**minikube ssh**), use **localhost**
- Test each microservice
  - car-catalog-service   http://localhost:8081/catalog/user/1
  - car-info-service      http://localhost:8082/CarDesc/1
  - rating-data-service   http://localhost:8083/rating/byuser/1 

