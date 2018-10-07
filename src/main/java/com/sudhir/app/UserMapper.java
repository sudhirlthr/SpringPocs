package com.sudhir.app;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {	
	@Select("select id, name, email from users")
	List<User> findAllUser();
	
}
