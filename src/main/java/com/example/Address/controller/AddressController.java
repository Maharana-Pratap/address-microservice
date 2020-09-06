package com.example.Address.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Address.modal.EmpAddress;

@RestController 
@RequestMapping("/address")
public class AddressController {

	static List<EmpAddress> records;
	   static {
		   records = List.of(
					new EmpAddress(1,"Chapra,Bihar", "8826274857"),
					new EmpAddress(2,"Kharika,Bihar", "8700595237")
					);
			
	   }
	@GetMapping("/details/{id}")
	public EmpAddress getAddress(@PathVariable("id") int id) {
		List<EmpAddress> ad = records.stream().filter(data -> data.getId() == id).collect(Collectors.toList());
		if(!ad.isEmpty()) {
			return ad.get(0);
		}
		return null;
	}
}
