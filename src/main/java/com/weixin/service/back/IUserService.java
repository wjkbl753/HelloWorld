package com.weixin.service.back;


import com.weixin.vo.User;

public interface IUserService {
	/**
	 * 根据username和groupname查询用户
	 * @param username
	 * @param group
	 * @return 如果查询到返回对应的bean，查不到返回null
	 */
	User getByUsernameAndGroup(String username, String group);
}
