/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoPostgre;
import java.util.ArrayList;
import model.ModelUsuario;
import model.ModelVendas;
import model.ModelVendasUsuario;

/**
 *
 * @author Emanoel
 */
public class DAOVendasUsuario extends ConexaoPostgre{
    
    public ArrayList<ModelVendasUsuario> getListaVendasUsuarioDAO(){
        ArrayList<ModelVendasUsuario> listaModelVendasUsuario = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelUsuario modelUsuario = new ModelUsuario();
        ModelVendasUsuario modelVendasUsuario = new ModelVendasUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "tbl_venda.pk_id_venda,"
                    + "tbl_venda.fk_usuario,"
                    + "tbl_venda.ven_mesa,"
                    + "tbl_venda.ven_data_venda,"
                    + "tbl_venda.ven_valor_liquido,"
                    + "tbl_venda.ven_valor_bruto,"
                    + "tbl_venda.ven_taxa,"
                    + "tbl_usuario.pk_id_usuario,"
                    + "tbl_usuario.usu_nome,"
                    + "tbl_usuario.usu_login,"
                    + "tbl_usuario.usu_senha,"
                    + "tbl_usuario.usu_setor"
                 + " FROM"
                     + " tbl_venda INNER JOIN tbl_usuario "
                        +"ON tbl_usuario.pk_id_usuario = tbl_venda.fk_usuario;"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelUsuario = new ModelUsuario();
                modelVendasUsuario = new ModelVendasUsuario();
                    
                modelVendas = new ModelVendas();
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setUsuario(this.getResultSet().getInt(2));
                modelVendas.setVenMesa(this.getResultSet().getString(3));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(4));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(6));
                modelVendas.setVenTaxa(this.getResultSet().getDouble(7));
                
                modelUsuario.setIdUsuario(this.getResultSet().getInt(8));
                modelUsuario.setUsuNome(this.getResultSet().getString(9));
                modelUsuario.setUsuLogin(this.getResultSet().getString(10));
                modelUsuario.setUsuSenha(this.getResultSet().getString(11));
                modelUsuario.setUsuSetor(this.getResultSet().getString(12));
                
                modelVendasUsuario.setModelVendas(modelVendas);
                modelVendasUsuario.setModelUsuario(modelUsuario);
                
                listaModelVendasUsuario.add(modelVendasUsuario);
                 
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasUsuario;
    }
}
