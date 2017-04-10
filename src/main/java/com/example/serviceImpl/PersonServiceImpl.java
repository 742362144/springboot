package com.example.serviceImpl;

import com.example.dao.PersonDao;
import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Coder on 2017/3/26.
 */
@Component
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> getAllPerson() {
        return personDao.findAll();
    }

    @Override
    public void save(Person person) {
        personDao.save(person);
    }
}
