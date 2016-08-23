/**
 * Universidad del Valle de Guatemala
* @author Esteban Avalos, Diego Hurtarte
 * Carne: 15059, 15022

// este es el controlador de las acciones del programa, indica como funcionara como vector, array,lista
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    
    //Metodo para leer un archivo .TXT
    public static String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        b.close();
        return cadena;
    }
 
    public static void main(String[] args) throws IOException {
        
        //Se aplica el Singleton
        Calculadora calc = Calculadora.getInstance();
        
        //Se solicitan los datos
        System.out.println("Bienvenido  \n");
        System.out.println("Eliga un tipo de memoria -Lista, Vector, ArrayList-: \n");

        //Se solicita el tipo 
        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
        String tipo = scanner.nextLine();

        //Se implementa el factory
        AbstractStack stackFactoryResult = AbstractFactory.getStack(tipo);
        Stack<String> pila = stackFactoryResult;
        calc.setPila(pila);
        String cadena = muestraContenido("C:\Users\Esteban Avalos\Desktop\archivo.txt");
        int resultado = calc.evaluar( cadena );
        System.out.println("El resultado es: "+resultado);
    }
    
}
