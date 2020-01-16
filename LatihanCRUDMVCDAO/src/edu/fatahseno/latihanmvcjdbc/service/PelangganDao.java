/*
 * Nama : Fatahillah SBS
 * NIM : 10118039
 * Kelas : IF-01
 */
package edu.fatahseno.latihanmvcjdbc.service;

import edu.fatahseno.latihanmvcjdbc.entity.Pelanggan;
import edu.fatahseno.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author acer
 */
public interface PelangganDao {

    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(int id) throws PelangganException;

    public Pelanggan getPelanggan(int id) throws PelangganException;

    public Pelanggan getPelanggan(String email) throws PelangganException;

    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
