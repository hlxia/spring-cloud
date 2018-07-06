package com.it.xiapsc.interfaces;

import com.it.xiapsc.application.RestaurantApplicationService;
import com.it.xiapsc.base.controller.AbstractController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Restaurant controller classes.
 */
@RestController
@RequestMapping("/restaurant")
public class RestaurantController extends AbstractController<RestaurantApplicationService> {

  @GetMapping("/test")
  public String test() {
    return this.service().test();
  }
}
