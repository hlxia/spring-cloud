package com.it.xiapsc.domain.mode.aggregate;

import com.it.xiapsc.base.entity.BaseEntity;

/**
 * Restaurant entity classes, aggregation of all entities classes.
 *
 * @author hlxia
 * @version 1.0
 * @see BaseEntity
 * @since 2018-7-5
 */
public class Restaurant extends BaseEntity<String> {

    /**
     * Constructor method of the <code>Restaurant</code> classes.
     *
     * @param id String the entity id.
     * @param name String the entity name
     */
    public Restaurant(String id, String name) {
        super(id, name);
    }
}
