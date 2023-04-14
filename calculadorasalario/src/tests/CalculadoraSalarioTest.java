package calculadorasalario.src.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import calculadorasalario.src.main.Funcionario;
import calculadorasalario.src.main.Calculadora;
import calculadorasalario.src.main.Cargo;

public class CalculadoraSalarioTest {

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
    public void testFuncionarioBuilder() {
        assertEquals("Silvanno", desenvolvedorJunior.getNome());
        assertEquals("principedosteclados@gmail.com", gerenteJunior.getEmail());
        assertEquals(8000.00, testadorSenior.getSalarioBase());
        assertEquals(Cargo.DBA, dbaJunior.getCargo());
    }

    @Test
    public void testSalarioDesenvolvedor() {
        double salarioBaseSenior = desenvolvedorSenior.getSalarioBase();
        double salarioBaseJunior = desenvolvedorJunior.getSalarioBase();
        double descontoDevSenior = salarioBaseSenior * 0.20;
        double descontoDevJunior = salarioBaseJunior * 0.10;
        System.out.println(salarioBaseJunior - descontoDevJunior);
        assertTrue(calculadora.calculaSalario(desenvolvedorJunior) == salarioBaseJunior - descontoDevJunior);
        assertTrue(calculadora.calculaSalario(desenvolvedorSenior) == salarioBaseSenior - descontoDevSenior);
    }

    @Test
    public void testSalarioDBA() {
        double salarioBaseSenior = dbaSenior.getSalarioBase();
        double salarioBaseJunior = dbaJunior.getSalarioBase();
        double descontoSenior = salarioBaseSenior * 0.25;
        double descontoJunior = salarioBaseJunior * 0.15;
        assertTrue(calculadora.calculaSalario(dbaJunior) == salarioBaseJunior - descontoJunior);
        assertTrue(calculadora.calculaSalario(dbaSenior) == salarioBaseSenior - descontoSenior);

    }

    @Test
    public void testSalarioTestador() {
        double salarioBaseSenior = testadorSenior.getSalarioBase();
        double salarioBaseJunior = testadorJunior.getSalarioBase();
        double descontoSenior = salarioBaseSenior * 0.25;
        double descontoJunior = salarioBaseJunior * 0.15;
        assertTrue(calculadora.calculaSalario(testadorJunior) == salarioBaseJunior - descontoJunior);
        assertTrue(calculadora.calculaSalario(testadorSenior) == salarioBaseSenior - descontoSenior);
    }

    @Test
    public void testSalarioGerente() {
        double salarioBaseSenior = gerenteSenior.getSalarioBase();
        double salarioBaseJunior = gerenteJunior.getSalarioBase();
        double descontoSenior = salarioBaseSenior * 0.30;
        double descontoJunior = salarioBaseJunior * 0.20;
        assertTrue(calculadora.calculaSalario(gerenteJunior) == salarioBaseJunior - descontoJunior);
        assertTrue(calculadora.calculaSalario(gerenteSenior) == salarioBaseSenior - descontoSenior);
    }

}
