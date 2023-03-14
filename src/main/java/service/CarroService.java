package service;

import model.Carro;

// main -> service -> CarroService
public class CarroService {
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    public void desligar(Carro carro) {
        carro.setLigado(false);
    }

    public void mostrarEstadoAtual(Carro carro) {
        System.out.println(carro.toString());
    }

    public void acelerar(Carro carro, int velocidade) {
        if(carro.getLigado()) {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual()+velocidade);
        }
    }

    public void frear(Carro carro, int velocidade) {
        if (carro.getLigado() &&
                ((carro.getVelocidadeAtual() - velocidade) >= 0)) {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() - velocidade);}
    }
}
