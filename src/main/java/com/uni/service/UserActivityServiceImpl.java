package com.uni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.dao.UserActivityDao;
import com.uni.entity.UserActivity;

@Service
public class UserActivityServiceImpl implements UserActivityService{

	@Autowired
	UserActivityDao userActivityDao;
	
	public int getTotal() {
		return userActivityDao.getTotal();
	}


	public void addActivity(UserActivity uactivity) {
		userActivityDao.addActivity(uactivity);
		
	}


	public void deleteActivity(int id) {
		userActivityDao.deleteActivity(id);
		
	}


	public void updateActivity(UserActivity uactivity) {
		userActivityDao.updateActivity(uactivity);
		
	}


	public UserActivity getActivity(int id) {
		return userActivityDao.getActivity(id);
	}


	public List<UserActivity> list() {
		return userActivityDao.list();
	}
	
	

}
