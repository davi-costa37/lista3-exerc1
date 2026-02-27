package lista3rec;

import java.util.Scanner;

public class exerc1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Caso o número seja negativo, transformamos em positivo
        if (numero < 0) {
            numero = numero * -1;
        }

        recursivacontrollerex1 controller = new recursivacontrollerex1();

        int quantidade = controller.contarDigitos(numero);

        System.out.println("Quantidade de dígitos: " + quantidade);

        scanner.close();
    }
}