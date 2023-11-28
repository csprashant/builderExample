package com.inno;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private ModelService service;

	@PostMapping("save/{id}")
	public Model save(@PathVariable String id) {
		return service.save(id);
	}

	@GetMapping("all")
	public List<Model> getAllDetails() {
		return service.getAll();
	}
}
