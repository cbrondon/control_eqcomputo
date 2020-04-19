/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author arath
 */
public class Equipo {
    String numinvent, estado, numserie, ram, rom, procesador, marca, dpto;

    public Equipo(String numinvent, String estado, String numserie, String ram, String rom, String procesador, String marca, String dpto) {
        this.numinvent = numinvent;
        this.estado = estado;
        this.numserie = numserie;
        this.ram = ram;
        this.rom = rom;
        this.procesador = procesador;
        this.marca = marca;
        this.dpto = dpto;
    }

    public String getNuminvent() {
        return numinvent;
    }

    public String getEstado() {
        return estado;
    }

    public String getNumserie() {
        return numserie;
    }

    public String getRam() {
        return ram;
    }

    public String getRom() {
        return rom;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getMarca() {
        return marca;
    }

    public String getDpto() {
        return dpto;
    }
    
    
    
}
