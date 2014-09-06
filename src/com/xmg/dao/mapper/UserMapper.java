package com.xmg.dao.mapper;

import java.util.List;

import com.xmg.model.User;

/*
 * @Description :
 * @FileName: UserMapper.java
 * @Author :WeiHui.Zhang
 * @Data : 2014年8月21日 下午9:27:41
 * @Version:1.0.0
 */
public interface UserMapper {

	void create(User entity);

	void deleteById(int id);

	void update(User entity);

	User findById(int id);

	List<User> findAll();
}
