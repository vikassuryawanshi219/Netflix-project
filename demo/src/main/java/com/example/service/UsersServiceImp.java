package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Users;
import com.example.repository.IUsersRepository;

@Service
public class UsersServiceImp implements IUsersService {
	
	@Autowired
    IUsersRepository iUsersRepository;
	
	@Override
	public void updateUsers(Users users) {
		iUsersRepository.save(users);
		
	}

	@Override
	public void deleteById(Integer userId) {
		iUsersRepository.deleteById(userId);
		
	}

	@Override
	public Users getUserById(Integer userId) {
	 return iUsersRepository.findById(userId).get();
	}

}
