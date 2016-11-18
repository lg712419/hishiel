package com.hishiel.quick4j.base;

/**
 * @所有自定义DAO的顶级接口
 * @封装常用的增删改查操作
 * @T代表数据库中的表映射的Java对象类型
 * @PK代表对象的主键类型
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:30:35
 */
public interface BaseDao<T, PK> {

	/**
	 * 根据主键查询对象
	 */
	T selectByPrimaryKey(PK id);

	/**
	 * 根据主键删除对象
	 */
	int delete(PK id);

	/**
	 * 插入对象
	 */
	int insertSelective(T entity);

	/**
	 * 更新对象
	 */
	int updateSelective(T entity);
}
