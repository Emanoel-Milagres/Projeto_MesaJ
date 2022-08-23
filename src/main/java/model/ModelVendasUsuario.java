package model;

import java.util.ArrayList;

/**
 *
 * @author Emanoel
 */
public class ModelVendasUsuario {
    private ModelVendas modelVendas;
    private ModelUsuario modelUsuario;
    private ArrayList<ModelVendasUsuario> listaModelVendasUsuario;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelUsuario
     */
    public ModelUsuario getModelUsuario() {
        return modelUsuario;
    }

    /**
     * @param modelUsuario the modelUsuario to set
     */
    public void setModelUsuario(ModelUsuario modelUsuario) {
        this.modelUsuario = modelUsuario;
    }

    /**
     * @return the listaModelVendasUsuario
     */
    public ArrayList<ModelVendasUsuario> getListaModelVendasUsuario() {
        return listaModelVendasUsuario;
    }

    /**
     * @param listaModelVendasUsuario the listaModelVendasUsuario to set
     */
    public void setListaModelVendasUsuario(ArrayList<ModelVendasUsuario> listaModelVendasUsuario) {
        this.listaModelVendasUsuario = listaModelVendasUsuario;
    }

  
    
}
