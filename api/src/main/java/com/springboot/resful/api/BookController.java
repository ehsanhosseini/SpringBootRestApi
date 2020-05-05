package com.springboot.resful.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   
public class BookController {
	
	@GetMapping("/books")  // it is a get request for this specific url 
	public List<Book> allBooks() {
		
		List<Book> list = new ArrayList<Book>();
		
		list.add(new Book (1234,"Intervie cracker", "Ehsan"));
		
		
		return list;
	}

}
