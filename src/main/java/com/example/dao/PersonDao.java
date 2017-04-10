package com.example.dao;

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import com.example.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Coder on 2017/3/26.
 */
public interface PersonDao extends JpaRepository<Person, Integer> {

}
