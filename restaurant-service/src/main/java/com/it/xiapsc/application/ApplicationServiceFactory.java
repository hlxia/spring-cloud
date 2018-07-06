package com.it.xiapsc.application;

import com.it.xiapsc.application.impl.RestaurantApplicationServiceImpl;


/**
 * An application service factory classes
 *
 * @author hlxia
 * @version 1.0
 * @since 2018/7/6
 */
public class ApplicationServiceFactory {

  /**
   * Restaurant application service
   *
   * @return RestaurantApplicationService
   * @author hlxia
   * @version 1.0
   * @since 2018/7/6
   */
  public RestaurantApplicationService restaurantService() {
    return new RestaurantApplicationServiceImpl();
  }
}