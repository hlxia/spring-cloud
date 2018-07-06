package com.it.xiapsc.base.service;

import java.util.Collection;

/**
 * <code>ReadOnlyService</code> is the base class for all service classes
 * Read-only operation interface classes(Select)
 *
 * @author hlxia
 * @version 1.0
 * @since 2018-7-5
 */
public interface ReadOnlyService<Entity, T> {

    /**
     * Gets entity list by entity
     *
     * @param e entity object
     * @return  entity list
     */
    Collection<Entity> get(Entity e);

    /**
     * Gets single entity by id
     *
     * @param id T entity id
     * @return entity
     */
    Entity getById(T id);

    /**
     * Gets single entity by name
     *
     * @param id T entity name
     * @return entity
     */
    Entity getByName(T name);

    /**
     * Gets all entity
     *
     * @return entity list
     */
    Collection<Entity> getAll();

}
