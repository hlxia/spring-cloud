package com.it.xiapsc.base.repository;

/**
 * <code>Repository</code> is the base class for all repository classes
 *
 * @author hlxia
 * @version 1.0
 * @see ReadOnlyRepository
 * @see WriteOnlyRepository
 * @since 2018-7-5
 */
public interface Repository<Entity, T> extends ReadOnlyRepository<Entity, T>, WriteOnlyRepository<Entity, T> {
}
