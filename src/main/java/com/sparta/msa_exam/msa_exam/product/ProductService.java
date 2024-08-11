package com.sparta.msa_exam.msa_exam.product;

import com.sparta.msa_exam.msa_exam.core.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final Logger log = LoggerFactory.getLogger(ProductService.class);

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(Product product) {
        productRepository.save(product);
        log.info("상품 생성 완료: name: {}, supplyPrice: {}", product.getName(), product.getSupplyPrice());
    }

    public List<Product> getProducts(Pageable pageable) {
        Page<Product> products = productRepository.findAll(pageable);
        return products.getContent();
    }

    public boolean containsById(Long productId) {
        return productRepository.existsById(productId);
    }

}
