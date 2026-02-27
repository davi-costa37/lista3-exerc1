package lista3rec;

public class recursivacontrollerex1 {

    public int contarDigitos(int numero) {

        /*
         CONDIÇÃO DE PARADA:
         Quando o número for menor que 10.
         Isso significa que ele possui apenas 1 dígito.
         Então retornamos 1.
        */
        if (numero < 10) {
            return 1;
        }

        /*
         TERMO N EM FUNÇÃO DO TERMO ANTERIOR:

         A quantidade de dígitos de um número pode ser definida como:

         D(n) = 1 + D(n / 10)

         Ou seja:
         - Removemos o último dígito dividindo o número por 10.
         - Somamos 1 para cada chamada recursiva.
        */

        return 1 + contarDigitos(numero / 10);
    }
}