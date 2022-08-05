package com.example.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.controller.CustomerController;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerRestControllerTest {

  @Autowired
  private CustomerController controller;

  @Test
  public void controllerInitializedCorrectly() {
    assertThat(controller).isNotNull();
  }
}