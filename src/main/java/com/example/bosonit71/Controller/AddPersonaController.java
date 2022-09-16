package com.example.bosonit71.Controller;

import com.example.bosonit71.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class AddPersonaController {

    @Autowired
    @Qualifier("beanList")
    List<Persona> peopleList;

    @PostMapping("/addPeople")
    public String addPeople(@RequestBody Persona PersonObject){
        peopleList.add(PersonObject);
        return "Persona añadida!";
    }
}
