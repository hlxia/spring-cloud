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
     * Gets single entity by id
     *
     * @param id T entity id
     * @return entity
     */
    Entity get(T id);

    /**
     * Gets all entity
     *
     * @return entity list
     */
    Collection<Entity> getAll();

    /**
     * Checking the entity exists
     *
     * @param id T entity id
     * @return exists return true, otherwise return false
     */
    boolean contains(T id);
}
