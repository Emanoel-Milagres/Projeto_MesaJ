/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author emano
 */
public class Formatador {
    
    /**
     * Converte Virgula para Ponto
     * @param pString
     * @return double
     */
    public double converterVP(String pString){
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i = 0; i<tamanhoString; i++){
            if(pString.charAt(i) == ','){
                retorno += '.';
            }else{
                retorno += pString.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }
}
