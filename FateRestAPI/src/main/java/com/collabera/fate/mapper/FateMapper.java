package com.collabera.fate.mapper;

import org.springframework.stereotype.Component;

import com.collabera.fate.dto.FateDTO;
import com.collabera.fate.model.FateModel;

@Component
public class FateMapper {
	
	public FateModel toEntity(FateDTO character) {
		
		FateModel hero = new FateModel(character.getName(), 
				character.getCountry(), character.getNoblePhantasm()); 
		
		return hero;
		
	}
	
	public FateDTO toDTO(FateModel character) {
		
		FateDTO hero = new FateDTO(character.getId(),character.getName(), 
				character.getCountry(), character.getNoblePhantasm()); 
		
		return hero;
		
	}

}
