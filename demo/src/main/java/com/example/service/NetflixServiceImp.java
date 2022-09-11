package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Netflix;
import com.example.repository.INetflixRepository;

@Service
public class NetflixServiceImp implements INetflixService {
	
   @Autowired
   INetflixRepository iNetflixRepository;
   
	
	@Override
	public Netflix addNetflix(Netflix netflix) {
		
		return iNetflixRepository.save(netflix);
	}

	@Override
	public void updateNetflix(Netflix netflix) {
          iNetflixRepository.save(netflix);
		
	}

	@Override
	public void deleteNetflix(int netflixId) {
		iNetflixRepository.deleteById(netflixId);
		
	}

	@Override
	public Netflix getNetflixById(int netflixId) {
		
	return iNetflixRepository.findById(netflixId).get();
	
	}

}
