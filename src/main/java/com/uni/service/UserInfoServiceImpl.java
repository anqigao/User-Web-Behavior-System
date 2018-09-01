package com.uni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.dao.UserInfoDao;
import com.uni.entity.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	UserInfoDao userInfoDao;

	
	public int getTotal() {
		return userInfoDao.getTotal();
	}

	
	public void addInfo(UserInfo uinfo) {
		userInfoDao.addInfo(uinfo);
		
	}

	
	public void deleteInfo(int id) {
		userInfoDao.deleteInfo(id);
		
	}

	
	public void updateInfo(UserInfo uinfo) {
		userInfoDao.updateInfo(uinfo);
		
	}

	
	public UserInfo getInfo(int id) {
		return userInfoDao.getInfo(id);
	}

	
	public List<UserInfo> list(int start, int count) {
		return userInfoDao.list(start, count);
	}
	
	public List<UserInfo> getUser() {
		return userInfoDao.getUser();
	}

}
