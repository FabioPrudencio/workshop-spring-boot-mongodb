package com.fabioprudencio.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fabioprudencio.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User fabio = new User("1", "Fabio Prudencio", "fabio.oliveira.prudencio@gmail.com");
		User giulia = new User("2", "Giulia Lutke", "giulialutke@gmail.com");	
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(fabio, giulia));
		return ResponseEntity.ok().body(list);
	}
}