package com.example.bosonit71.Controller;

import com.example.bosonit71.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class putModityController {

    @Autowired
    @Qualifier("beanList")
    List<Persona> peopleList;

    @PutMapping ("/modityById/{id}")
    public String modifyList (@PathVariable ("id")int id, @RequestBody Persona PersonObject){
    if(PersonObject.getName()!=null){peopleList.get(id).setName(PersonObject.getName());}
    if(PersonObject.getAge()!=0){peopleList.get(id).setAge(PersonObject.getAge());}
    if(PersonObject.getPopulation()!=null){peopleList.get(id).setPopulation(PersonObject.getPopulation());}
        return "Modificación realizada!";
    }
}
