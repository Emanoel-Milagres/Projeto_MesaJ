package controller;

import DAO.DAOProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;

/**
 *
 * @author Emanoel
 */
public class ControllerProdutosVendasProdutos {
    
    private DAOProdutosVendasProdutos dAOProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVendas){
        return this.dAOProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVendas);
    }
    
}
