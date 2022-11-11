
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
        int subtotal = 0;
        String factura = """
                         \tFactura de venta.
                         Lista de productos:
                         
                         Producto\tPrecio/u\tCantidad\tTotal
                         
                          """;
        Fruits[] basket;
        basket = new Fruits[6];
        basket[0] = new Fruits("pera",2, "Cuantas peras quieres? ", "Unds");
        basket[1] = new Fruits("platano", 3, "Cuantos kilos de platano quieres? ", "K");
        basket[2] = new Fruits("sandia", 7, "Cuantos kilos de sandia queires", "K");
        basket[3] = new Fruits("mango", 2, "Cuantos mangos quieres?", "Unds");
        basket[4] = new Fruits("melocoton", 1, "Cuantos melocotones quieres?", "Unds");
        basket[5] = new Fruits("manzana", 1, "Cuantas Manzanas quieres?", "Unds");
            
        System.out.println("Bienvenido/a a nuestra fruteria. Hoy tenemos la siguiente seleccion de frutas: \nPRODUCTO\tPRECIO");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(basket[0].fruitname +"\t\t"+basket[0].fruitprice + "\n" + basket[1].fruitname +"\t\t"+basket[1].fruitprice + "\n" + basket[2].fruitname +"\t\t"+basket[2].fruitprice + "\n" +  basket[3].fruitname +"\t\t"+basket[3].fruitprice + "\n" + basket[4].fruitname +"\t"+basket[4].fruitprice+ "\n" + basket[5].fruitname+"\t\t"+basket[5].fruitprice);
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("Escribe las frutas que deseas separadas por coma:  ");
    
        Scanner in = new Scanner(System.in);
        String userChoice = in.nextLine();
                
        String[] ary = userChoice.split(",");
                
        String[] tempArray = new String[ary.length];
        
        for(int i = 0, j = 0; i<ary.length; i++){
           tempArray[j++] = ary[i].trim().toLowerCase();
        }
        
       
        System.out.println(Arrays.toString(tempArray));
             
        for (String fruit:tempArray){
            boolean flag = false; 
            for (Fruits basket1 : basket) {
                if(basket1.fruitname == null ? fruit == null : basket1.fruitname.equals(fruit)){
                    flag = true;
                    System.out.println("Si tenemos " + fruit + "s");
                    System.out.println(basket1.fruitmessage);
                    String cantidadFruta = in.nextLine();
                    int intFruta = Integer.parseInt(cantidadFruta);
                    while (intFruta < 0){
                        System.out.println("ingresaste un numero negativo, nos vas a regalar fruta? \nVuelve a ingresar un numero");
                            String cantidadFruta1 = in.nextLine();
                            intFruta = Integer.parseInt(cantidadFruta1);
                            }
                    
                    int totalxFruta = intFruta * basket1.fruitprice;
                    subtotal += totalxFruta;
                    factura = factura + basket1.fruitname + "\t\t" + basket1.fruitprice + "\t\t" + intFruta + "\t\t" + totalxFruta + "\n" ;
                }
                
                
            }
            
            if(!flag){System.out.println("no tenemos " + fruit + " o has ingresado un valor incorrecto");}
             
        }
        
        
        
        System.out.println(subtotal);
        
        
         System.out.println(factura);
        
        
        
    }
    
}
