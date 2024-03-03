package SalarioGetSet;

public class Pessoa {
    private String matricula;
    private String nomeCompleto;
    private Double salBruto;
    private Double salario;
    private Double ir;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setSalBruto(Double salBruto) {
        this.salBruto = salBruto;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setIr(Double ir) {
        this.ir = ir;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Double getSalBruto() {
        return salBruto;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getIr() {
        return ir;
    }
}