package com.fulboapp.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fulboapp.model.Field;


public interface IFieldRepo extends JpaRepository<Field, Integer> {

  List<Field> findByName(String name);

  List<Field> findByLocation(String location);

}