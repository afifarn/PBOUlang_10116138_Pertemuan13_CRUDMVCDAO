/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.afifradityanugraha.latihanmvcjdbc.event;

import edu.afifradityanugraha.latihanmvcjdbc.entity.Pelanggan;
import edu.afifradityanugraha.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Aradnu
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

    

}
