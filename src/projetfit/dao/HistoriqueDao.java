/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfit.dao;

import fit.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ESIC
 */
public class HistoriqueDao {
    
    
    public static List getListDateByUser(User u) throws SQLException{
        
        String sql = "SELECT poids, dateHisto FROM historique h\n" +
            "JOIN user u\n" +
            "ON u.id = h.userId\n" +
            "\n" +
            "WHERE  mail = ?";
        
        Connection connexion = ProjetFitDao.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        ordre.setString(1, u.getMail());
        
        ResultSet rs = ordre.executeQuery();
        
        List<Date> listTime = new ArrayList<>();
        
        while (rs.next()){
            listTime.add(rs.getDate("dateHisto"));
        }
        return listTime;
    }
    
    public static List getListPoidsByUser(User u) throws SQLException{
        
        String sql = "SELECT poids, dateHisto FROM historique h\n" +
            "JOIN user u\n" +
            "ON u.id = h.userId\n" +
            "\n" +
            "WHERE  mail = ?";
        
        Connection connexion = ProjetFitDao.getConnection();
        PreparedStatement ordre = connexion.prepareStatement(sql);
        ordre.setString(1, u.getMail());
        
        ResultSet rs = ordre.executeQuery();
        
        List<Double> listPoids = new ArrayList<>();
        
        while (rs.next()){
            listPoids.add(rs.getDouble("poids"));
        }
        return listPoids;
    }
}
