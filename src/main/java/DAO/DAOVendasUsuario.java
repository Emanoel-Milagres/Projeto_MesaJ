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
                    + "tbl_vendas.pk_id_venda,"
                    + "tbl_vendas.fk_usuario,"
                    + "tbl_vendas.ven_mesa,"
                    + "tbl_vendas.ven_data_venda,"
                    + "tbl_vendas.ven_valor_liquido,"
                    + "tbl_vendas.ven_valor_bruto,"
                    + "tbl_vendas.ven_desconto,"
                    + "tbl_usuario.pk_id_usuario,"
                    + "tbl_vendas.usu_nome,"
                    + "tbl_vendas.ven_setor"
                 + " FROM"
                     + " tbl_vendas INNER JOIN tbl_usuario"
                        +"ON tbl_usuario.pk_id_usuario = tbl_vendas.fk_usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelUsuario = new ModelUsuario();
                    
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setUsuario(this.getResultSet().getInt(2));
                modelVendas.setVenMesa(String.valueOf(this.getResultSet().getInt(3)));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(4));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(6));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(7));
                modelVendas.setVenTaxa(this.getResultSet().getDouble(8));
                
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuNome(this.getResultSet().getString(2));
                modelUsuario.setUsuSetor(this.getResultSet().getString(5));
                
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
