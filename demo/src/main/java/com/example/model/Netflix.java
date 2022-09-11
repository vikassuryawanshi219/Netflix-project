package com.example.model;

import java.util.Set;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Netflix {
	
@Id
@GeneratedValue(generator = "netflix_id",strategy = GenerationType.AUTO)
@SequenceGenerator(name = "netflix_id",sequenceName = "netflix_id")
private  Integer netflixId;
@JsonIgnore
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "netflix_id")
private Set<Users> userList;
@JsonIgnore
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "netflix_id")
private Set<Geners> gener;

public Netflix() {
	super();
	
}

public Netflix(Set<Users> userList, Set<Geners> gener) {
	super();
	this.userList = userList;
	this.gener = gener;
}

public Integer getNetflixId() {
	return netflixId;
}

public void setNetflixId(Integer netflixId) {
	this.netflixId = netflixId;
}

public Set<Users> getUserList() {
	return userList;
}

public void setUserList(Set<Users> userList) {
	this.userList = userList;
}

public Set<Geners> getGener() {
	return gener;
}

public void setGener(Set<Geners> gener) {
	this.gener = gener;
}

@Override
public String toString() {
	return "Netflix [userList=" + userList + ", gener=" + gener + "]";
}


}
