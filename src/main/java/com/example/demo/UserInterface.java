package com.example.demo;

import java.util.List;

public interface UserInterface {
	public int addUser(User user);
	public List<User> getallUser();
	boolean validateUser(String USERNAME, String PASSWORD);
	public void deleteUser(int User_ID);
	public User login(User user);
}
