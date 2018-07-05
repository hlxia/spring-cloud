package com.it.xiapsc.base.service;

/**
 * <code>WriteOnlyService</code> is the base class for all repository classes
 * Write-only operation interface classes(Insert, Update, Delete)
 *
 * @author hlxia
 * @version 1.0
 * @since 2018-7-5
 */
public interface WriteOnlyService<Entity, T> {

    /**
     * Add entity(Basic method)
     *
     * @param e single entity object
     */
    void add(Entity e);

    /**
     * Update entity (Basic method)
     *
     * @param e single entity object
     */
    void update(Entity e);

    /**
     * Remove entity by entity id(Basic method)
     *
     * @param id entity id
     */
    void remove(T id);


}
