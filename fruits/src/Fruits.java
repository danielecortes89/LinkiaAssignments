
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 34638
 */
public class Fruits {

     String fruitname;
    public String fruitmessage;
    public int fruitprice;
    public String unidadMedida;
    
    public Fruits(String name, int price, String message, String unidad) {
    fruitname = name;
    fruitprice = price;
    fruitmessage = message;
    unidadMedida = unidad;
    
  }
  
    
    
    public static void main(String[] args) throws InterruptedException {
        
        int cajaMenor = 20;
        
        Fruits pera = new Fruits("pera",2, "Cuantas peras quieres? ", "Unds");
        Fruits platano = new Fruits("platano", 3, "Cuantos kilos de platano quieres? ", "K");
        Fruits sandia = new Fruits("sandia", 7, "Cuantos kilos de sandia queires", "K");
        Fruits mango = new Fruits("mango", 2, "Cuantos mangos quieres?", "Unds");
        Fruits melocoton = new Fruits("melocoton", 1, "Cuantos melocotones?", "Unds");
        Fruits manzana = new Fruits("manzana", 1, "Cuantas Manzanas?", "Unds");
        
        
        
        System.out.println("Bienvenido/a a nuestra fruteria. Hoy tenemos la siguiente seleccion de frutas: ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(pera.fruitname +"\t\t"+pera.fruitprice + "\n" + platano.fruitname +"\t\t"+platano.fruitprice + "\n" + sandia.fruitname +"\t\t"+sandia.fruitprice + "\n" +  mango.fruitname +"\t\t"+mango.fruitprice + "\n" + melocoton.fruitname +"\t"+melocoton.fruitprice+ "\n" + manzana.fruitname+"\t\t"+manzana.fruitprice);
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("Escribe las frutas que deseas separadas por espacios:  ");
    
        Scanner in = new Scanner(System.in);
        String userChoice = in.nextLine();
        System.out.println(userChoice);
        
        String[] ary = userChoice.split(" ");
        System.out.println(Arrays.toString(ary));
        
        String[] tempArray = new String[ary.length];
        
        for(int i = 0, j = 0; i<ary.length; i++){
           tempArray[j] = ary[i].toLowerCase();
        }
        List<String> list = new ArrayList<String>(Arrays.asList(tempArray));
        list.removeAll(Arrays.asList("", null));
       
        System.out.println(Arrays.toString(tempArray));
        System.out.println(tempArray[1].getClass());
        System.out.println(list);
        
        
        
        
    }
    
}
