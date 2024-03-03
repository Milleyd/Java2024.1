package ImpostodeRenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            Pessoa pessoa = new Pessoa();

            System.out.println("Digite a Matrícula do Colaborador:");
            pessoa.inserirMatricula(sc.next());

            System.out.println("Digite o Nome do Colaborador:");
            pessoa.inserirNome(sc2.nextLine());

            System.out.println("Digite o salário bruto:");
            pessoa.inserirSalario(sc.nextDouble());

            pessoa.impostoDeRenda((pessoa.devolverSalarioBruto() * 15) / 100);
            pessoa.salarioLiquido(pessoa.devolverSalarioBruto() - pessoa.devolverir());

            System.out.println("Matrícula: " + pessoa.devolverMatricula());
            System.out.println("Nome Completo: " + pessoa.devolverNome());
            System.out.println("O salário bruto é de: " + pessoa.devolverSalarioBruto());
            System.out.println("A dedução do IR foi de: " + pessoa.devolverir());
            System.out.println("O salário Líquido é de: " + pessoa.devolverSalarioLiquido());


            System.out.println("Deseja Cadastrar outro colaborador? S/N");
            repetir = sc.next();
        } while (repetir.equalsIgnoreCase("S"));

    }
}