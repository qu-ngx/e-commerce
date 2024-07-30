package com.qungx.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductPurchaseRequest(
         Integer id,
         @NotNull(message = "Product name is required")
         String name,
         @NotNull(message = "Product description name is required")
         String description,
         @Positive(message = "Product avail quantity should be positive")
         double availableQuantity,
         @Positive(message = "Product price should be positive")
         BigDecimal price,
         @NotNull(message = "Product  name is required")
         Integer categoryId
) {
}
