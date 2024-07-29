package com.qungx.ecommerce.customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public String createCustomer(CustomerRequest request) {
        return null;
    }
}
