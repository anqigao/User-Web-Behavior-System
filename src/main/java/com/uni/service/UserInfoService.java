package com.uni.service;

import java.util.List;

import com.uni.entity.UserInfo;

public interface UserInfoService {
	
	/**
     * Get total number of user info
     * @return
     */
    int getTotal();

    
    /**
     * Insert one user record
     * @param uinfo
     */
    void addInfo(UserInfo uinfo);

    /**
     * Delete one record
     * @param id
     */
    void deleteInfo(int id);

    /**
     * Update one record
     * @param uinfo
     */
    void updateInfo(UserInfo uinfo);

    /**
     * Find one record
     * @param id
     * @return
     */
    UserInfo getInfo(int id);

    /**
     * Find record from start location and show number of count
     * @param start
     * @param count
     * @return
     */
    List<UserInfo> list(int start, int count);
    
    
    /**
     * Find one record with full informations from two tables
     * @param id
     * @return
     */
    List<UserInfo> getUser();    


}
