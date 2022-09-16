package com.example.bosonit71.Controller;

import com.example.bosonit71.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class getPersonaByNameID {

    @Autowired
    @Qualifier("beanList")
    List<Persona> peopleList;

    @GetMapping("/Name/{name}")
    public List<Persona> getFiltredName (@PathVariable("name") String name){
        List<Persona> filtredListName = peopleList.stream().filter((p)->p.getName().equals(name)).toList();
        return filtredListName;
    }

    @GetMapping("/ID/{id}")
    public Persona  getfiltredID (@PathVariable("id") int id){
        Persona filtredIdList = peopleList.get(id);
        return filtredIdList;
    }

}
