package com.hishiel.test.service;

import java.util.List;

/**
 * 服务层基础接口，所有服务接口需继承此接口
 * 
 * @author hishiel
 * @since 2016年11月8日下午1:04:37
 */
public interface IBaseService<T> {

	/**
	 * 规则Id值查询相应的数据记录
	 * 
	 * @param id
	 * @return T
	 */
	public T getById(int id);

	/**
	 * 获取数据表中所有记录，如果参数pageIndex不为0，则返回指定页面数据，否则返回所有数据
	 * 
	 * @param pageIndex
	 *            页面索引，0表示不分页
	 * @return
	 */
	public List<T> getAll(int pageIndex);

	/**
	 * 将输入插入到数据表中
	 * 
	 * @param entity
	 * @return 写入成功的记录条数
	 */
	public int insert(T entity);

	/**
	 * 将数据批量插入到数据表中
	 * 
	 * @param entities
	 * @return 写入成功的记录条数
	 */
	public int batchInsert(List<T> entities);

	/**
	 * 更新数据表中记录
	 * 
	 * @param entity
	 * @return 更新成功的记录条数
	 */
	public int update(T entity);

	/**
	 * 删除指定id的数据表记录
	 * 
	 * @param entity
	 * @return 删除的记录条数
	 */
	public int delete(int id);

	/**
	 * 批量删除数据表记录
	 * 
	 * @param ids
	 * @return 删除的记录条数
	 */
	public int batchDelete(List<Integer> ids);

	/**
	 * 查找符合条件的记录
	 * 
	 * @param entity
	 * @return
	 */
	public List<T> find(T entity);

}
