package com.it.xiapsc.domain.repository;

import com.it.xiapsc.base.entity.Entity;
import com.it.xiapsc.base.repository.Repository;

/**
 * <code>RestaurantRepository</code> classes for the Restaurant repository
 *
 * @author hlxia
 * @version 1.0
 * @see Repository
 * @since  2018-7-5
 */
public interface RestaurantRepository<Restaurant,String> extends Repository<Restaurant,String> {

    /**
     * Gets <code>Restaurant</code> entity by name
     *
     * @param name restaurant name
     * @return Restaurant
     */
     Entity findByName(String name);
}
