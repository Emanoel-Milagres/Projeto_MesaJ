package model;

import java.util.Date;

/**
*
* @author Emanoel
*/
public class ModelVendas {

    private int idVenda;
    private int usuario;
    private String venMesa;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;
    private double venTaxa;

    /**
    * Construtor
    */
    public ModelVendas(){}

    /**
    * seta o valor de idVenda
    * @param pIdVenda
    */
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    /**
    * @return pk_idVenda
    */
    public int getIdVenda(){
        return this.idVenda;
    }

    /**
    * seta o valor de usuario
    * @param pUsuario
    */
    public void setUsuario(int pUsuario){
        this.usuario = pUsuario;
    }
    /**
    * @return fk_usuario
    */
    public int getUsuario(){
        return this.usuario;
    }

    /**
    * seta o valor de venMesa
    * @param pVenMesa
    */
    public void setVenMesa(String pVenMesa){
        this.venMesa = pVenMesa;
    }
    /**
    * @return venMesa
    */
    public String getVenMesa(){
        return this.venMesa;
    }

    /**
    * seta o valor de venDataVenda
    * @param pVenDataVenda
    */
    public void setVenDataVenda(Date pVenDataVenda){
        this.venDataVenda = pVenDataVenda;
    }
    /**
    * @return venDataVenda
    */
    public Date getVenDataVenda(){
        return this.venDataVenda;
    }

    /**
    * seta o valor de venValorLiquido
    * @param pVenValorLiquido
    */
    public void setVenValorLiquido(double pVenValorLiquido){
        this.venValorLiquido = pVenValorLiquido;
    }
    /**
    * @return venValorLiquido
    */
    public double getVenValorLiquido(){
        return this.venValorLiquido;
    }

    /**
    * seta o valor de venValorBruto
    * @param pVenValorBruto
    */
    public void setVenValorBruto(double pVenValorBruto){
        this.venValorBruto = pVenValorBruto;
    }
    /**
    * @return venValorBruto
    */
    public double getVenValorBruto(){
        return this.venValorBruto;
    }

    /**
    * seta o valor de venDesconto
    * @param pVenDesconto
    */
    public void setVenDesconto(double pVenDesconto){
        this.venDesconto = pVenDesconto;
    }
    /**
    * @return venDesconto
    */
    public double getVenDesconto(){
        return this.venDesconto;
    }

    /**
    * seta o valor de venTaxa
    * @param pVenTaxa
    */
    public void setVenTaxa(double pVenTaxa){
        this.venTaxa = pVenTaxa;
    }
    /**
    * @return venTaxa
    */
    public double getVenTaxa(){
        return this.venTaxa;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::idVenda = " + this.idVenda + "::usuario = " + this.usuario + "::venMesa = " + this.venMesa + "::venDataVenda = " + this.venDataVenda + "::venValorLiquido = " + this.venValorLiquido + "::venValorBruto = " + this.venValorBruto + "::venDesconto = " + this.venDesconto + "::venTaxa = " + this.venTaxa +  "}";
    }
}