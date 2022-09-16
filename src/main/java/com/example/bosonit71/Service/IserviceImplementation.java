package com.example.bosonit71.Service;

import com.example.bosonit71.Model.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IserviceImplementation implements Iservice{

    @Bean("beanList")
    public List<Persona> list() {
        List<Persona> peopleList = new ArrayList<>();
    return peopleList;
    }
}
