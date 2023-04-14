package calculadorasalario.src.main;

public class Funcionario {
    
    private String nome;
    private String email;
    private double salarioBase;
    private Cargo cargo;

    public Funcionario(String nome, String email, double salarioBase, Cargo cargo) {
        this.setNome(nome);
        this.setEmail(email);
        this.setSalarioBase(salarioBase);
        this.setCargo(cargo);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
