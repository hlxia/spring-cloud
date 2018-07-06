package com.it.xiapsc.domain.service;

import com.it.xiapsc.base.repository.Repository;
import com.it.xiapsc.base.service.BaseService;
import com.it.xiapsc.domain.mode.aggregate.Restaurant;

public class RestaurantService extends BaseService<Restaurant, String> {

    public RestaurantService(Repository<Restaurant, String> repository) {
        super(repository);
    }
}
