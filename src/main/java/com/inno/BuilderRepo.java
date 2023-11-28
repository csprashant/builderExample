package com.inno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BuilderRepo extends JpaRepository<Model, String> {

}
