package cn.tedu.ssm.service;

import java.util.List;

import cn.tedu.ssm.pojo.User;

public interface UserService {

	List<User> findAll();
	User get(Integer id);
	String insert(User user);
	String update(User user);
	String delete(Integer id);
}
