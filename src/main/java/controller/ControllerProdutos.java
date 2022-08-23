package controller;

import model.ModelProdutos;
import DAO.DAOProdutos;
import java.util.ArrayList;

/**
*
* @author Emanoel
*/
public class ControllerProdutos {

    private DAOProdutos daoProduto = new DAOProdutos();

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoController(ModelProdutos pModelProduto){
        return this.daoProduto.salvarProdutosDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pIdProduto
    * @return ModelProduto
    */
    public ModelProdutos getProdutoController(int pIdProduto){
        return this.daoProduto.getProdutosDAO(pIdProduto);
    }
    /**
    * recupera Produto
    * @param pNomeProduto
    * @return ModelProduto
    */
    public ModelProdutos getProdutoController(String pNomeProduto){
        return this.daoProduto.getProdutosDAO(pNomeProduto);
    }

    /**
    * recupera uma lista deProduto
    * @param pIdProduto
    * @return ArrayList
    */
    public ArrayList<ModelProdutos> getListaProdutoController(){
        return this.daoProduto.getListaProdutosDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoController(ModelProdutos pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pIdProduto
    * @return boolean
    */
    public boolean excluirProdutoController(int pIdProduto){
        return this.daoProduto.excluirProdutoDAO(pIdProduto);
    }

    public boolean atualizarQuantidadeProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProduto.atualizarQuantidadeProdutoDAO(pListaModelProdutos);
    }
}