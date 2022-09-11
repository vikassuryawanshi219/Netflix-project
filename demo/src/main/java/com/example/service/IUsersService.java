package com.example.service;



import com.example.model.Users;


public interface IUsersService {
	
	void updateUsers(Users users);
	void deleteById (Integer userId);
	Users getUserById (Integer userId);
	
	
	

}
