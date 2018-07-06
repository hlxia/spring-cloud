package com.it.xiapsc.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Restaurant Controller.
 */
@RestController
@RequestMapping("restaurant")
public class RestaurantController extends BaseController {

  @GetMapping("/test")
  public void test() {
    this.serviceFactory().restaurantService();
  }
}
