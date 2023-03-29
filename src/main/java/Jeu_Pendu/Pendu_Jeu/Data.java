package Jeu_Pendu.Pendu_Jeu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Data {{

	try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data-base","root","");
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
        System.out.println("Connecter");
        String sql ="INSERT INTO pseudo(name)"+"VALUES('Succeed')";
        PreparedStatement pStatement=null;
        
        
        try {
        	
        pStatement=con.prepareStatement(sql);
        pStatement.executeUpdate();
        
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Erreur");
        }
        
        try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

    } catch (ClassNotFoundException e) {
        
        e.printStackTrace();
        System.out.println("Erreur");
    }
	
}}
