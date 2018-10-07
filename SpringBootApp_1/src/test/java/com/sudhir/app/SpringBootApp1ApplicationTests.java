package com.sudhir.app;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sudhir.contact.ContactRepository;
import com.sudhir.contact.Contacts;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringBootApp1ApplicationTests.class)
public class SpringBootApp1ApplicationTests {

	@Autowired
	ContactRepository repository;
	
	@Test
	public void contextLoads() {
		List<Contacts> list = repository.findAll();
		assertNotNull("Have data", list);
	}

}
