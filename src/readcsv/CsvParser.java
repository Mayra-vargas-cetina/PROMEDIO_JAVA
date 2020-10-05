import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CsvParser {

    public static void main(String[] args) {
        
        
   
        String fileName= "C:\\Users\\julia\\Desktop\\programacion_2\\Promedio_java\\src\\readcsv\\PromedioCSV.csv";
        File file= new File(fileName);

       
        List<List<String>> lines = new ArrayList<>(); //Se crea una lista de 2 dimensiones
        Scanner inputStream;

        try{
            inputStream = new Scanner(file); //Se usa el método inputstream para leer el archivo

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(","); // Se delimitan los datos del archivo
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values)); //Se agregan las lineas del archivo al arreglo de 2 dimensiones
            }

            inputStream.close(); //Se cierra el método para leer el archivo
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
        
        double notas []=new double[19]; //Definicion de arreglo 
        double suma = 0, suma2 = 0, suma3 = 0, suma4 = 0; double promedio1 = 0, promedio2 = 0, promedio3 = 0, promedio4 = 0; //inicializacion de variables 
         for (int i = 0; i < lines.size(); i++) { //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 2 ; j <3; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma += notas[i];    //Sumatoria de las notas  
             promedio1=suma/(notas.length); //calculo del promedio
            }
               
             
        
          //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 3 ; j <4; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma2 += notas[i];    //Sumatoria de las notas  
             promedio2=suma2/(notas.length); //calculo del promedio
            }
        
          //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 4 ; j <5; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma3 += notas[i];    //Sumatoria de las notas  
             promedio3=suma3/(notas.length); //calculo del promedio
            }
        
          //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 5 ; j <6; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma4 += notas[i];    //Sumatoria de las notas  
             promedio4=suma4/(notas.length); //calculo del promedio
            }
         }  
        
        
        System.out.println("Promedio 1: "+promedio1); 
        System.out.println("Promedio 2: "+promedio2); 
        System.out.println("Promedio 3: "+promedio3); 
        System.out.println("Promedio 4: "+promedio4); 
        double promedio_total=(promedio1+promedio2+promedio3+promedio4)/4;
        System.out.println("Promedio total: "+promedio_total); 
        
         
    }
    

}