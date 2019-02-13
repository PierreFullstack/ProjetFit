/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import fit.model.User;

/**
 *
 * @author ESIC
 */
public class UserDao {
    public static User getByLoginPass(String login, String mdp) throws SQLException{
        User u = null;
        
        String sql = "SELECT * FROM user WHERE mail=? AND mdp=?";
        Connection connexion = ProjetFitDao.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        ordre.setString(1, login);
        ordre.setString(2, mdp);
        
        ResultSet rs = ordre.executeQuery();
        if (rs.next()){
            u = new User(rs.getInt("id"), 
                    rs.getString("prenom"), 
                    rs.getString("nom"),
                    rs.getInt("taille"),
                    rs.getInt("age"));
        }
        return u;
    }
    
    public static void insert(User utilisateur) throws SQLException{
        String sql = "INSERT INTO user(prenom, nom, taille, age, mail, mdp) VALUES(?, ?, ?, ?, ?, ?)";
        Connection connexion = ProjetFitDao.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        ordre.setString(1, utilisateur.getPrenom());
        ordre.setString(2, utilisateur.getNom());
        ordre.setInt(3, utilisateur.getTaille());
        ordre.setInt(4, utilisateur.getAge());
        ordre.setString(5, utilisateur.getMail());
        ordre.setString(6, utilisateur.getMdp());
        ordre.execute();
    }
}
