/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuelita.bar.model;

/**
 *
 * @author lgaray
 */
public class Mozo extends Persona{
    private Integer codigo;

    public Mozo() {
    }

    public Mozo(String nombre, Integer documento) {
        super(nombre, documento);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
            
}
