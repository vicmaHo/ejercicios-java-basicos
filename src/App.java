import java.util.PrimitiveIterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicios clase 1 :D");
        ejercicio9();
    }

    private static void ejercicio1() {
        /* 
        Implemente un algoritmo que dado un nombre en 
        una variable de tipo cadena, imprima un saludo en consola.
        */

        // Declaracion de variables - nombre
        String nombre;
        // Proceso
        nombre = "Victor Manuel";
        // Salida
        System.out.println("Hola, " + nombre);

    }

    private static void ejercicio2() {
        /* 
        Implemente un algoritmo que reciba un número por 
        teclado y cuente cuántas cifras (o dígitos) contiene e imprima el mensaje en consola.
        */

        // Declaracion de variables
        int numero;
        var sc = new Scanner(System.in);
        var contador = 0;
        int numcopy;
        // Entrada de datos
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        numcopy = numero;
        while (numero > 0) {
            contador++;
            numero /= 10;
        }
        System.out.printf("El numero de cifras de %d es %d\n", numcopy, contador);
        sc.close();
    }

    private static void ejercicio3() {
        // Escribe un programa Java que lee un número entero por 
        // teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
        int numero;
        int doble;
        int triple;
        var sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para saber su doble y el triple: ");
        numero = sc.nextInt();

        //  Proceso
        doble = numero * 2;
        triple = numero * 3;

        // Salida
        System.out.printf("El doble de %d es: %d\nEl triple de %d es: %d\n", numero, doble, numero, triple);

    }

    private static void ejercicio4() {
        /* 
        Escribe un programa que lea una cantidad de grados centígrados 
        y la pase a grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
        */

        // Variables
        int gradosC;
        double fahrenheit;
        var sc = new Scanner(System.in);

        // entradas
        System.out.print("Ingrese la cantidad de grados centigrados a convertir en farenheit: ");
        gradosC = sc.nextInt();

        // Proceso
        fahrenheit = 32 + (9 * gradosC / 5);

        // salida
        System.out.printf("%d grados centigrados son %.2f grados fahrenheit.\n", gradosC, fahrenheit);
        sc.close();
    }

    private static void ejercicio5() {
        /* 
        Escribe un programa java que lea una variable de tipo entero por teclado.
        A continuación muestra un mensaje indicando si la variable es par o impar.
        Utiliza el operador condicional ( ? : ) para resolverlo. Ej: “14 es par” o “15 es impar”
        */
    
        // Variables
        int numero;
        var sc = new Scanner(System.in);

        // Entradas
        System.out.print("Ingrese un numero para saber si es par o impar: ");
        numero = sc.nextInt();

        // Proceso - salida
        System.out.println((numero % 2 == 0) ? "Es par" : "Es impar");
        sc.close();
    }

    private static void ejercicio6() {
        /* 
        Realizar la suma, la resta, la división y la multiplicación de dos números
        leídos por teclado y mostrar en pantalla 
        "La <operación> de <número 1> y <número 2> es igual a <resultado>".
        */

        // Varibles
        int a;
        int b;
        int suma, resta, mult, divi;
        var sc = new Scanner(System.in);
        // Entradas
        System.out.println("Ingrese los numeros a y b para operarlos.");
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();

        // Proceso
        suma = a + b;
        resta = a - b;
        mult = a * b;
        divi = a / b;

        // Salida
        System.out.printf("La operacion suma de %d y %d es igual a %d\n", a, b, suma);
        System.out.printf("La operacion resta de %d y %d es igual a %d\n", a, b, resta);
        System.out.printf("La operacion multiplicacion de %d y %d es igual a %d\n", a, b, mult);
        System.out.printf("La operacion division de %d y %d es igual a %d\n", a, b, divi);

        sc.close();
    }

    private static void ejercicio7() {
        // TODO: hacer esta vaina
        /* 
        Realizar un programa que realice el promedio de las notas de un alumno, 
        para ello el programa va a tener que solicitar el nombre del alumno y las notas de 
        las 3 evaluaciones. Si el alumno tiene un promedio mayor 
        o igual a 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir 
        “Reprobado”.
        Nota: Las notas que se ingresan pueden tener decimales.
        */
        // Variables
        double eva1, eva2, eva3, promedio;
        String nombre;
        var sc = new Scanner(System.in);
        // Entradas
        
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese la nota de la evaluacion 1: ");
        eva1 = sc.nextDouble();

        System.out.print("Ingrese la nota de la evaluacion 2: ");
        eva2 = sc.nextDouble();

        System.out.print("Ingrese la nota de la evaluacion 3: ");
        eva3 = sc.nextDouble();

        //Proceso - Salida
        promedio = (eva1 + eva2 + eva3) / 3;

        if (promedio >= 3.0) {
            System.out.printf("El estudiante %s Aprobo con un promedio de %.2f\n", nombre, promedio);
        } else {
            System.out.printf("El estudiante %s Reprobo con un promedio de %.2f\n", nombre, promedio);        }
    }

    private static void ejercicio8() {
        /* 
        Realizar un programa que calcule el sueldo de un trabajador, el programa solicita el
         número de horas que has trabajado en un mes, las horas se pagan a $30.000.
        */
        // Variables
        int horas;
        int sueldo;
        var sc = new Scanner(System.in);
        //Entradas
        System.out.print("Ingrese el numero de horas que trabaja al mes: ");
        horas = sc.nextInt();

        // Proceso
        sueldo = horas * 30000;

        // Salida
        System.out.println("EL sueldo del trabajador para este mes es de: " + sueldo);
        sc.close();
    
    }

    private static void ejercicio9() {
        /* 
        Solicitar un número al usuario y mostrar la tabla de multiplicar de ese número,
        desde el 0 hasta el 10.
        Pista: Usa un bucle for para recorrer la tabla y mostrar los datos.
        */
        // Variables
        int numero;
        var sc = new Scanner(System.in);
        // Entradas
        System.out.print("Ingrese un numero para hallar su tabla de multiplicar: ");
        numero = sc.nextInt();

        //Proceso - Salida
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i) );
        }
        sc.close();

    }

    private static void ejercicio10() {
        /* 
        Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que adivinar 
        introduciendo el número por teclado. En el caso que el número a adivinar sea mayor 
        al ingresado, decirle al usuario “El número que busca es mayor”, de lo contrario, 
        “El número que busca es menor”. El programa finalizará cuando se introduzca el número 
        correcto.
        Nota: usar la clase Random para generar el número aleatorio.
        */

        
    }

}
