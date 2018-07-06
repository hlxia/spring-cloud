package com.it.xiapsc.base.controller;

import com.it.xiapsc.tookit.SpringContextUtil;
import java.lang.reflect.ParameterizedType;

/**
 * <code>AbstractController</code> is abstract base classes for all controller classes
 *
 * @author hlxia
 * @version 1.0
 * @since 2018/7/6
 * @see
 */
public abstract class AbstractController<ApplicationService> {

  ApplicationService service = null;

  /**
   * A factory generator of the application service
   *
   * @return A application service factory instance
   * @author hlxia
   * @version 1.0
   * @since 2018/7/6
   */
  public synchronized ApplicationService service() {
    if (null == service) {
      try {
        service = (ApplicationService) SpringContextUtil.getBean(getClazz());
      } catch (Exception ex) {
        throw new RuntimeException("Gets application service failed:" + ex);
      }
    }
    return service;
  }

  private Class<?> getClazz() {
    return (Class<?>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }
}
