package cn.tedu.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ssm.mapper.UserMapper;
import cn.tedu.ssm.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAll(){
		return userMapper.findAll();
	}

	@Override
	public User get(Integer id) {
		return userMapper.get(id);
	}

	@Override
	public String insert(User user) {
	   try {
		 userMapper.insert(user);
		return "insert success";
	} catch (Exception e) {
		return "insert error";
	}
	  
	}
	
	@Override
	public String update(User user) {
		try {
			userMapper.update(user);
			return "update success";
		} catch (Exception e) {
			return "update error";
		}
		
	}
	
	@Override
	public String delete(Integer id) {
		try {
			userMapper.delete(id);
			return "update success";
		} catch (Exception e) {
			return "update error";
		}
		
	}
	
	
}
