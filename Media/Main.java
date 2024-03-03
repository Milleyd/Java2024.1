package Media;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String repetir;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        do {
            Aluno aluno = new Aluno();

            System.out.println("Digite o Nome do aluno: ");
            aluno.setNomeCompleto(sc2.nextLine());

            System.out.println("Digite a primeira Nota: ");
            aluno.setNota1(sc.nextDouble());

            System.out.println("Digite a segunda Nota: ");
            aluno.setNota2(sc.nextDouble());

            System.out.println("Digite a terceira Nota: ");
            aluno.setNota3(sc.nextDouble());

            aluno.setMedia((aluno.getNota1() + aluno.getNota2() + aluno.getNota3())/3);

            if (aluno.getMedia() >= 7) {
                System.out.println("Aluno(a) aprovado(a)");
            }
            if (aluno.getMedia() <= 4) {
                System.out.println("Aluno(a) reprovado(a)");
            }

            if (aluno.getMedia() >4 && aluno.getMedia()< 7) {
                System.out.println("Aluno(a) na Final.");
            }


            System.out.println("Nome Completo: " + aluno.getNomeCompleto());
            System.out.println("A Média foi de: " + aluno.getMedia());
            System.out.println("As notas do(a) Aluno(a)  " + aluno.getNomeCompleto() + " foram: " + aluno.getNota1()  + ", "  + aluno.getNota2()  + " e " + aluno.getNota3() );



            System.out.println("Deseja Cadastrar outro Aluno? S/N");
            repetir = sc.next();
        }while (repetir.equalsIgnoreCase("S"));
    }
}