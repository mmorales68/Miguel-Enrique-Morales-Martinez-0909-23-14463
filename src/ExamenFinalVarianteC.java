import java.util.Objects;
import java.util.Scanner;

public class ExamenFinalVarianteC {
    Scanner scanner=new Scanner(System.in);

    ExamenFinalVarianteC() {
    }

    void numeroMayor(){
        int num1,num2,num3;

        System.out.print("Ingrese el primer numero \n");
        num1=scanner.nextInt();
        System.out.print("Ingrese el segundo numero\n");
        num2=scanner.nextInt();
        System.out.print("Ingrese el tercer numero\n");
        num3=scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El primer numero es mayor: "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("El segundo numero es mayor: "+num2);
        }else if(num3>num1 && num3>num2){
            System.out.println("El tercer numero es mayor: "+num3);
        }else{
            System.out.println("Los tres numeros son iguales");
        }

    }

    void concatenarTexto(){
        String texto1,texto2,texto3;
        String resultado;

        System.out.print("Ingrese el primer texto \n");
        texto1=scanner.next();
        System.out.print("Ingrese el segundo texto \n");
        texto2=scanner.next();
        System.out.print("Ingrese el tercer texto \n");
        texto3=scanner.next();

        resultado=texto1.concat(texto2).concat(texto3);

        System.out.println(resultado);
    }

    double calculadora(){
        double num1,num2,resultado=0;
        String operador;
        System.out.print("Ingrese el primer numero \n");
        num1=scanner.nextDouble();
        System.out.print("Ingrese el segundo numero \n");
        num2=scanner.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /)\n");
        operador=scanner.next();

        if (Objects.equals(operador, "+")){
            resultado=num1+num2;
        }else if(Objects.equals(operador,"-")){
            resultado=num1-num2;
        }else if(Objects.equals(operador,"*")){
            resultado=num1*num2;
        }else if(Objects.equals(operador,"/")){
            resultado=num1/num2;
        }

        return (resultado);
    }

    void primos(){
        int numero;
        boolean verificador=true;
        System.out.print("Ingrese un numero para determinar si es primo o no\n");
        numero=scanner.nextInt();

        for(int i=2;i<numero && verificador;i++){
            if (numero%i==0){
                verificador=false;
                //System.out.println(i);
            }
        }
        if(verificador) {
            System.out.println("El numero "+numero+" es primo");
        }else {System.out.println("El numero "+numero+" no es primo");}
    }


}
