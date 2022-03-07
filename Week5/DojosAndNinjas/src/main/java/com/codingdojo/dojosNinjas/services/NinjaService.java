package com.codingdojo.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosNinjas.models.Ninja;
import com.codingdojo.dojosNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepo = ninjaRepository;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
	
	public void deleteNinja(Ninja ninja) {
		ninjaRepo.delete(ninja);
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> getNinja = ninjaRepo.findById(id);
		if (getNinja.isPresent()) {
			return getNinja.get();
		} else {
			return null;
		}
	}
}
