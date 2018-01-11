package com.mycuteblog;

import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.model.Child;
import com.mycuteblog.model.Connection;
import com.mycuteblog.model.Parents;
import com.mycuteblog.model.SecondChild;
import com.mycuteblog.model.Limit;
import com.mycuteblog.service.ApiRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@RestController
@EnableAutoConfiguration
public class ApiRequestController {

    @Autowired
    private ApiRequestService apiRequestService;
    

    private static final Logger logger = LoggerFactory.getLogger(ApiRequestController.class);

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getHome() {
        logger.info("Api request received");

        Map<String, String> response = new HashMap<String, String>();
        try {
            ApiRequest apiRequest = new ApiRequest(new Date());
            apiRequestService.create(apiRequest);
        	
        	/*secondChild1.add(new SecondChild(new Long(1),"test", "1"));
        	secondChild1.add(new SecondChild(new Long(2),"test", "2"));
        	secondChild1.add(new SecondChild(new Long(3),"test", "3"));
        	secondChild1.add(new SecondChild(new Long(4),"test", "4"));
        	
        	Set<SecondChild> secondChild2 = new HashSet<SecondChild>();
        	
        	secondChild2.add(new SecondChild(new Long(1),"test1", "1"));
        	secondChild2.add(new SecondChild(new Long(2),"test2", "2"));
        	secondChild2.add(new SecondChild(new Long(3),"test3", "3"));
        	secondChild2.add(new SecondChild(new Long(4),"test4", "4"));
        	
        	Set<SecondChild> secondChild3 = new HashSet<SecondChild>();
        	
        	secondChild2.add(new SecondChild(new Long(1),"test1", "5"));
        	secondChild2.add(new SecondChild(new Long(2),"test2", "6"));
        	secondChild2.add(new SecondChild(new Long(3),"test3", "7"));
        	secondChild2.add(new SecondChild(new Long(4),"test4", "8"));*/
        	Set<SecondChild> secondChild1 = new HashSet<SecondChild>();
        	
        	secondChild1.add(new SecondChild(null,"test", "1"));
        	secondChild1.add(new SecondChild(null,"test", "2"));
        	secondChild1.add(new SecondChild(null,"test", "3"));
        	secondChild1.add(new SecondChild(null,"test", "4"));
        	
        	Set<SecondChild> secondChild2 = new HashSet<SecondChild>();
        	
        	secondChild2.add(new SecondChild(null,"test1", "1"));
        	secondChild2.add(new SecondChild(null,"test2", "2"));
        	secondChild2.add(new SecondChild(null,"test3", "3"));
        	secondChild2.add(new SecondChild(null,"test4", "4"));
        	
        	Set<SecondChild> secondChild3 = new HashSet<SecondChild>();
        	
        	secondChild2.add(new SecondChild(null,"test1", "5"));
        	secondChild2.add(new SecondChild(null,"test2", "6"));
        	secondChild2.add(new SecondChild(null,"test3", "7"));
        	secondChild2.add(new SecondChild(null,"test4", "8"));
        	
        	Connection connection1 = new Connection("connection1", secondChild1);
        	Connection connection2 = new Connection("connection2", secondChild2);
        	Connection connection3 = new Connection("connection3", secondChild3);
        	
        	Set<Child> childList = new HashSet<Child>();
        	
        	childList.add(new Child("childType", "childName", connection1));
        	childList.add(new Child("childType2", "childName2", connection2));
        	childList.add(new Child("childType3", "childName3", connection3));
        	childList.add(new Child("childType4", "childName4", connection1));
        	childList.add(new Child("childType5", "childName5", connection2));
        	
        	Parents parents = new Parents("parentType", "parentName", childList);
        	
        	apiRequestService.save(parents);
        	
        	System.out.println(parents);
        	
        	
            response.put("status", "success");
        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);
            response.put("status", "fail");
        }

        return response;
    }
}
