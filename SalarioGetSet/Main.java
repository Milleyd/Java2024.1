package SalarioGetSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            Pessoa pessoa = new Pessoa();

            System.out.println("Digite a Matrícula do Colaborador:");
            pessoa.setMatricula(sc.next());

            System.out.println("Digite o Nome do Colaborador:");
            pessoa.setNomeCompleto(sc2.nextLine());

            System.out.println("Digite o salário bruto:");
            pessoa.setSalBruto(sc.nextDouble());

            pessoa.setIr((pessoa.getSalBruto()* 15)/100);
            pessoa.setSalario(pessoa.getSalBruto() - pessoa.getIr());

            System.out.println("Matrícula: " + pessoa.getMatricula());
            System.out.println("Nome Completo: " + pessoa.getNomeCompleto());
            System.out.println("O salário bruto é de: " + pessoa.getSalBruto());
            System.out.println("A dedução do IR foi de: " + pessoa.getIr());
            System.out.println("O salário Líquido é de: " + pessoa.getSalario());



            System.out.println("Deseja Cadastrar outro colaborador? S/N");
            repetir = sc.next();
        }while (repetir.equalsIgnoreCase("S"));

    }
}