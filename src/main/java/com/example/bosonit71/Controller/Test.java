package com.example.bosonit71.Controller;

import com.example.bosonit71.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Test {

    @Autowired
    @Qualifier("beanList")
    List<Persona> peopleList;


    @GetMapping("/Test")
    public List<Persona> getPeopleList (){
        return peopleList;
    }
}
