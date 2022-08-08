/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author emano
 */
public class ControllerProdutos {
    private DaoProdutos daoProdutos = new DaoProdutos();
    /**
     * Salvar/Castrar produtos
     * @param pModelProduto
     * @return int
     */
    public int salvarProdutoController(ModelProdutos pModelProduto){
        return this.daoProdutos.salvarProdutosDAO(pModelProduto);
    }
    /**
     * Exclui produtos
     * @param pCodigo
     * @return bool
     */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    /**
     * Altera produto
     * @param pModelProduto
     * @return bool
     */
    public boolean alterarProdutoController(ModelProdutos pModelProduto){
        return this.daoProdutos.alterarProdutoDAO(pModelProduto);
    }
    /**
     * retorna um produto
     * @param pCodigo
     * @return ModelProdutos
     */
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornaProdutosDAO(pCodigo);
    }
    /**
     * retorna a lista de produtos
     * @return Array de ModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
}
