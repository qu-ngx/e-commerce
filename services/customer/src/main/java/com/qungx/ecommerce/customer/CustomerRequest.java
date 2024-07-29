package com.qungx.ecommerce.customer;

import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname required")
        String firstname,
        @NotNull(message = "Customer lastname required")
        String lastname,
        @NotNull(message = "Customer email required")
        String email,
        @NotNull(message = "Customer address required")
        Address address
) {

}