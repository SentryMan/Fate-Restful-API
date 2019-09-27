package com.collabera.fate.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.collabera.fate.dto.FateDTO;
import com.collabera.fate.mapper.FateMapper;
import com.collabera.fate.model.FateModel;
import com.collabera.fate.repo.FateRepository;

@Service
@Transactional
public class FateService {
	
	private final FateRepository Repo;
	private final FateMapper Map;
	
	public FateService(FateRepository repo, FateMapper map) {
		super();
		Repo = repo;
		Map = map;
	}
	
	public List<FateDTO> findAll() {
		
		return Repo.findAll().stream().map(m -> Map.toDTO(m)).collect(Collectors.toList());
		
	}
	
	public FateDTO findById(int id) {
		Optional<FateModel> fateOp = Repo.findById(id);
		if (fateOp.isPresent()) {
			return Map.toDTO(fateOp.get());
		}
		return null;
	}

	public FateDTO save(FateDTO hero) {
		FateModel entity = Map.toEntity(hero);
		FateModel saved = Repo.save(entity);
		return Map.toDTO(saved);
	}

	public FateDTO update(FateDTO hero) {
		int id = hero.getId();
		Optional<FateModel> findById = Repo.findById(id);
		if (findById.isPresent()) {
			FateModel uHero = findById.get();
			uHero.setName(hero.getName());
			uHero.setCountry(hero.getCountry());
			uHero.setNoblePhantasm(hero.getNoblePhantasm());
			FateModel saved = Repo.save(uHero);
			return Map.toDTO(saved);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void deleteById(int id) {
		Repo.deleteById(id);
	}
	
}
