package engtelecom.poo;

/**
 * Esta classe representa um ar condicionado
 * @author sergio-r1
 */

public class CondicionadorDeAr {

    // Constantes

    private final int MINIMO=16;
    private final int MAXIMO=30;
    
    // Atributos
    private boolean ligado;
    private int temperaturaDesejada;
    private int velocidade;
    private int btu;
    private double temperaturaDoAmbiente;
    private int intensidadeDoVento;
    private String modoDeOperacao;
    private boolean movimentacaoDaAleta;
    private int posicaoAleta;

    // Metodos

    /**
     * Liga o condicionador caso ele esteja desligado ou desliga caso esteja ligado
     */
    public void setLigado(){
        ligado = !ligado;
    }

    /**
     * Joga na tela o valor que está contido no atributo ligado
     * @return ligado
     */
    public boolean getLigado(){
        return ligado;
    }

    /**
     * 
     * @param novaTemperatura
     * @return
     */
    public int setTemperaturaDesejada(int novaTemperatura){
        // temperaturaDesejada = (novaTemperatura >= MINIMO && novaTemperatura <= MAXIMO) ? novaTemperatura :temperaturaDesejada;
        if (novaTemperatura >= MINIMO && novaTemperatura <= MAXIMO){
            temperaturaDesejada = novaTemperatura;
        }
        return temperaturaDesejada;
    }

}
