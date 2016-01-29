package com.twj.base.controller;

import java.util.List;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;

import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping; 

import com.twj.base.dao.*;
import com.twj.base.service.*;
import com.unj.dubbotest.provider.DemoService;
 
@Controller  
@RequestMapping("/user")  
public class UserController {
	  @Resource  
	    private UserService userService;  
	  @Resource  
	 private DemoService demoService;
	      
	    @RequestMapping("/showUser")  
	  
	    public String toIndex(HttpServletRequest request,Model model) throws Exception{  
	    
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        User user = this.userService.getUserById(userId);  
	        System.out.println(AopUtils.isAopProxy(this.userService));
	        model.addAttribute("user", user);  
	       List list= this.userService.getList();
	        
	        /*
	        User user1 = new User();
	        user1.setUserName("中文");
	        user1.setId(6);
	        user1.setAge(5);
	        user1.setPassword("aaaaa");
	        this.userService.insert(user1);
	        user1.setUserName("中文1");
	       // this.userService.insert(user1);
	        /*
	        List<User> users = this.userService.selectAll(user1);
	        for (int i = 0; i < users.size(); i++) {
				System.out.println(users.get(i).getUserName());
			}
	      
			String hello = demoService.sayHello("tom");
			System.out.println(hello);

			List list = demoService.getUsers();
			model.addAttribute("hello", hello); 
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
			*/
	        return "a";  
	    }  
	}  