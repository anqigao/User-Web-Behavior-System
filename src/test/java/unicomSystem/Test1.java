package unicomSystem;

import java.util.List;

import org.apache.log4j.Logger;
//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.uni.entity.UserActivity;
import com.uni.entity.UserInfo;
import com.uni.service.UserActivityServiceImpl;
//import com.uni.service.UserInfoService;
import com.uni.service.UserInfoServiceImpl;



@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class Test1 {
	
	private static Logger logger = Logger.getLogger(Test1.class);

    @Autowired
    private UserActivityServiceImpl userActivityServiceImpl;
    
    @Test  
    public void test1() {
    	UserActivity user = userActivityServiceImpl.getActivity(1);   
        //System.out.println(user);  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user)); 
    }  
	
 

}
