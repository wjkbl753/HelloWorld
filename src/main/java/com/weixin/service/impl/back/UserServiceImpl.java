package com.weixin.service.impl.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weixin.dao.UserMapper;
import com.weixin.service.back.IUserService;
import com.weixin.vo.User;
import com.weixin.vo.UserExample;
import com.weixin.vo.UserExample.Criteria;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getByUsernameAndGroup(String username, String group) {
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username).andGroupnameEqualTo(group);
		List<User> selectByExample = userMapper.selectByExample(userExample);
		System.out.println("list"+selectByExample);
		if(selectByExample.size()>0) {
			return selectByExample.get(0);
		}else {
			return null;
		}
	}

	

}
