package com.example.service;

import com.example.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Coder on 2017/3/26.
 */
@Service
public interface PersonService {

    public List<Person> getAllPerson();

    public void save(Person person);
}
