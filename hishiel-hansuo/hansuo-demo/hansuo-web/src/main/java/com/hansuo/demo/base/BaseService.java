package com.hansuo.demo.base;

import java.util.List;

/**
 * @所有自定义Service的顶级接口
 * @封装常用的增删改查操作
 * @T代表数据库中的表映射的Java对象类型
 * @PK代表对象的主键类型
 * 
 * @author hishiel
 * @since Oct 31, 20163:38:26 PM
 */
public interface BaseService<T, PK> {

	/**
	 * 插入对象
	 */
	int insert(T model);

	/**
	 * 更新对象
	 */
	int update(T model);

	/**
	 * 根据主键删除对象
	 */
	int delete(PK id);

	/**
	 * 根据主键查询对象
	 */
	T selectById(PK id);

	/**
	 * 查询单个对象
	 */
	T selectOne();

	/**
	 * 查询多个对象
	 */
	List<T> selectList();
}
