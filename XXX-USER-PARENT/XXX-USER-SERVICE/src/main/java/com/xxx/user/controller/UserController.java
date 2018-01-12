package com.xxx.user.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUserList")
	@ResponseBody
	public List<Map<String,String>> getUserList(){
		List<Map<String,String>> userList = new ArrayList<Map<String,String>>();
		for(int i=0;i<5;i++){
			Map<String,String>map = new HashMap<String,String>();
			map.put("username", "user"+i);
			map.put("age", ""+i);
			userList.add(map);
		}
		
		return userList;
	}
}
