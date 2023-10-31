package com.example.Exercice2.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exercice2.Models.Etudiant;

@RestController
@RequestMapping("/api/v1/students")
public class EtudiantRestController {

    private ArrayList<Etudiant> studentList;

    @GetMapping
    public ArrayList<Etudiant> getAllStudents() {
        return studentList;
    }

    @GetMapping("/{id}")
    public Etudiant getOneStudents(@PathVariable int id) {
        return studentList.get(id);
    }

    @PostMapping
    public Etudiant createStudent(@RequestBody Etudiant etudiant) {
        studentList.add(etudiant);
        return etudiant;
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable int id) {
        return "Vous chercher a supprimer la personne avec l'id : " + id;
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id) {
        return "Vous chercher a modifier l'étudiant avec l'id : " + id;
    }

}
