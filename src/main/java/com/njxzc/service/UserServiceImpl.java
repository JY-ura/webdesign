package com.njxzc.service;

import java.util.List;
import cn.hutool.core.util.ObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.njxzc.dao.UserDao;
import com.njxzc.po.MyUser;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//注解为一个服务
@Service("service")
public class UserServiceImpl implements UserService {
@Autowired
	private UserDao userdao;

	@Override
	public boolean login(MyUser user) {
		// 此处修改成dao操作
		MyUser u = userdao.selectUserByName(user.getUname());
		if (ObjectUtil.isNotNull(u)) {
			System.out.println(u.getUname());
			System.out.println(user.getUname());
			System.out.println(u.getPassword());
			System.out.println(user.getPassword());
			if (user.getUname().equals(u.getUname()) && user.getPassword().equals(u.getPassword()))
				return true;
		}
		return false;
	}

	@Override
	public boolean register(MyUser user) {
		MyUser u = userdao.selectUserByName(user.getUname());
		if (ObjectUtil.isNotNull(u)) {
			return false;

		} else {
			userdao.addUser(user);
			return true;
		}

	}

	@Override
	public List<MyUser> listAllUsers() {
		return userdao.selectAllUser();
	}

	@Override
	public List<MyUser> selectUserByUname(MyUser user){
		return userdao.selectUserByUname(user);
	}

	@Override
	public boolean delete(MyUser user){
		MyUser u = userdao.selectUserByName(user.getUname());
		if (ObjectUtil.isNotNull(u)) {
			userdao.delete(user);
			return true;

		} else {
			return false;
		}
//		return userdao.delete(user);
	}
}
