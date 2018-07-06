package com.it.xiapsc.interfaces;

import com.it.xiapsc.application.ApplicationServiceFactory;

/**
 * <code>BaseController</code> is base classes for all controller classes
 *
 * @author hlxia
 * @version 1.0
 * @since 2018/7/6
 * @see
 */
public class BaseController {

  /**
   * @field A factory of the application service
   */
  private ApplicationServiceFactory serviceFactory = null;

  /**
   * A factory generator of the application service
   *
   * @return A application service factory instance
   * @author hlxia
   * @version 1.0
   * @since 2018/7/6
   */
  public ApplicationServiceFactory serviceFactory() {
    synchronized (serviceFactory) {
      if (null == serviceFactory) {
        serviceFactory = new ApplicationServiceFactory();
      }
      return serviceFactory;
    }
  }

}
