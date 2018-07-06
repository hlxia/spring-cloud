package com.it.xiapsc.base.assembler;

import org.springframework.util.ObjectUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * An abstract base classes for all <code>DTO</code> assembler classes
 *
 * @param <Entity> Entity classes
 * @param <DTO> DTO Classes
 *
 * @author hlxia
 * @version 1.0
 * @since 2018-7-6
 */
public abstract class AbstractDTOAssembler<Entity, DTO> {

  /**
   * Convert single entity to <code>DTO</code> object.
   *
   * @param entity {Object} entity object
   * @return DTO object
   * @author hlxia
   * @version 1.0
   * @since 2018/7/6
   */
  public abstract DTO toDTO(Entity entity);

  /**
   * Convert entity list to <code>DTO</code> list
   *
   * @param entitys The entity list
   * @return DTO list
   * @author hlxia
   * @version 1.0
   * @since 2018/7/6
   */
  public Collection<DTO> toDTOList(List<Entity> entitys) {
    if (!ObjectUtils.isEmpty(entitys)) {
      final List<DTO> dtoList = new ArrayList<DTO>(entitys.size());
      for (Entity entity : entitys) {
        dtoList.add(this.toDTO(entity));
      }
    }
    return null;
  }

}
