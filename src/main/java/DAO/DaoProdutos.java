package DAO;

import model.ModelProdutos;
import conexoes.ConexaoPostgre;
import java.util.ArrayList;

/**
 *
 * @author Emanoel
 */
public class DAOProdutos extends ConexaoPostgre {

    /**
     * grava Produto
     *
     * @param pModelProduto
     * @return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProduto) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_produto ("
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_quantidade"
                    + ") VALUES ("
                    + "'" + pModelProduto.getProNome() + "',"
                    + "'" + pModelProduto.getProValor() + "',"
                    + "'" + pModelProduto.getProQuantidade() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Produto
     *
     * @param pIdProduto
     * @return ModelProduto
     */
    public ModelProdutos getProdutosDAO(int pIdProduto) {
        ModelProdutos modelProduto = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_quantidade"
                    + " FROM"
                    + " tbl_produto"
                    + " WHERE"
                    + " pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProQuantidade(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * recupera Produto
     *
     * @param pNomeProduto
     * @return ModelProduto
     */
    public ModelProdutos getProdutosDAO(String pNomeProduto) {
        ModelProdutos modelProduto = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_quantidade"
                    + " FROM"
                    + " tbl_produto"
                    + " WHERE"
                    + " pro_nome = '" + pNomeProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProQuantidade(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * recupera uma lista de Produto
     *
     * @return ArrayList
     */
    public ArrayList<ModelProdutos> getListaProdutosDAO() {
        ArrayList<ModelProdutos> listamodelProduto = new ArrayList();
        ModelProdutos modelProduto = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_quantidade"
                    + " FROM"
                    + " tbl_produto"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProduto = new ModelProdutos();
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProQuantidade(this.getResultSet().getInt(4));
                listamodelProduto.add(modelProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    /**
     * atualiza Produto
     *
     * @param pModelProduto
     * @return boolean
     */
    public boolean atualizarProdutoDAO(ModelProdutos pModelProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "',"
                    + "pro_nome = '" + pModelProduto.getProNome() + "',"
                    + "pro_valor = '" + pModelProduto.getProValor() + "',"
                    + "pro_quantidade = '" + pModelProduto.getProQuantidade() + "'"
                    + " WHERE "
                    + "pk_id_produto = '" + pModelProduto.getIdProduto() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Produto
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto "
                    + " WHERE "
                    + "pk_id_produto = '" + pIdProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean atualizarQuantidadeProdutoDAO(ArrayList<ModelProdutos> pListaModelProdutos) {
        try {
            this.conectar();
            int cont = 0;
            cont = pListaModelProdutos.size();
            for (int i = 0; i < cont; i++) {

                this.executarUpdateDeleteSQL(
                        "UPDATE tbl_produto SET "
                        + "pro_quantidade = '" + pListaModelProdutos.get(i).getProQuantidade() + "'"
                        + " WHERE pk_id_produto = '" + pListaModelProdutos.get(i).getIdProduto() + "'"
                        + ";"
                );
              
            }
              return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
