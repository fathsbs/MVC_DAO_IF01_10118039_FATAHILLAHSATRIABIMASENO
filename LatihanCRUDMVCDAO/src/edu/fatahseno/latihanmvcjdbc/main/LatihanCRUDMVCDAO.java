/*
 * Nama : Fatahillah SBS
 * NIM : 10118039
 * Kelas : IF-01
 */
package edu.fatahseno.latihanmvcjdbc.main;

import edu.fatahseno.latihanmvcjdbc.database.KingsBarberShopDatabase;
import edu.fatahseno.latihanmvcjdbc.entity.Pelanggan;
import edu.fatahseno.latihanmvcjdbc.error.PelangganException;
import edu.fatahseno.latihanmvcjdbc.service.PelangganDao;
import edu.fatahseno.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import javax.swing.SwingUtilities;

/**
 *
 * @author acer
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
//        KingsBarberShopDatabase.getConnection(

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (Exception e) {
                }
//                  catch ( PelangganException ex){
//                  Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        });
    }

}
