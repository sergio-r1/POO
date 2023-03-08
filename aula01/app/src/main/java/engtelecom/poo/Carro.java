package engtelecom.poo;

public class Carro {

    //atributos da classe
    private String modelo;
    private int velocidadeAtual;

    //metodos
    public void definirModelo(String m){
        modelo = m;
    }

    public void definirVelocidadeAtual(int v){
        velocidadeAtual = v;
    }

    public String obterModelo(){
        return modelo;
    }

    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }

}
