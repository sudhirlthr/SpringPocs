/**
 * 
 */
package com.sudhir.contact;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author sudhir
 *
 */
@Mapper
public interface ContactMapper {
	@Select("select * from contacts")
	public List<Contacts> findAllContacts();
}
