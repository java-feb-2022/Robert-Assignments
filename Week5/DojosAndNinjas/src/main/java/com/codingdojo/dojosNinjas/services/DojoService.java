package com.codingdojo.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosNinjas.models.Dojo;
import com.codingdojo.dojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepo = dojoRepository;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
	public void deleteDojo(Dojo dojo) {
		dojoRepo.delete(dojo);
	}
	
	public Dojo updateDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optDojo = dojoRepo.findById(id);
		if (optDojo.isPresent()) {
			return optDojo.get();
		} else {
			return null;
		}
	}
	
	public List<Dojo> findAllDojos(){
		return dojoRepo.findAll();
	}
}
