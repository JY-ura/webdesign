package com.njxzc.service;


import com.njxzc.po.MyUser;
import java.util.List;

public interface UserService {
	boolean login(MyUser user);
	boolean register(MyUser user);

	List<MyUser> listAllUsers();
	public List<MyUser> selectUserByUname(MyUser user);

	boolean delete(MyUser user);
}
