package calculadorasalario.src.tests.functionalTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import calculadorasalario.src.main.Funcionario;
import calculadorasalario.src.main.Calculadora;
import calculadorasalario.src.main.Cargo;

public class FunctionalTest {

    private Funcionario desenvolvedorJunior;
    private Funcionario desenvolvedorSenior;
    private Funcionario dbaJunior;
    private Funcionario dbaSenior;
    private Funcionario testadorJunior;
    private Funcionario testadorSenior;
    private Funcionario gerenteJunior;
    private Funcionario gerenteSenior;
    private Calculadora calculadora;

    @Before
    public void setup() {
        desenvolvedorJunior = new Funcionario("Silvanno", "salles@gmail.com", 2800, Cargo.DESENVOLVEDOR);
        desenvolvedorSenior = new Funcionario("Reginaldo", "rossi@gmail.com", 10000, Cargo.DESENVOLVEDOR);
        dbaJunior = new Funcionario("Tayrone", "cigano@gmail.com", 1800, Cargo.DBA);
        dbaSenior = new Funcionario("Waldick", "soriano@gmail.com", 8000, Cargo.DBA);
        testadorJunior = new Funcionario("Leo", "magalhaes@gmail.com", 1800, Cargo.TESTADOR);
        testadorSenior = new Funcionario("Pablo", "arrocha@gmail.com", 8000, Cargo.TESTADOR);
        gerenteJunior = new Funcionario("Zezo", "principedosteclados@gmail.com", 4800, Cargo.GERENTE);
        gerenteSenior = new Funcionario("Amado", "batista@gmail.com", 12000, Cargo.GERENTE);
        calculadora = new Calculadora();
    }

    @Test
    public void testSuiteParticaoEquivalencia() {
        assertEquals("Silvanno", desenvolvedorJunior.getNome());
        assertEquals("principedosteclados@gmail.com", gerenteJunior.getEmail());
        assertEquals(8000.00, testadorSenior.getSalarioBase());
        assertEquals(Cargo.DBA, dbaJunior.getCargo());
    }

    @Test
    public void testSuiteAVLDesenvolvedor() {
        double salarioBaseSenior = desenvolvedorSenior.getSalarioBase();
        double salarioBaseJunior = desenvolvedorJunior.getSalarioBase();
        double descontoDevSenior = salarioBaseSenior * 0.20;
        double descontoDevJunior = salarioBaseJunior * 0.10;
        System.out.println(salarioBaseJunior - descontoDevJunior);
        assertTrue(calculadora.calculaSalario(desenvolvedorJunior) == salarioBaseJunior - descontoDevJunior);
        assertTrue(calculadora.calculaSalario(desenvolvedorSenior) == salarioBaseSenior - descontoDevSenior);
    }

    @Test
    public void testSuiteAVLDBAandTester() {
        // TODO:
    }

    @Test
    public void testSuiteAVLGerente() {
        // TODO:
    }

    @Test
    public void testSuiteSalarioDBA() {
        // TODO
    }

    @Test
    public void testSalarioTestador() {
        // TODO
    }

    @Test
    public void testSalarioGerente() {
        // TODO
    }

}