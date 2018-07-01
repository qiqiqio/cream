package com.cream.usermanager.dao;

import java.util.List;

import com.cream.usermanager.dao.vo.UserVO;

public interface UserDao {

	int insert(UserVO record);

    List<UserVO> selectUsers();
}
