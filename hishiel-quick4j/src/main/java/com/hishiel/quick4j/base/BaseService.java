package com.hishiel.quick4j.base;

/**
 * @所有自定义Service的顶级接口
 * @封装常用的增删改查操作
 * @T代表数据库中的表映射的Java对象类型
 * @PK代表对象的主键类型
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:33:22
 */
public interface BaseService<T, PK> {

	/**
	 * 根据主键查询对象
	 */
	T selectById(PK id);

	/**
	 * 根据主键删除对象
	 */
	int delete(PK id);

	/**
	 * 插入对象
	 */
	int insert(T entity);

	/**
	 * 更新对象
	 */
	int update(T entity);

}
