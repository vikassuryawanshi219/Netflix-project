package com.example.service;

import com.example.model.Geners;

public interface IGenersService {
    Geners addGener(Geners geners);
	void updateById(Geners geners);
	void deleteById(Integer generId);
	Geners getGenersById(Integer generId);
}
