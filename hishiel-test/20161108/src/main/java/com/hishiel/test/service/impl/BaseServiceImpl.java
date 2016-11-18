package com.hishiel.test.service.impl;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.hishiel.test.dao.IBaseDao;
import com.hishiel.test.service.IBaseService;

/**
 * 服务层实现类基类
 * 
 * 所有服务层接口实现类继承此类，且必须覆盖抽象方法getBaseDao()，以便在基础方法中获取与数据库交互的dao对象
 * 
 * 例子：
 * 
 * @author hishiel
 * @since 2016年11月8日下午1:10:11
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

	protected abstract IBaseDao<T> getBaseDao();

	@Override
	public T getById(int id) {
		return this.getBaseDao().getById(id);
	}

	@Override
	public List<T> getAll(int pageIndex) {
		if (pageIndex > 0) {
			int pageSize = (pageIndex == 0) ? 0 : 10;
			PageHelper.startPage(pageIndex, pageSize);
		}
		return this.getBaseDao().getAll();
	}

	@Override
	public int insert(T entity) {
		return this.getBaseDao().insert(entity);
	}

	@Override
	public int batchInsert(List<T> entities) {
		return this.getBaseDao().batchInsert(entities);
	}

	@Override
	public int update(T entity) {
		return this.getBaseDao().update(entity);
	}

	@Override
	public int delete(int id) {
		return this.getBaseDao().delete(id);
	}

	@Override
	public int batchDelete(List<Integer> ids) {
		return this.getBaseDao().batchDelete(ids);
	}

	@Override
	public List<T> find(T entity) {
		return this.getBaseDao().find(entity);
	}

}
