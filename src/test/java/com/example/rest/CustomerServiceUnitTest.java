package com.example.rest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.model.Customer;
import com.example.repo.CustomerRepo;
import com.example.service.CustomerService;



@SpringBootTest
public class CustomerServiceUnitTest {

    @Autowired
    private CustomerService service;
    @MockBean
    private CustomerRepo repo;
    @Test
    void testCreate(){
        // GIVEN is our testing data - you can make this a final local variable if you want, e.g.:
        final Customer TEST_CUSTOMER = new Customer(1, "konain", "bukhari", "kona", "12345", 999999999, "Kona@Gmail.com", "London","female");
        final Customer TEST_SAVED_CUSTOMER = new Customer( 1, "konain", "bukhari", "kona", "12345", 999999999, "Kona@Gmail.com", "London","female");
        // WHEN
        Mockito.when(this.repo.save(TEST_CUSTOMER)).thenReturn(TEST_SAVED_CUSTOMER);
        // THEN
        Assertions.assertThat(this.service.addCustomer(TEST_CUSTOMER)).isEqualTo(TEST_SAVED_CUSTOMER);
        // verify that our repo was accessed exactly once
        Mockito.verify(this.repo, Mockito.times(1)).save(TEST_CUSTOMER);
    }

}

