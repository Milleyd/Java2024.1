package ImpostodeRenda;

public class Pessoa {
    private String matricula;
    private String nomeCompleto;
    private Double salBruto;
    private Double salario;
    private Double ir;

    public void inserirMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void inserirNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void inserirSalario(Double salBruto) {
        this.salBruto = salBruto;
    }

    public void salarioLiquido(Double salario) {
        this.salario = salario;
    }

    public void impostoDeRenda(Double ir) {
        this.ir = ir;
    }

    public String devolverMatricula() {
        return this.matricula;
    }

    public String devolverNome() {
        return this.nomeCompleto;
    }

    public Double devolverSalarioBruto() {
        return this.salBruto;
    }

    public Double devolverSalarioLiquido() {
        return this.salario;
    }

    public Double devolverir() {
        return this.ir;
    }

    public void setMatricula(String next) {
    }
}