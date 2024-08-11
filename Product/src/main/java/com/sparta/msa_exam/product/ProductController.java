package com.sparta.msa_exam.product;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void createProduct(@RequestBody CreateProductRequest request) {
        Product product = request.toEntity();
        productService.createProduct(product);
    }

    @GetMapping
    public List<ProductResponse> getProduct(Pageable pageable) {
        List<Product> products = productService.getProducts(pageable);
        return products.stream()
                .map(ProductResponse::new)
                .toList();
    }

    @GetMapping("/{productId}")
    public Boolean isExistingProduct(@PathVariable("productId") Long productId) {
        return productService.containsById(productId);
    }

}
