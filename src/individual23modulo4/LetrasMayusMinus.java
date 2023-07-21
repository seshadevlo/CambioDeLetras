package individual23modulo4;

import java.util.Scanner;

public class LetrasMayusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una el texto que deseas alterar:");
        String input = scanner.nextLine();

        String resultado = cambiarLetras(input);

        System.out.println("Resultado: " + resultado);
    }

    public static String cambiarLetras(String input) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);

            if (Character.isLowerCase(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else if (Character.isWhitespace(caracter) || Character.isDigit(caracter)) {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}
