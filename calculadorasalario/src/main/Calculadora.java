package calculadorasalario.src.main;

public class Calculadora {
    
    public double calculaSalario(Funcionario funcionario) {

        double salarioBase = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();
        double desconto = calculaDesconto(salarioBase, cargo);
        double salarioLiquido = salarioBase - desconto;

        return salarioLiquido;

    }

    private double calculaDesconto(double salarioBase, Cargo cargo) {
        
        double desconto = 0.00;

        switch(cargo) {
            case DESENVOLVEDOR:
                if (salarioBase >= 3000.00) {
                    desconto = salarioBase * 0.20;
                } else {
                    desconto = salarioBase * 0.10;
                }
                break;
            case DBA:
                if (salarioBase >= 2000.00) {
                    desconto = salarioBase * 0.25;
                } else {
                    desconto = salarioBase * 0.15;
                }
                break;
            case TESTADOR:
                if (salarioBase >= 2000.00) {
                    desconto = salarioBase * 0.25;
                } else {
                    desconto = salarioBase * 0.15;
                }
                break;
            case GERENTE:
                if (salarioBase >= 5000.00) {
                    desconto = salarioBase * 0.30;
                } else {
                    desconto = salarioBase * 0.20;
                }
                break;
        }
        
        return desconto;

    }
}
