# Creating our First Microservice: Product Service 

# PART 1: building REST-based applications using Spring Boot 3 
Let's start creating our first microservice (Product Service). We will keep this service simple and only include the most important features.

## We are going to expose a REST API endpoint that will CREATE and READ products.

Service Operation	HTTP METHOD	   Service End point
CREATE PRODUCT	       POST	           /api/product/
READ ALL PRODUCTS	GET	            /api/product/

## Dependencies you need to add:
Lombok
Spring Web
Test Containers
Spring Data MongoDB
Java 21
Maven as the build tool

# Here is the architecture diagram of the project.
![Screenshot from 2025-01-16 12-35-45](https://github.com/user-attachments/assets/494a4691-8082-4f15-955a-986cac1731d5)
