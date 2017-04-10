package com.example.controller;

import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Coder on 2017/3/26.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/person/getPersons", method = RequestMethod.GET)
    public List<Person> getpersons(){
        return personService.getAllPerson();
    }

    @Transactional
    @RequestMapping(value = "/person/add", method = RequestMethod.GET)
    public void addPerson(){
        Person person1 =  new Person();
        person1.setName("liu1");
        person1.setNickName("2");

        Person person2 =  new Person();
        person2.setName("liu1");
        person2.setNickName("213");

        personService.save(person1);
        personService.save(person2);
    }

    @Transactional
    @RequestMapping(value = "/person/addPerson", method = RequestMethod.GET)
    public void addPerson(@Valid Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
           System.out.println(bindingResult.getFieldError().getDefaultMessage());
           return ;
        }
        personService.save(person);
    }

}
