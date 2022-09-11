package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Geners;
import com.example.repository.IGenersRepository;

@Service
public class GenersServiceImp implements IGenersService {
	
	@Autowired
    IGenersRepository iGenersRepository;

    @Override
    public Geners addGener(Geners geners) {
	 return iGenersRepository.save(geners);
    }
   
	@Override
	public void updateById(Geners geners) {
		
	iGenersRepository.save(geners);	
	}

	@Override
	public void deleteById(Integer generId) {
	
    iGenersRepository.deleteById(generId);
		
	}

	@Override
	public Geners getGenersById(Integer generId) {
		
		return iGenersRepository.findById(generId).get();
	}

	

}
