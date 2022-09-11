package com.example.service;

import com.example.model.Netflix;

public interface INetflixService {
	
	
	Netflix addNetflix(Netflix netflix);
    void updateNetflix(Netflix netflix);
    void deleteNetflix(int netflixId);
    Netflix getNetflixById(int netflixId);
}
