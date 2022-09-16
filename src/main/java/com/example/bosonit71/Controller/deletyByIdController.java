package com.example.bosonit71.Controller;

import com.example.bosonit71.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class deletyByIdController {

    @Autowired
    @Qualifier("beanList")
    List<Persona> peopleList;

    @DeleteMapping("/deleteById/{id}")
    public String deleteByID(@PathVariable("id") int id){
        peopleList.remove(id);
        return "usuario removido";
    }

}
