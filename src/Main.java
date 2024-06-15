import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int opcion;
        while(true){
            System.out.println("""
                    Ingrese el numero de de ejercicio para ejecutar
                    
                    1)  Numero mayor
                    2   Concatenar texto
                    3)  Calculadora
                    4)  Determinar si un numero es primo
                    5)  Agregar estudiantes
                    6)  Mostar estudiantes
                    
                    """);
                    opcion=scanner.nextInt();

            switch(opcion){
                case 1:
                    new ExamenFinalVarianteC().numeroMayor();
                break;
                case 2:
                    new ExamenFinalVarianteC().concatenarTexto();
                break;
                case 3:
                    //new ExamenFinalVarianteC().calculadora();
                    System.out.println(new ExamenFinalVarianteC().calculadora());
                break;
                case 4:
                    new ExamenFinalVarianteC().primos();
                break;
                case 5:System.out.println("Agregar estudiantes");
                break;
                case 6:System.out.println("Mostar estudiantes");
                break;

                default:System.out.println("Opcion invalida, intente nuevamente");
                break;

            }
        }

    }
}