package com.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.User;

public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	DriverManagerDataSource d;
	@Override
	public int save(User user) {
		
		String str="insert into UserDetail(username,address,email) values(?,?,?)";
		
		return jdbcTemplate.update(str,user.getUsername(),user.getAddress(),user.getEmail());
	}

	@Override
	public List<User> fetchusers() {
		
		String str="select * from UserDetail";
		RowMapper<User> rowMapper= new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				String uname=rs.getString("username");
				String add=rs.getString("address");
				String email=rs.getString("email");
				
				
				return new User(uname,add,email);
			}
			
		};
		
		
		return jdbcTemplate.query(str, rowMapper);
	}

}
