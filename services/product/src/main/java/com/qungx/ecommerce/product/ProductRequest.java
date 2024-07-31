package com.qungx.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest (
         Integer id,
         @NotNull(message = "Product name cannot be null")
         String name,
         @NotNull(message = "Product message cannot be null")
         String description,
         @Positive(message = "Product avail quantity should be positive")
         double availableQuantity,
         @Positive(message = "Product price quantity should be positive")
         BigDecimal price,
         @NotNull(message = "CategoryId should not be null")
        Integer categoryId
) {
}
