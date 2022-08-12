package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Emanoel
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pIdUsario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pIdUsario){
        return this.daoUsuario.getUsuarioDAO(pIdUsario);
    }

    /**
    * recupera uma lista deUsuario
    * @param pIdUsario
    * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pIdUsario
    * @return boolean
    */
    public boolean excluirUsuarioController(int pIdUsario){
        return this.daoUsuario.excluirUsuarioDAO(pIdUsario);
    }

    public boolean getValidarUsuarioController(ModelUsuario pModelUsuario) {
        
        return this.daoUsuario.getValidarUsuarioDAO(pModelUsuario);
    }
}