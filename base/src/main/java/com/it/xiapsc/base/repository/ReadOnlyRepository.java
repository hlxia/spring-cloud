package com.it.xiapsc.base.repository;

import java.util.Collection;

/**
 * <code>WriteOnlyRepository</code> is the base class for all repository classes
 * Read-only operation interface classes(Select)
 *
 * @author hlxia
 * @version 1.0
 * @since 2018-7-5
 */
public interface ReadOnlyRepository<Entity, T> {

    /**
     * Gets entity list by entity
     *
     * @param e entity object
     * @return  entity list
     */
    Collection<Entity> find(Entity e);

    /**
     * Gets single entity by id
     *
     * @param id T entity id
     * @return entity
     */
    Entity findById(T id);

    /**
     * Gets single entity by name
     *
     * @param id T entity name
     * @return entity
     */
    Entity findByName(T name);

    /**
     * Gets all entity
     *
     * @return entity list
     */
    Collection<Entity> findAll();
}
