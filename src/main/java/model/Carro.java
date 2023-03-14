package model;

public class Carro {
    private String cor;
    private String marca;
    private Integer ano;
    private Boolean ligado;
    private Integer velocidadeAtual;

    // Os testes mostram a presença de erros e não sua ausencia
    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    public Carro(String cor, String marca, Integer ano) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", ligado=" + ligado +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
