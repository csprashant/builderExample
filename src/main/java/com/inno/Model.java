package com.inno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "model")
public class Model {

	@Id
	@Column(name= "id")
	private String id;
	@Column(name= "name")
	private String name;
	@Column(name= "age")
	private Integer age;
	
	public Model() {
	}
	
	public Model(ModelBuilder builder) {
		this.id = builder.getId();
		this.name= builder.getName();
		this.age=builder.getAge();
}

	public String getId() {
	return id;
}


private void setId(String id) {
	this.id = id;
}


public String getName() {
	return name;
}


private void setName(String name) {
	this.name = name;
}


public Integer getAge() {
	return age;
}


private void setAge(Integer age) {
	this.age = age;
}


	public static class ModelBuilder {
		private String id;
		private String name;
		private Integer age;
		public String getId() {
			return id;
		}
		public ModelBuilder setId(String id) {
			this.id = id;
			return this;
		}
		public String getName() {
			return name;
		}
		public ModelBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public Integer getAge() {
			return age;
		}
		public ModelBuilder setAge(Integer age) {
			this.age = age;
			return this;
		}
		
		public Model build() {
			return new Model(this);
		}
		
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
