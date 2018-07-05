package com.it.xiapsc.base.service;

/**
 * <code>Repository</code> is the base class for all repository classes
 *
 * @author hlxia
 * @version 1.0
 * @see ReadOnlyService
 * @see WriteOnlyService
 * @since 2018-7-5
 */
public abstract class BaseService<Entity, T> implements ReadOnlyService<Entity, T>, WriteOnlyService<Entity, T> {
}
