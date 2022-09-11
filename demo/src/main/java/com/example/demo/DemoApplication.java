package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Geners;
import com.example.model.Movies;
import com.example.model.Netflix;
import com.example.model.Users;
import com.example.service.IGenersService;
import com.example.service.IMoviesService;
import com.example.service.INetflixService;
import com.example.service.IUsersService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	IGenersService iGenersService;
	
	@Autowired
	INetflixService iNetflixService;
	
	
	@Autowired
	IUsersService iUsersService;
	
	@Autowired
	IMoviesService iMoviesService;
	


	@Override
	public void run(String... args) throws Exception {

	
		Movies movie1=new Movies("Fan","Indian", 4, "Robert D Nor");
		Movies movie2=new Movies("Avengers","American", 3, "Ruso brother");
		Movies movie3=new Movies("JL","American", 5, "Charls");
		
		Set<Movies> movieList1= new HashSet<>(Arrays.asList(movie1));
		Set<Movies> movieList2= new HashSet<>(Arrays.asList(movie2,movie3));
		
		Geners gener1=new Geners("Drama",movieList1);
		Geners gener2=new Geners("Action",movieList2);
		
		Set<Geners> generList1= new HashSet<>(Arrays.asList(gener1));
		Set<Geners> generList2= new HashSet<>(Arrays.asList(gener2));
		
		Users user1=new Users("Vikas", 851787732, "India", LocalDate.of(2016, 9, 23));
		Users user2=new Users( "Ram", 85178767, "India", LocalDate.of(2014, 5, 9));
		Users user3=new Users( "shyam", 667887732, "america", LocalDate.of(2010, 8, 02));
		Users user4=new Users( "suan", 766532, "japan", LocalDate.of(2007, 4, 21));
		
		Set<Users> userList1= new HashSet<>(Arrays.asList(user1,user2));
		Set<Users> userList2= new HashSet<>(Arrays.asList(user3));
		Set<Users> userList3= new HashSet<>(Arrays.asList(user4));
		
		Netflix netflix1 =new Netflix(userList1, generList1);
		Netflix netflix2 =new Netflix(userList2, generList2);
		Netflix netflix3 =new Netflix(userList3, generList2);
		
		iGenersService.addGener(gener1);
        iGenersService.addGener(gener2);
		
		iNetflixService.addNetflix(netflix1);
		iNetflixService.addNetflix(netflix2);
		iNetflixService.addNetflix(netflix3);

		
	}

}
