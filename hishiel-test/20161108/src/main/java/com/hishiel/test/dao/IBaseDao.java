package com.hishiel.test.dao;

import java.util.List;

/**
 * DAO基类接口
 * 
 * 使用此接口规范Mybatis映射文件中相应元素的id命名，所有映射文件接口需继承此接口
 * 
 * @author hishiel
 * @since 2016年11月8日上午11:40:24
 */
public interface IBaseDao<T> {

	/**
	 * 规则Id值查询相应的数据记录
	 * 
	 * @param id
	 * @return T
	 */
	public T getById(int id);

	/**
	 * 获取数据表中所有记录
	 * 
	 * @return List
	 */
	public List<T> getAll();

	/**
	 * 将数据插入到数据表中
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
	 * @param id
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
