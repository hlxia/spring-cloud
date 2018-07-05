package com.it.xiapsc.base.entity;

/**
 *  A abstract base classes for all classes.
 *
 * @author hlxia
 * @version 1.0
 * @see Entity
 * @since 2017-7-5
 */
public abstract class BaseEntity<T> extends Entity<T> {

    /**
     * Constructor method of the <code>BaseEntity</code> classes.
     *
     * @param id
     * @param name
     */
    public BaseEntity(T id, String name) {
        super.setId(id);
        super.setName(name);
    }
}
