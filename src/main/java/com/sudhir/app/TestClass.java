package com.sudhir.app;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClass {
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void test() {
		List<User> user = userMapper.findAllUser();
		for(User usr:user)
			System.out.println("id = "+usr.getId()+", name = "+usr.getName()+", Email = "+usr.getEmail()+"\n");
	}
	
}
