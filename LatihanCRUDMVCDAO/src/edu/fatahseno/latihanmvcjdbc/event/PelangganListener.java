/*
 * Nama : Fatahillah SBS
 * NIM : 10118039
 * Kelas : IF-01
 */
package edu.fatahseno.latihanmvcjdbc.event;

import edu.fatahseno.latihanmvcjdbc.entity.Pelanggan;
import edu.fatahseno.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author acer
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();

}
