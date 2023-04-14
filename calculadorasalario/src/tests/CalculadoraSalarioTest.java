package calculadorasalario.src.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import calculadorasalario.src.main.Funcionario;
import calculadorasalario.src.main.Calculadora;

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
        desenvolvedorJunior = new Funcionario("Silvanno", "salles@gmail.com", 2800, "Desenvolvedor");
        desenvolvedorSenior = new Funcionario("Reginaldo", "rossi@gmail.com", 10000, "Desenvolvedor");
        dbaJunior = new Funcionario("Tayrone", "cigano@gmail.com", 1800, "Dba");
        dbaSenior = new Funcionario("Waldick", "soriano@gmail.com", 8000, "Dba");
        testadorJunior = new Funcionario("Leo", "magalhaes@gmail.com", 1800, "Testador");
        testadorSenior = new Funcionario("Pablo", "arrocha@gmail.com", 8000, "Testador");
        gerenteJunior = new Funcionario("Zezo", "principedosteclados@gmail.com", 4800, "Gerente");
        gerenteSenior = new Funcionario("Amado", "batista@gmail.com", 12000, "Gerente");
    }

    @Test
    void testFuncionarioBuilder() {
        assertEquals("Silvanno", desenvolvedorJunior.getNome());
        assertEquals("principedosteclados@gmail.com", gerenteJunior.getEmail());
        assertEquals("8000", testadorSenior.getSalarioBase());
        assertEquals("DBA", dbaJunior.getCargo());
    }

    @Test
    void testSalarioDesenvolvedor() {
        double salarioBaseSenior = desenvolvedorSenior.getSalarioBase();
        double salarioBaseJunior = desenvolvedorJunior.getSalarioBase();
        double descontoDevSenior = salarioBaseSenior * 0.20;
        double descontoDevJunior = salarioBaseJunior * 0.10;
        assertTrue(calculadora.calculaSalario(desenvolvedorJunior) == salarioBaseJunior - descontoDevJunior);
        assertTrue(calculadora.calculaSalario(desenvolvedorSenior) == salarioBaseSenior - descontoDevSenior);
    }

    @Test
    void testSalarioDBA() {
        double salarioBaseSenior = dbaSenior.getSalarioBase();
        double salarioBaseJunior = dbaJunior.getSalarioBase();
        double descontoSenior = salarioBaseSenior * 0.25;
        double descontoJunior = salarioBaseJunior * 0.15;
        assertTrue(calculadora.calculaSalario(dbaJunior) == salarioBaseJunior - descontoJunior);
        assertTrue(calculadora.calculaSalario(dbaSenior) == salarioBaseSenior - descontoSenior);

    }

    @Test
    void testSalarioTestador() {
        double salarioBaseSenior = desenvolvedorSenior.getSalarioBase();
        double salarioBaseJunior = desenvolvedorJunior.getSalarioBase();
        double descontoSenior = salarioBaseSenior * 0.25;
        double descontoJunior = salarioBaseJunior * 0.15;
        assertTrue(calculadora.calculaSalario(testadorJunior) == salarioBaseJunior - descontoJunior);
        assertTrue(calculadora.calculaSalario(testadorSenior) == salarioBaseSenior - descontoSenior);
    }

    @Test
    void testSalarioGerente() {
        double salarioBaseSenior = desenvolvedorSenior.getSalarioBase();
        double salarioBaseJunior = desenvolvedorJunior.getSalarioBase();
        double descontoSenior = salarioBaseSenior * 0.35;
        double descontoJunior = salarioBaseJunior * 0.20;
        assertTrue(calculadora.calculaSalario(gerenteJunior) == salarioBaseJunior - descontoJunior);
        assertTrue(calculadora.calculaSalario(gerenteSenior) == salarioBaseSenior - descontoSenior);
    }

}
