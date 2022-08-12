/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAOVendasUsuario;
import java.util.ArrayList;
import model.ModelVendasUsuario;

/**
 *
 * @author Emanoel
 */
public class ControllerVendasUsuario {
    
    private DAOVendasUsuario dAOVendasUsuario = new DAOVendasUsuario();

    public ArrayList<ModelVendasUsuario> getListaVendasUsuario() {
       return this.dAOVendasUsuario.getListaVendasUsuarioDAO();
    }
    
}
