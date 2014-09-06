package com.xmg.dao;

import java.util.List;

/*
 * @Description :
 * @FileName: BaseDao.java
 * @Author :WeiHui.Zhang
 * @Data : 2014年8月21日 下午9:23:54
 * @Version:1.0.0
 */
public interface BaseDao<Entity> {

	void create(Entity entity);

	void deleteById(int id);

	void update(Entity entity);

	Entity findById(int id);

	List<Entity> findAll();
}
