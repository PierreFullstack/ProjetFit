/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.model;

/**
 *
 * @author ESIC
 */
public class User {
    
    private int id;
    private String prenom;
    private String nom;
    private int age;
    private int taille;
    private String mail;
    private String mdp;
    


    public User() {
    }

    public User(int id, String prenom, String nom, int age, int taille, String mail) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.mail = mail;
    }

    public User(String prenom, String nom, int age, int taille, String mail, String mdp) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.mail = mail;
        this.mdp = mdp;
    }

    public User(int id, String prenom, String nom, int age, int taille) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.taille = taille;
    }

    public User(int id, String prenom, String nom, int age, int taille, String mail, String mdp) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.mail = mail;
        this.mdp = mdp;
    }
    
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
