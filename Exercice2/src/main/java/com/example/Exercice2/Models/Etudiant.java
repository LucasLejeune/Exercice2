package com.example.Exercice2.Models;

public class Etudiant {
    private Integer id;
    private String nom;
    private String prenom;
    private Integer age;
    private static Integer count = 1;

    public Etudiant(String nom, String prenom, int age) {
        ++count;
        this.id = count;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Etudiant numéro: " + id + ", nom: " + nom + ", prenom: " + prenom + ", age: " + age;
    }

}
