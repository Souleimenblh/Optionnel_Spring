package com.souleimen.avions.restcontrollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.souleimen.avions.entities.TypeAv;
import com.souleimen.avions.repos.AvionRepository;
import com.souleimen.avions.repos.TypeAvRepository;

@RestController
@RequestMapping("/api/typ")
//@RequestMapping("/api/typ")
@CrossOrigin("*")
public class TypeAvRESTController {
	@Autowired
	TypeAvRepository typeAvRepository;
	
	@Autowired
	private AvionRepository avionRepository;

	
	@RequestMapping(method=RequestMethod.GET)
	public List<TypeAv> getAllCategories()
	{
	return typeAvRepository.findAll();
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public TypeAv getTypeAvById(@PathVariable("id") Long id) {
	return typeAvRepository.findById(id).get();
	}
	
//	@RequestMapping(value="/{id}",method = RequestMethod.GET)
//	public Optional<TypeAv> getTypeAvById(@PathVariable("id") Long id) {
//	    return typeAvRepository.findById(id);
//	}

		
}
