package com.example.microservices.product_service.Service;

import com.example.microservices.product_service.Repository.ProductRepository;
import com.example.microservices.product_service.dto.ProductRequest;
import com.example.microservices.product_service.dto.ProductResponse;
import com.example.microservices.product_service.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.name());
        product.setDescription(productRequest.description());
        product.setPrice(productRequest.price());
        productRepository.save(product);
        return new ProductResponse(product.getId(), product.getName(), product.getDescription(),product.getPrice());





    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> new ProductResponse(product.getId(), product.getName(), product.getDescription(),
                        product.getPrice()))
                .toList();

    }
}
