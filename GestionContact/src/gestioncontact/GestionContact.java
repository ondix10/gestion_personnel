/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncontact;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author masambukidi herve
 */
public class GestionContact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        afficherPersonne();
        //
        insererPersonne();
        //
        System.out.println("*****************");
        afficherPersonne();
        
    }

    private static void afficherPersonne() {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/gestion_contact";
        String user = "root";
        String pwd = "";
        //
        Connection cnx = null;
        //
        try {
            //
            cnx = DriverManager.getConnection(url, user, pwd);
            System.out.println("ok");
            //
            String requete = "select idp, nomsp, sexep from personne order by nomsp";
            //
            Statement reqExe = cnx.createStatement();
            //
            ResultSet rs = reqExe.executeQuery(requete);
            //
            while (rs.next()) {                
                System.out.println("ID : "+rs.getString("idp"));
                System.out.println("NOM : "+rs.getString("nomsp"));
                System.out.println("SEXE : "+rs.getString("sexep"));
                System.out.println("---------------------------");
            }
            //
            rs.close();
            reqExe.close();
            cnx.close();
            
            
        } catch (Exception e) {
            System.out.println("Erreur ::: "+e.getMessage());
        }
    }
    
    private static void insererPersonne() {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/gestion_contact";
        String user = "root";
        String pwd = "";
        //
        Connection cnx = null;
        //
        try {
            //
            cnx = DriverManager.getConnection(url, user, pwd);
            System.out.println("ok");
            //
            String id = JOptionPane.showInputDialog("ENTRER ID :");
            String nom= JOptionPane.showInputDialog("ENTRER NOM :");
            String sexe = JOptionPane.showInputDialog("ENTRER SEXE (f/m)) :");
            //
            String requete = "insert into personne(idp, nomsp, sexep) values('"+id+"', '"+
                    nom+"', '"+sexe+"')";
            //
            Statement reqExe = cnx.createStatement();
            //
            int rs = reqExe.executeUpdate(requete);
            //
            if (rs>0) {
                System.out.println("Insertion a  reussi !!!");
            } else {
                System.out.println("Insertion a échoué !!!");
            }
            reqExe.close();
            cnx.close();
            
            
        } catch (Exception e) {
            System.out.println("Erreur ::: "+e.getMessage());
        }
    }
    
}
