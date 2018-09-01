package com.uni.dao;

import java.util.List;

import com.uni.entity.UserInfo;

public interface UserInfoDao {
	
	int getTotal();
    void addInfo(UserInfo uinfo);
    void deleteInfo(int id);
    void updateInfo(UserInfo uinfo);
    UserInfo getInfo(int id);
    List<UserInfo> list(int start, int count);
    
    List<UserInfo> getUser();


}
