
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Informe um número: ");
                int numero = scanner.nextInt();


                if (verificarFibonacci(numero)) {
                    System.out.println(numero + " pertence à sequência de Fibonacci.");
                } else {
                    System.out.println(numero + " não pertence à sequência de Fibonacci.");
                }

                scanner.close();
            }

            public static boolean verificarFibonacci(int numero) {
                int a = 0;
                int b = 1;

                while (b < numero) {
                    int temp = b;
                    b = a + b;
                    a = temp;
                }

                return b == numero;
            }
        }




