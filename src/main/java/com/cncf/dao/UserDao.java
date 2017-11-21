package com.cncf.dao;

import com.cncf.entity.User;
import com.cncf.entity.UserBase;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 所有的传参顺序第一个都是businessId
 */
@Repository
public interface UserDao {

	boolean saveUser(User user);

	int insertSelective(User user);

	boolean updateUser(User user);

	boolean deleteUser(int id);

	boolean updateVerifyCode(int id, String verifyCode);

	User getUserById(int userId);

	List<User> getUserByNickname(String nickname);

	User getUserByMobile(String mobile);

	Integer getNewestId();
	
	List<User> getUserListByPage(int offset, int limit);
	
	List<User> getAllUserList();

	List<Integer> getAllUserIdList();

	UserBase getUserBaseById(int id);

}
