package com.example.bosonit71.Service;

import com.example.bosonit71.Model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Iservice {

    public List<Persona> list();

    }
