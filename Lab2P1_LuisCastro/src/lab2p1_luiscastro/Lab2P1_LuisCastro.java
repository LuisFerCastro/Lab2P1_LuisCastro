/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_luiscastro;
import java.util.Scanner;
/**
 *
 * @author lfern
 */
public class Lab2P1_LuisCastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1. Ejercicio 1: Dibujando triangulos.");
        System.out.println("2. Ejercicio 2: Area de figuras.");
        System.out.println("3. Ejercicio 3. Evaluando numeros.");
        System.out.println("4. Salir del programa.");
        opcion= leer.nextInt();
        
        while(opcion!=4){
          if (opcion==1){
            int longitud1, longitud2, longitud3;
            System.out.print("Ingrese la primera longitud:");
            longitud1 = leer.nextInt();
            while(longitud1<0){
                System.out.println("No pueden ser negativos. Ingrese denuevo");
                longitud1 = leer.nextInt();
            }
            System.out.print("Ingrese la segunda longitud:");
            longitud2 = leer.nextInt();
            while(longitud2<0){
                System.out.println("No pueden ser negativos. Ingrese denuevo");
                longitud2 = leer.nextInt();
             }
            System.out.print("Ingrese la tercera longitud:");
            longitud3 = leer.nextInt();
            while(longitud3<0){
                System.out.println("No pueden ser negativos. Ingrese denuevo");
                longitud3 = leer.nextInt();
            } 
            if (longitud1 + longitud2>longitud3 && longitud1 + longitud3>longitud2
                    && longitud2 + longitud3>longitud1){
                System.out.println("Forman un triangulo.");
            }
            else{
                System.out.println("No forman un triangulo.");
            }
            }//fin del ejercicio 1
          
          if(opcion==2){
            double pi=3.14159;
            double base, altura, radio = 0;
            double Rectangulo, Triangulo, Circulo;
            int opcionEjer2;
            System.out.println("Eliga que figura desea: ");
            System.out.println("1. Rectangulo.");
            System.out.println("2. Triangulo.");
            System.out.println("3. Circulo.");
            opcionEjer2 = leer.nextInt();
            char respuesta = 's';
            
            while(respuesta=='s'||respuesta=='S'){
                if(opcionEjer2==1){
                    System.out.print("Ingrese la base del rectangulo:");
                    base = leer.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo:");
                    altura = leer.nextDouble();
                    Rectangulo = base*altura;
                    System.out.println("El area del rectangulo es: " + Rectangulo);
                }
                else
                    if(opcionEjer2==2){
                        System.out.print("Ingrese la base del triangulo:");
                        base = leer.nextDouble();
                        System.out.print("Ingrese la altura del triangulo:");
                        altura = leer.nextDouble();
                        Triangulo = 0.5*base*altura;
                        System.out.println("El area del triangulo es: " + Triangulo);
                    }
                else
                    if(opcionEjer2==3){
                        System.out.println("Ingrese el radio del circulo:");
                        radio = leer.nextDouble();
                        Circulo = pi*Math.pow(radio,2);
                        System.out.println("El area del circulo es: "+Circulo);
                    }
                System.out.println("Desea calcular el area de otra figura(s/n)?");
                respuesta = leer.next().charAt(0);
                if(respuesta=='s'||respuesta=='S'){
                    System.out.println("Eliga que figura desea: ");
                    System.out.println("1. Rectangulo.");
                    System.out.println("2. Triangulo.");
                    System.out.println("3. Circulo.");
                    opcionEjer2 = leer.nextInt();
                }
            }
          }//fin del ejercicio 2
          
          if (opcion==3){
              System.out.println("Ingrese un numero: ");
              int numero = leer.nextInt();
              int divisores = 0;
              boolean par = false;
              boolean primo = false;
              int restante;
              int contador = 1;
              if (numero%2==0){
                  par = true;
               }
              while(contador<=numero){
                  restante = numero%contador;
                  if(restante==0){
                      divisores++;
                  }
                  contador = contador + 1;
              }  
              
              if (divisores==2){
                  primo=true;
              }
              else{
                  primo=false;
              }
              if(par==true && primo==true){
                  System.out.println("El numero es par y primo.");
              }
              if(par==false && primo==true){
                  System.out.println("El numero es impar y primo.");
              }
              if(par==false && primo==false){
                  System.out.println("El numero es impar."); 
              }
              if(par==true && primo==false){
                  System.out.println("El numero es par.");
              }
            }//fin del ejercicio 3
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1. Ejercicio 1: Dibujando triangulos.");
        System.out.println("2. Ejercicio 2: Area de figuras.");
        System.out.println("3. Ejercicio 3. Evaluando numeros.");
        System.out.println("4. Salir del programa.");
        opcion= leer.nextInt();
        }
    }//fin del main    
}//fin del programa
