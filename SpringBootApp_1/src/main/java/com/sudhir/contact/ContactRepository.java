package com.sudhir.contact;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
	private JdbcTemplate jdbc;

	
	@Autowired
	public ContactRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	@SuppressWarnings("unchecked")
	public List<Contacts> findAll() {
		return jdbc.query("select id, firstName, lastName, phoneNumber, emailAddress"
				+ " from contacts order by lastName", new RowMapper() {

					@Override
					public Contacts mapRow(ResultSet rs, int rowNum) throws SQLException {
						Contacts contacts = new Contacts();
					contacts.setId(rs.getLong(1));
					contacts.setFirstName(rs.getString(2));
					contacts.setLastName(rs.getString(3));
					contacts.setPhoneNumber(rs.getString(4));
					contacts.setEmailAddress(rs.getString(5));
					return contacts;
					}
				});
	}
	
	public void save(Contacts contacts) {
		jdbc.update("insert into contacts (id, firstName, lastName, phoneNumber, emailAddress)"
				+ " values (?,?,?,?,?)",new Random().nextInt(100),contacts.getFirstName(),contacts.getLastName(), contacts.getPhoneNumber(), contacts.getEmailAddress());
	}
}
