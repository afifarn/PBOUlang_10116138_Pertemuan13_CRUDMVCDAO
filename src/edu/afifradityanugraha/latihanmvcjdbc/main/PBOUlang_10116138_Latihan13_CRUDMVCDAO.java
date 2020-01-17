/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.afifradityanugraha.latihanmvcjdbc.main;

import edu.afifradityanugraha.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.afifradityanugraha.latihanmvcjdbc.entity.Pelanggan;
import edu.afifradityanugraha.latihanmvcjdbc.error.PelangganException;
import edu.afifradityanugraha.latihanmvcjdbc.service.PelangganDao;
import edu.afifradityanugraha.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Aradnu
 */
public class PBOUlang_10116138_Latihan13_CRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(PBOUlang_10116138_Latihan13_CRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    
}
