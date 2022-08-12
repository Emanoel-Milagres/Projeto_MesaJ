package util;

/**
 *
 * @author Emanoel
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
