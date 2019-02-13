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
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private int taille;
    private int age;

    public User() {
    }

    public User(int id, String nom, String prenom, String mail, String mdp, int taille, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.taille = taille;
        this.age = age;
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
