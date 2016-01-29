package com.twj.base.service;

import javax.annotation.Resource;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.*;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.twj.base.idao.*;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.twj.base.dao.User;


@Service("userService")
public class UserService {
	


	@Resource
	private UserMapper userDao;
	


	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	public List<User> selectAll(User user) {
		// TODO Auto-generated method stub
		PageBounds pageBounds = new PageBounds(1, 10);
		return this.userDao.selectAll(user,pageBounds);
	}

	// @Transactional
	public void insert(User user) {
		this.userDao.insert(user);
		insert1(user);

	}

	// @Transactional
	public void insert1(User user) {
		this.userDao.insert(user);

	}
public List<User> getList() throws Exception {
		
	PageBounds pageBounds = new PageBounds(1, 2);
	List list =  this.userDao.selectAll(null,pageBounds);
	return list;
		//return null;
	} 

}
