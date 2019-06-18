# Testing **Car Rating** project on Kubernetes

## Description

For this test, Minikube (on Linux Mint 19) was used

Docker images has been already created
- car-catalog-service:latest
- car-info-service:latest
- rating-data-service:latest

## Steps

Create a namespace 
- car-rating-namespace.yaml

Creating deployments and services : Each service will have its own 
- deployment
  - car-catalog.yaml
  - car-info.yaml
  - rating-data.yaml
- service
  - car-catalog-service.yaml
  - car-info-service.yaml
  - rating-data-service.yaml

  NOTE: Use command:   **kubectl apply -f <filename>**

Testing pods
- Make pod accessible from the hosting server using **port-forward** verb . E.g.:

  **kubectl port-forward pod/car-catalog-75698c84d7-fr4hf 8081:8081**

- Test each microservice from hosting server. E.g.:

  - **curl http://localhost:8081/catalog/user/1**

  - **curl http://localhost:8082/CarDesc/1**

  - **curl http://localhost:8083/rating/byuser/1**

Testing services
- Start a shell in a running pod (E.g.: a pod like car-catalog)

  **kubectl exec -it car-catalog-75698c84d7-fr4hf -- /bin/bash**

- Test a service (from the shell started before)
  
  - **curl http://car-info-service.car-rating:80/CarDesc/1**

  - **curl http://car-info-service.car-rating/CarDesc/1**

  - **curl http://car-info-service/CarDesc/1**

  NOTE: **ServiceName:80** (e.g.: car-info-service.car-rating:80 ) can be obtained from **service** description 

    Use **kubectl get services -n car-rating** 

