package com.spring.DAO;

import java.util.List;

import com.spring.User;

public interface UserDAO {
public int save(User user);
public List<User> fetchusers();
}
