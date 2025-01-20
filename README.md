# Creating our First Microservice: Product Service 

# PART 1: building REST-based applications using Spring Boot 3 
Let's start creating our first microservice (Product Service). We will keep this service simple and only include the most important features.

## We are going to expose a REST API endpoint that will CREATE and READ products.

- Service Operation	HTTP METHOD	   Service End point
- CREATE PRODUCT	       POST	           /api/product/
- READ ALL PRODUCTS	GET	            /api/product/

## Dependencies you need to add:
- Lombok
- Spring Web
- Test Containers
- Spring Data MongoDB
- Java 21
- Maven as the build tool

# Here is the architecture diagram of the project.
![Micro-Servicess](https://github.com/user-attachments/assets/d2eb6660-0820-4fb0-babe-0630380ae5d6)

