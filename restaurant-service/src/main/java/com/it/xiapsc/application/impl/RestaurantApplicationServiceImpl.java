package com.it.xiapsc.application.impl;

import com.it.xiapsc.application.RestaurantApplicationService;
import org.springframework.stereotype.Service;

/**
 * Restaurant application service interface implementation classes.
 */
@Service
public class RestaurantApplicationServiceImpl implements RestaurantApplicationService {

  @Override
  public String test() {
    return "successful...";
  }
}
