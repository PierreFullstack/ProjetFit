/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.model;
import java.util.Date;

/**
 *
 * @author ESIC
 */
public class Historique {
    
    private int id;
    private int user_id;
    private double poids;
    private Date dateHisto;

    public Historique() {
    }

    public Historique(int id, int user_id, double poids, Date dateHisto) {
        this.id = id;
        this.user_id = user_id;
        this.poids = poids;
        this.dateHisto = dateHisto;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public double getPoids() {
        return poids;
    }

    public Date getDateHisto() {
        return dateHisto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setDateHisto(Date dateHisto) {
        this.dateHisto = dateHisto;
    }
    
    
    
}
