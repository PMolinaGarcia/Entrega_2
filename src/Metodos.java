import java.util.*;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class Metodos {

    //Ejercicio 1: explique qué es un método recursivo.
    //Es un tipo de método que resuelve problemas de una forma similar a la inducción matemática,
    // conociendo la solución correcta para un caso base y llamándose a sí mismo para resolver el problema
    // hasta llegar al caso base.

    //Ejercicio 2: programe las siguientes funciones mediante métodos recursivos:

    public static int sumaNTerminos (int numero){
        if (numero==0){
            return 0;
        }
        return sumaNTerminos(numero-1)+numero;
    }

    public static int sumaNTerminosMemoria (int n, int i, int suma){
        if (i>n){
            return suma;
        }
        else {
            return sumaNTerminosMemoria(n, i+1, suma+i);
        }
    }

    public static int factorial (int numero){
        if (numero==0){
            return 1;
        }
        return factorial(numero-1)*numero;
    }

    public static int factorialMemoria (int numero, int i, int factorial){
        while (i==0){
            i+=1;
        }
        if (i>numero){
            return factorial;
        }
        else{
            return factorialMemoria(numero, i+1, factorial*i);
        }
    }

    public static int potencia (int base, int exponente){
        if (exponente==0){
            return 1;
        }
        return potencia(base, exponente-1)*base;
    }

    public static int sumaListaNumeros (List<Integer> listaDada, int numero) {
        if (numero==0) {
            return 0;
        }
        return sumaListaNumeros(listaDada, numero - 1) + listaDada.get(numero - 1);
    }

    public static int sumaListaNumerosMemoria (List<Integer> listaDada, int n, int i, int suma){
        if (i==n){
            return suma;
        }
        else{
            return sumaListaNumerosMemoria(listaDada, n, i+1, suma+listaDada.get(i));
        }
    }

    public static double mediaListaNumerosMemoria (List<Integer> listaDada, int n, int i, int suma){
        if (i==n){
            return (double) suma/n;
        }
        else{
            return mediaListaNumerosMemoria(listaDada, n, i+1, suma+listaDada.get(i));
        }
    }

    public static double desvTipListaMemoria (List<Integer> listaDada, int n, int i, double sumatorio){
        if (i==n-1){
            return Math.sqrt(sumatorio/n);
        }
        return desvTipListaMemoria(listaDada, n, i+1, sumatorio+Math.pow(listaDada.get(i)-mediaListaNumerosMemoria(listaDada, listaDada.size(), 0, 0),2));
    }

    public static int sumaParesHastaN (int n){
        if (n<2){
            return 0;
        }
        if (n==2){
            return n;
        }
        else {
            while (n%2==1)
                n-=1;
            return sumaParesHastaN(n-1)+n;
        }
    }

    public static int sumaParesHastaNMemoria (int n, int i, int suma){
        if (i>n){
            return suma;
        }
        else {
            while(i%2==1){
                i-=1;
            }
            return sumaParesHastaNMemoria(n, i+2, suma+i);
        }
    }

    public static int sumaParesListaMemoria (List<Integer> listaDada, int n, int i, int suma){
        if (i==n){
            return suma;
        }
        else {
            if (listaDada.get(i)%2==1){
                return sumaParesListaMemoria(listaDada, n, i+1, suma);
            }
            return sumaParesListaMemoria(listaDada, n, i+1, suma+listaDada.get(i));
        }
    }

    public static List<Integer> listaDeParesDeLista (List<Integer> listaDada, int indice){
        if (indice==0){
            return new ArrayList<>();
        }
        else {
            List<Integer> listaResultado = listaDeParesDeLista(listaDada, indice-1);
            if (listaDada.get(indice-1)%2==0){
                listaResultado.add(listaDada.get(indice-1));
            }
            return listaResultado;
        }
    }

    public static List<Integer> listaDeParesHastaN (int n){
        if (n<=2){
            return new ArrayList<>();
        }
        else{
            List<Integer> listaResultado = listaDeParesHastaN(n-1);
            if (n%2==0){
                listaResultado.add(n);
            }
            return listaResultado;
        }
    }

    public static int productoEscalar (List<Integer> vector1, List<Integer> vector2, int n){
        if (n==0){
            return 0;
        }
        else {
            return productoEscalar(vector1, vector2, n-1) + vector1.get(n-1)*vector2.get(n-1);
        }
    }

    public static int terminoNFibonacci (int n){
        if (n<=0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        else {
            return terminoNFibonacci(n-1) + terminoNFibonacci(n-2);
        }
    }

    public static void torresDeHanoi (int discos, char torreOrigen, char torreAuxiliar, char torreDestino) {
        if (discos==1){
            System.out.println("Movemos el disco de " + torreOrigen + " a " + torreDestino);
        }
        else {
            torresDeHanoi(discos-1, torreOrigen, torreDestino, torreAuxiliar);
            System.out.println("Movemos el disco de " + torreOrigen + " a " + torreDestino);
            torresDeHanoi(discos-1, torreAuxiliar, torreOrigen, torreDestino);
        }
    }

    public static double integral (DoubleUnaryOperator funcion, double limInf, double limSup, int n){
        double h = (limSup-limInf)/n;
        return integralEXCuadrado(funcion, limInf,  limSup,  h);
    }

    public static double integralEXCuadrado (DoubleUnaryOperator funcion, double limInf, double limSup, double h){
        if (Math.abs(limSup-limInf)<0.0001) {
            return 0;
        }
        else {
            return integralEXCuadrado(funcion, limInf+h,limSup,h)+funcion.applyAsDouble(limInf)*h;
        }
    }


    public static int sumaCodigos (String str, int indice, int resultado){
        if (str.length()==0){
            return 0;
        }
        if (indice==str.length()){
            return resultado;
        }
        else {
            return sumaCodigos(str,  indice+1, resultado + str.charAt(indice));
        }
    }




}
