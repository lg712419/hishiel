package com.hansuo.demo.base;

/**
 * @后续待完善 //TODO
 * 
 * @NOTE请手动编码然后继承该BaseDao
 * @NOTE可通过Maven插件自动生成DAO待考虑是否实现 - //TODO by hishiel
 * 
 * @所有自定义DAO的顶级接口
 * @封装常用的增删改查操作
 * @T代表数据库中的表映射的Java对象类型
 * @PK代表对象的主键类型
 * 
 * @author hishiel
 * @since Oct 31, 20163:44:45 PM
 * 
 */
public interface BaseDao<T, PK> {

	/**
	 * 插入对象
	 */
	int insertSelective(T model);

	/**
	 * 更新对象
	 */
	int updateByPrimaryKeySelective(T model);

	/**
	 * 根据主键删除对象
	 */
	int deleteByPrimaryKey(PK id);

	/**
	 * 根据主键查询对象
	 */
	T selectByPrimaryKey(PK id);
}
