package variablesyoperadores;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1) Declaracion y uso de variables
        System.out.println("=== 1) Declaracion y Uso de Variables ===");

        System.out.print("Ingresa un numero entero (int): ");
        int edadUsuario = scanner.nextInt();

        System.out.print("Ingresa un numero decimal (double): ");
        double promedioNotas = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Ingresa un texto (String): ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingresa un valor booleano (true/false): ");
        boolean estaActivo = scanner.nextBoolean();

        System.out.println("\n--- Valores ingresados ---");
        System.out.println("int (edadUsuario): " + edadUsuario);
        System.out.println("double (promedioNotas): " + promedioNotas);
        System.out.println("String (nombreCompleto): " + nombreCompleto);
        System.out.println("boolean (estaActivo): " + estaActivo);

        // 2) Operaciones matematicas
        System.out.println("\n=== 2) Operaciones Matematicas ===");

        System.out.print("Ingresa el primer numero (int): ");
        int numeroInt1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero (int): ");
        int numeroInt2 = scanner.nextInt();

        System.out.println("\n--- Resultados con int ---");
        System.out.println("Suma: " + (numeroInt1 + numeroInt2));
        System.out.println("Resta: " + (numeroInt1 - numeroInt2));
        System.out.println("Multiplicacion: " + (numeroInt1 * numeroInt2));

        if (numeroInt2 != 0) {
            System.out.println("Division (int/int): " + (numeroInt1 / numeroInt2));
            System.out.println("Nota: En int la division elimina los decimales.");
        } else {
            System.out.println("Division: No se puede dividir entre 0.");
        }

        // double
        System.out.print("\nIngresa el primer numero (double): ");
        double numeroDouble1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero (double): ");
        double numeroDouble2 = scanner.nextDouble();

        System.out.println("\n--- Resultados con double ---");
        System.out.println("Suma: " + (numeroDouble1 + numeroDouble2));
        System.out.println("Resta: " + (numeroDouble1 - numeroDouble2));
        System.out.println("Multiplicacion: " + (numeroDouble1 * numeroDouble2));
        if (numeroDouble2 != 0) {
            System.out.println("Division: " + (numeroDouble1 / numeroDouble2));
        } else {
            System.out.println("Division: No se puede dividir entre 0.");
        }

        // float
        System.out.print("\nIngresa el primer numero (float): ");
        float numeroFloat1 = scanner.nextFloat();

        System.out.print("Ingresa el segundo numero (float): ");
        float numeroFloat2 = scanner.nextFloat();

        System.out.println("\n--- Resultados con float ---");
        System.out.println("Suma: " + (numeroFloat1 + numeroFloat2));
        System.out.println("Resta: " + (numeroFloat1 - numeroFloat2));
        System.out.println("Multiplicacion: " + (numeroFloat1 * numeroFloat2));
        if (numeroFloat2 != 0) {
            System.out.println("Division: " + (numeroFloat1 / numeroFloat2));
        } else {
            System.out.println("Division: No se puede dividir entre 0.");
        }

        // short
        System.out.print("\nIngresa el primer numero (short): ");
        short numeroShort1 = scanner.nextShort();

        System.out.print("Ingresa el segundo numero (short): ");
        short numeroShort2 = scanner.nextShort();

        System.out.println("\n--- Resultados con short ---");
        System.out.println("Suma: " + (numeroShort1 + numeroShort2));
        System.out.println("Resta: " + (numeroShort1 - numeroShort2));
        System.out.println("Multiplicacion: " + (numeroShort1 * numeroShort2));
        if (numeroShort2 != 0) {
            System.out.println("Division: " + (numeroShort1 / numeroShort2));
        } else {
            System.out.println("Division: No se puede dividir entre 0.");
        }

        // byte
        System.out.print("\nIngresa el primer numero (byte): ");
        byte numeroByte1 = scanner.nextByte();

        System.out.print("Ingresa el segundo numero (byte): ");
        byte numeroByte2 = scanner.nextByte();

        System.out.println("\n--- Resultados con byte ---");
        System.out.println("Suma: " + (numeroByte1 + numeroByte2));
        System.out.println("Resta: " + (numeroByte1 - numeroByte2));
        System.out.println("Multiplicacion: " + (numeroByte1 * numeroByte2));
        if (numeroByte2 != 0) {
            System.out.println("Division: " + (numeroByte1 / numeroByte2));
        } else {
            System.out.println("Division: No se puede dividir entre 0.");
        }

        // 3) Operaciones logicas
        System.out.println("\n=== 3) Operaciones Logicas ===");

        System.out.print("Ingresa el primer valor numerico: ");
        int valor1 = scanner.nextInt();

        System.out.print("Ingresa el segundo valor numerico: ");
        int valor2 = scanner.nextInt();

        System.out.println("\n--- Comparaciones ---");
        System.out.println(valor1 + " > " + valor2 + " = " + (valor1 > valor2));
        System.out.println(valor1 + " < " + valor2 + " = " + (valor1 < valor2));
        System.out.println(valor1 + " == " + valor2 + " = " + (valor1 == valor2));

        System.out.println("\n--- Operadores logicos ---");
        System.out.println("AND (valor1 > 0 && valor2 > 0) = " + ((valor1 > 0) && (valor2 > 0)));
        System.out.println("OR  (valor1 > 0 || valor2 > 0) = " + ((valor1 > 0) || (valor2 > 0)));

        // 4) Clasificacion de edad
        System.out.println("\n=== 4) Clasificacion de Edad ===");

        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Edad invalida.");
        } else if (edad < 12) {
            System.out.println("Clasificacion: Nino");
        } else if (edad <= 17) {
            System.out.println("Clasificacion: Adolescente");
        } else if (edad <= 59) {
            System.out.println("Clasificacion: Adulto");
        } else {
            System.out.println("Clasificacion: Adulto mayor");
        }

        // 5) Dia de la semana
        System.out.println("\n=== 5) Dia de la Semana ===");

        System.out.print("Ingresa un numero del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero invalido.");
        }

        // 6) Verificacion de acceso
        System.out.println("\n=== 6) Verificacion de Acceso ===");

        scanner.nextLine();

        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "1234";

        System.out.print("Ingresa usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingresa contrasena: ");
        String contrasenaIngresada = scanner.nextLine();

        if (usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.println("Acceso concedido");
        } else if (usuarioIngresado.equals(usuarioCorrecto)) {
            System.out.println("Contrasena incorrecta");
        } else {
            System.out.println("Usuario no registrado");
        }

        System.out.println("\nPrograma finalizado.");
        scanner.close();
    }
}

