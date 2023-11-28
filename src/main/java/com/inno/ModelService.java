package com.inno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

	@Autowired
	private BuilderRepo repo;
	
	public Model save(String id) {
		Model build = new Model.ModelBuilder().setId(id).setName("Prashant").setAge(12).build();
		return repo.save(build);
	}

	public List<Model> getAll() {
		return repo.findAll();
	}
}
