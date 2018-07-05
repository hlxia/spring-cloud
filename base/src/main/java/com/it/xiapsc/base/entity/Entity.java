package com.it.xiapsc.base.entity;

/**
 * A abstract entity classes for by all entity classes.
 *
 * @author hlxia
 * @version 1.0
 * @since  2018-7-5
 */
public abstract class Entity<T> {

    /**
     * @serialField id
     */
    private T id;

    /**
     * @serialField name
     */
    private String name;


    /**
     * Gets the id of this entity
     *
     * @return The entity id
     */
    public T getId() {
        return id;
    }

    /**
     * Sets the Id of this entity
     *
     * @param <T> id entity id
     */
    public void setId(T id) {
        this.id = id;
    }

    /**
     * Gets the if of this entity
     *
     * @return The entity name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the id of this entity
     *
     * @param string id entity name
     */
    public void setName(String name) {
        this.name = name;
    }
}
