import java.util.Scanner;

public class ex05 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();
            String fraseInvertida = "";

            for (int i = frase.length() - 1; i >= 0; i--) {
                fraseInvertida += frase.charAt(i);
            }

            System.out.println("Frase invertida: " + fraseInvertida);

            scanner.close();
        }
    }


