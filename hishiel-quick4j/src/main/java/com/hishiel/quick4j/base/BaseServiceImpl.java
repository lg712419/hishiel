package com.hishiel.quick4j.base;

/**
 * @BaseService的抽象实现类
 * 
 * @自定义ServiceImpl继承自该实现类可获得常用的增删改查操作
 * @自定义ServiceImpl可实现自定义方法
 * @T代表数据库中的表映射的Java对象类型
 * @PK代表对象的主键类型
 * 
 * @author Hishiel
 * @create 2016年11月17日下午9:34:38
 */
public abstract class BaseServiceImpl<T, PK> implements BaseService<T, PK> {

	/**
	 * @定义成抽象方法
	 * @继承子类实现该方法完成DAO注入
	 */
	public abstract BaseDao<T, PK> getDao();

	@Override
	public T selectById(PK id) {
		return getDao().selectByPrimaryKey(id);
	}

	@Override
	public int delete(PK id) {
		return getDao().delete(id);
	}

	@Override
	public int insert(T entity) {
		return getDao().insertSelective(entity);
	}

	@Override
	public int update(T entity) {
		return getDao().updateSelective(entity);
	}

}
