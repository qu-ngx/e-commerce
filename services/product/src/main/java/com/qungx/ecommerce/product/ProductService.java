package com.qungx.ecommerce.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    public Integer createProduct(ProductRequest request) {
        return null;
    }

    public List<ProductPurchaseRequest> purchaseProducts(List<ProductPurchaseRequest> request) {
        return null;
    }

    public ProductResponse findById(Integer productId) {
        return null;
    }


    public List<ProductResponse> findAll() {
        return null;
    }
}