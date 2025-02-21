import java.util.*;

public class Principal {

    public static void main (String[] args){

        int numeroNTerminos = 10;
        System.out.println("\n\nLa suma de los " + numeroNTerminos + " primeros numeros es " + Metodos.sumaNTerminos(numeroNTerminos));
        System.out.println("\n\nLa suma de los " + numeroNTerminos + " primeros numeros es " + Metodos.sumaNTerminosMemoria(numeroNTerminos,0,0));

        int numeroFactorial = 10;
        System.out.println("\n\nEl factorial de " + numeroFactorial + " es " + Metodos.factorial(numeroFactorial));
        System.out.println("\n\nEl factorial de " + numeroFactorial + " es " + Metodos.factorialMemoria(numeroFactorial,0,1));

        int basePotencia = 5;
        int exponentePotencia = 10;
        System.out.println("\n\n" + basePotencia + " elevado a " + exponentePotencia + " es " + Metodos.potencia(basePotencia, exponentePotencia));

        Integer[] arrayDadoSuma = {2,3,1,4,8};
        List<Integer> listaDadaSuma = Arrays.asList(arrayDadoSuma);
        System.out.println("\n\nLa suma de los elementos de la lista " + listaDadaSuma + " es " + Metodos.sumaListaNumeros(listaDadaSuma, listaDadaSuma.size()));
        System.out.println("\n\nLa suma de los elementos de la lista " + listaDadaSuma + " es " + Metodos.sumaListaNumerosMemoria(listaDadaSuma, listaDadaSuma.size(), 0, 0));

        Integer[] arrayDadoMedia = {1,7,45,32,23,1};
        List<Integer> listaDadaMedia = Arrays.asList(arrayDadoMedia);
        System.out.println("\n\nLa media de los elementos de la lista " + listaDadaMedia + " es " + Metodos.mediaListaNumerosMemoria(listaDadaMedia, listaDadaMedia.size(), 0, 0));

        Integer[] arrayDadoDesvTip = {1,4,2,87,4,23};
        List<Integer> listaDadaDesvTip = Arrays.asList(arrayDadoDesvTip);
        System.out.println("\n\nLa desviacion tipica de los elementos de la lista " + listaDadaDesvTip + " es " + Metodos.desvTipListaMemoria(listaDadaDesvTip, listaDadaDesvTip.size(), 0, 0));

        int numeroNSumaPares = 13;
        System.out.println("\n\nLa suma de los pares hasta " + numeroNSumaPares + " es " + Metodos.sumaParesHastaN(numeroNSumaPares));
        System.out.println("\n\nLa suma de los pares hasta " + numeroNSumaPares + " es " + Metodos.sumaParesHastaNMemoria(numeroNSumaPares, 0, 0));

        Integer[] arrayDadoSumaPares = {1,1,26,3,5,34,23};
        List<Integer> listaDadaSumaPares = Arrays.asList(arrayDadoSumaPares);
        System.out.println("\n\nLa suma de los pares de la lista " + listaDadaSumaPares + " es " + Metodos.sumaParesListaMemoria(listaDadaSumaPares, listaDadaSumaPares.size(),0, 0));

        Integer[] arrayDadoListaPares = {1,2,3,4,5,6,7,13,38};
        List<Integer> listaDadaListaPares = Arrays.asList(arrayDadoListaPares);
        System.out.println("\n\nLa lista de los pares de la lista " + listaDadaListaPares + " es " + Metodos.listaDeParesDeLista(listaDadaListaPares, listaDadaListaPares.size()));

        int numeroHastaListaPares = 32;
        System.out.println("\n\nLa lista de los pares hasta el numero " + numeroHastaListaPares + " es " + Metodos.listaDeParesHastaN(numeroHastaListaPares));

        Integer[] arrayVector1 = {1,2,3,4};
        Integer[] arrayVector2 = {2,3,4,5};
        List<Integer> vector1 = Arrays.asList(arrayVector1);
        List<Integer> vector2 = Arrays.asList(arrayVector2);
        System.out.println("\n\nEl producto vectorial de " + vector1 + " y " + vector2 + " es " + Metodos.productoEscalar(vector1, vector2, vector1.size()));

        int nFibonacci = 10;
        System.out.println("\n\nEl termino " + nFibonacci + " de la sucesion de Fibonacci es " + Metodos.terminoNFibonacci(nFibonacci-1));

        int discosHanoi = 3;
        char torreOrigen = 'A';
        char torreAuxiliar = 'B';
        char torreDestino = 'C';
        System.out.println("\n\nVamos a solucionar el juego de las torres de Hanoi con " + discosHanoi + " discos y las torres de origen " + torreOrigen + ", auxiliar " + torreAuxiliar + " y de destino " + torreDestino + ": \n");
        Metodos.torresDeHanoi(discosHanoi, torreOrigen, torreAuxiliar, torreDestino);

        double limInf = 0;
        double limSup = 1;
        int pasoIntegral = 20;
        System.out.println("\n\nLa integral definida entre " + limInf + " y " + limSup + ", con un paso de " + pasoIntegral + " de e elevado a x al cuadrado es " + Metodos.integral(x->Math.exp(Math.pow(x,2)),limInf, limSup, pasoIntegral));

        String cadena = "String";
        String S = "S";
        String t = "t";
        String r = "r";
        String i = "i";
        String n = "n";
        String g = "g";
        int longitudCadena = cadena.length();
        System.out.println("\n\nLa suma de los códigos de los caracteres de la palabra " + cadena + " es " + Metodos.sumaCodigos(cadena));
        System.out.println("\n\nLa suma de los códigos de los caracteres de la palabra " + S + " es " + Metodos.sumaCodigos(S));
    }

}
