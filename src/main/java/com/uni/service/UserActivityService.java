package com.uni.service;

import java.util.List;

import com.uni.entity.UserActivity;

public interface UserActivityService {
	
	int getTotal();
	
    void addActivity(UserActivity uactivity);
    
    void deleteActivity(int id);
    
    void updateActivity(UserActivity uactivity);
    
    UserActivity getActivity(int id);
    
    List<UserActivity> list();

}
