package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int repetir;
        Scanner sc = new Scanner(System.in);


        do {
            Numeros numeros = new Numeros();


            System.out.println("Digite o primeiro número: ");
            numeros.setN1(sc.nextDouble());

            System.out.println("Digite o primeiro número: ");
            numeros.setN2(sc.nextDouble());

            System.out.println("Digite 1 para soma, 2 para Subtração, 3 para multiplicação e 4 para divisão.");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    double soma = numeros.getN1() + numeros.getN2();
                    System.out.println(soma);
                    break;

                case 2:
                    double subtracao = numeros.getN1() - numeros.getN2();
                    System.out.println();
                    break;

                case 3:
                    double multiplicacao = numeros.getN1() * numeros.getN2();
                    System.out.println();
                    break;

                case 4:
                    double divisao = numeros.getN1() / numeros.getN2();
                    System.out.println();
                    break;

            }

            System.out.println("Deseja fazer uma nova Operação? Digite 0.");
            repetir = sc.nextInt();
        }while (repetir == 0);
    }
}