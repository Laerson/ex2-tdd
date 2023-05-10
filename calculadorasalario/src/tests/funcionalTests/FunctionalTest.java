package calculadorasalario.src.tests.funcionalTests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import calculadorasalario.src.main.Funcionario;
import calculadorasalario.src.main.Calculadora;
import calculadorasalario.src.main.Cargo;

public class FunctionalTest {

    private Funcionario desenvolvedor;
    private Funcionario dba;
    private Funcionario testador;
    private Funcionario gerente;
    private Calculadora calculadora;

    @Before
    public void setup() {
        desenvolvedor = new Funcionario("Silvanno", "salles@gmail.com", 2800, Cargo.DESENVOLVEDOR);
        dba = new Funcionario("Tayrone", "cigano@gmail.com", 1800, Cargo.DBA);
        testador = new Funcionario("Leo", "magalhaes@gmail.com", 1800, Cargo.TESTADOR);
        gerente = new Funcionario("Zezo", "principedosteclados@gmail.com", 4800, Cargo.GERENTE);
        calculadora = new Calculadora();
    }

    @Test
    public void testSuiteParticaoEquivalencia() {
        // TODO:
        assertTrue(desenvolvedor.setNome("Joaozin23"), "Exception: Nome inválido");
    }

    @Test
    public void testSuiteAVLDesenvolvedor1() {
        desenvolvedor.setSalarioBase(-0.01);
        assertEquals(desenvolvedor.getSalarioBase(), "Exception: Salário inválido");
    }

    @Test
    public void testSuiteAVLDesenvolvedor2() {
        desenvolvedor.setSalarioBase(0);
        assertEquals(desenvolvedor.getSalarioBase(), 0);
    }

    @Test
    public void testSuiteAVLDesenvolvedor3() {
        desenvolvedor.setSalarioBase(0.01);
        assertEquals(desenvolvedor.getSalarioBase(), 0.01);
    }

    @Test
    public void testSuiteAVLDesenvolvedor4() {
        desenvolvedor.setSalarioBase(1000);
        assertEquals(desenvolvedor.getSalarioBase(), 900);
    }

    @Test
    public void testSuiteAVLDesenvolvedor5() {
        desenvolvedor.setSalarioBase(2999.99);
        assertEquals(desenvolvedor.getSalarioBase(), 2699.99);
    }

    @Test
    public void testSuiteAVLDesenvolvedor6() {
        desenvolvedor.setSalarioBase(3000);
        assertEquals(desenvolvedor.getSalarioBase(), 2400);
    }

    @Test
    public void testSuiteAVLDesenvolvedor7() {
        desenvolvedor.setSalarioBase(3001);
        assertEquals(desenvolvedor.getSalarioBase(), 2400.8);
    }

    @Test
    public void testSuiteAVLDBAandTester1() {
        testador.setSalarioBase(-0.01);
        dba.setSalarioBase(-0.01);
        assertEquals(testador.getSalarioBase(), "Exception: Salário inválido");
        assertEquals(dba.getSalarioBase(), "Exception: Salário inválido");
    }

    @Test
    public void testSuiteAVLDBAandTester2() {
        testador.setSalarioBase(0);
        dba.setSalarioBase(0);
        assertEquals(testador.getSalarioBase(), 0);
        assertEquals(dba.getSalarioBase(), 0);
    }

    @Test
    public void testSuiteAVLDBAandTester3() {
        testador.setSalarioBase(0.01);
        dba.setSalarioBase(0.01);
        assertEquals(testador.getSalarioBase(), 0.01);
        assertEquals(dba.getSalarioBase(), 0.01);
    }

    @Test
    public void testSuiteDBAandTester4() {
        testador.setSalarioBase(1000);
        dba.setSalarioBase(1000);
        assertEquals(testador.getSalarioBase(), 800);
        assertEquals(dba.getSalarioBase(), 800);
    }

    @Test
    public void testSuiteAVLDBAandTester5() {
        testador.setSalarioBase(4999.99);
        dba.setSalarioBase(4999.99);
        assertEquals(testador.getSalarioBase(), 3999.99);
        assertEquals(dba.getSalarioBase(), 3999.99);
    }

    @Test
    public void testSuiteAVLDBAandTester6() {
        testador.setSalarioBase(5000);
        dba.setSalarioBase(5000);
        assertEquals(testador.getSalarioBase(), 3500);
        assertEquals(dba.getSalarioBase(), 3500);
    }

    @Test
    public void testSuiteAVLDBAandTester7() {
        testador.setSalarioBase(5001);
        dba.setSalarioBase(5001);
        assertEquals(testador.getSalarioBase(), 3500.7);
        assertEquals(dba.getSalarioBase(), 3500.7);
    }

    @Test
    public void testSuiteAVLGerente1() {
        gerente.setSalarioBase(-0.01);
        assertEquals(gerente.getSalarioBase(), "Exception: Salário inválido");
    }

    @Test
    public void testSuiteAVLGerente2() {
        gerente.setSalarioBase(0);
        assertEquals(gerente.getSalarioBase(), 0);
    }

    @Test
    public void testSuiteAVLGerente3() {
        gerente.setSalarioBase(0.01);
        assertEquals(gerente.getSalarioBase(), 0.01);
    }

    @Test
    public void testSuiteAVLGerente4() {
        gerente.setSalarioBase(1000);
        assertEquals(gerente.getSalarioBase(), 1000);
    }

    @Test
    public void testSuiteAVLGerente5() {
        gerente.setSalarioBase(4999.99);
        assertEquals(gerente.getSalarioBase(), 3999.99);
    }

    @Test
    public void testSuiteAVLGerente6() {
        gerente.setSalarioBase(5000);
        assertEquals(gerente.getSalarioBase(), 3500);
    }

    @Test
    public void testSuiteAVLGerente7() {
        gerente.setSalarioBase(5001);
        assertEquals(gerente.getSalarioBase(), 3500.7);
    }

    // LEIA, POR FAVOR! Observação importante:
    // A suite criada utilizando tabela de decisão já tem as condições e ações cobertas pelos testes criados para a suite de AVL.

}