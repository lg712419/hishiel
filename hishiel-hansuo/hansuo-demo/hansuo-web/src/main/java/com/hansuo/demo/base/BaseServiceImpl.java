package com.hansuo.demo.base;

import java.util.List;

/**
 * @后续待完善 //TODO
 * 
 * @BaseService的抽象实现类
 * @自定义ServiceImpl继承自该实现类可获得常用的增删改查操作
 * @自定义ServiceImpl可实现自定义方法
 * @T代表数据库中的表映射的Java对象类型
 * @PK代表对象的主键类型
 * 
 * @author hishiel
 * @since Oct 31, 20163:52:37 PM
 */
public abstract class BaseServiceImpl<T, PK> implements BaseService<T, PK> {

	/**
	 * @定义成抽象方法
	 * @继承子类实现该方法完成DAO注入
	 */
	public abstract BaseDao<T, PK> getDao();

	@Override
	public int insert(T model) {
		return getDao().insertSelective(model);
	}

	@Override
	public int update(T model) {
		return getDao().updateByPrimaryKeySelective(model);
	}

	@Override
	public int delete(PK id) {
		return getDao().deleteByPrimaryKey(id);
	}

	@Override
	public T selectById(PK id) {
		return getDao().selectByPrimaryKey(id);
	}

	@Override
	public T selectOne() {
		// 子类覆盖实现，默认返回空
		return null;
	}

	@Override
	public List<T> selectList() {
		// 子类覆盖实现，默认返回空
		return null;
	}
}
