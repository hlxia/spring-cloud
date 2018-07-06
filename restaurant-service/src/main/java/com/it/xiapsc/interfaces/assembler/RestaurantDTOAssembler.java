package com.it.xiapsc.interfaces.assembler;

import com.it.xiapsc.base.assembler.AbstractDTOAssembler;
import com.it.xiapsc.domain.mode.aggregate.Restaurant;
import com.it.xiapsc.interfaces.dto.RestaurantDTO;

public class RestaurantDTOAssembler extends AbstractDTOAssembler<Restaurant, RestaurantDTO> {

  @Override
  public RestaurantDTO toDTO(Restaurant restaurant) {
    return null;
  }
}
