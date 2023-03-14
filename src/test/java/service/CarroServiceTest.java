package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

// test -> service -> CarroService
public class CarroServiceTest {

    // Cada teste será em um método

    @Test
    public void deveAcelerarCorretamenteUmCarroLigado() {
        // Given:
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When:
        carroService.acelerar(carro, 10);

        // Sempre que um método de teste NÃO possuir um assert ele vai passar
        // Then - Asserts

        Integer velocidadeEsperada = 10;
        Assert.assertEquals(velocidadeEsperada, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamente() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When
        carroService.ligar(carro);

        // Then
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void dadoUmCarroLigadoQuandoDesligarAVelocidadeDeveSerZero() {
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When
        carroService.desligar(carro);

        // Then
        Integer velocidadeDesligado = 0;
        Assert.assertEquals(velocidadeDesligado, carro.getVelocidadeAtual());

    }

    @Test
    public void dadoUmCarroLigadoQuandoFrearAVelocidadeDeveSerZero() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When
        carroService.frear(carro, 10);

        // Then
        Assert.assertEquals((Integer) 0, carro.getVelocidadeAtual());

    }

    @Test
    public void dadoUmCarroLigadoQuandoAcelerarAVelocidadeDeveSerMaiorQueZero() {

        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When
        carroService.acelerar(carro, 10);

        // Then
        Assert.assertTrue(carro.getVelocidadeAtual() > 0);

    }

    @Test
    public void dadoUmCarroEmMovimentoQuandoFrearAVelocidadeDeveSerMenorQueAAnterior() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);
        carroService.acelerar(carro, 20);

        // When
        carroService.frear(carro, 10);

        // Then
        Assert.assertTrue(carro.getVelocidadeAtual() == 10);
    }

    @Test
    public void dadoUmCarroDesligadoQuandoAcelerarAVelocidadeDeveSerZero() {
        // Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When
        carroService.acelerar(carro, 20);

        // Then
        Assert.assertFalse(carro.getVelocidadeAtual() != 0);
    }


}
