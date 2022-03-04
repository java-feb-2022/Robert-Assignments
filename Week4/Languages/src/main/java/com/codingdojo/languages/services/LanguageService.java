package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.langRepo = languageRepository;
	}
	
	public Language getLanguageById(Long id) {
		Optional<Language> optLanguage = langRepo.findById(id);
		if(optLanguage.isPresent()) {
			return optLanguage.get();
		}
		else {
			return null;
		}
	}
	
	public List<Language> getAllLanguages() { return langRepo.findAll(); }
	
	public Language createLanguage(Language language) {
		return langRepo.save(language);
	}
	
	public Language updateLanguage(Language language) {
		return langRepo.save(language);
	}
	
	public void deleteLanguageById(Long id) {
		langRepo.deleteById(id);
	}
}
