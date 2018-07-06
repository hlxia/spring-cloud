package com.it.xiapsc.base.service;

import com.it.xiapsc.base.repository.Repository;

import java.util.Collection;

/**
 * <code>Repository</code> is the base class for all repository classes
 *
 * @author hlxia
 * @version 1.0
 * @see ReadOnlyService
 * @see WriteOnlyService
 * @since 2018-7-5
 */
public class BaseService<Entity, T> implements ReadOnlyService<Entity, T>, WriteOnlyService<Entity, T> {

    private Repository<Entity, T> repository;

    public BaseService(Repository<Entity, T> repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Entity> get(Entity e) {
        return this.repository.find(e);
    }

    @Override
    public Entity getById(T id) {
        return this.repository.findById(id);
    }

    @Override
    public Entity getByName(T name) {
        return this.repository.findByName(name);
    }

    @Override
    public Collection<Entity> getAll() {
        return this.repository.findAll();
    }

    @Override
    public void add(Entity e) {
        this.repository.insert(e);
    }

    @Override
    public void change(Entity e) {
        this.repository.update(e);
    }

    @Override
    public void remove(T id) {
        this.repository.delete(id);
    }
}
