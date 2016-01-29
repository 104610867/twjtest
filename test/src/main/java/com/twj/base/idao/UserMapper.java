package com.twj.base.idao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.twj.base.dao.User;

import java.util.*;

public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

	List<User> selectAll(User user,PageBounds pageBounds);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}