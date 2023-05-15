import java.util.Scanner;
public class VentaRelojs
{
  public static void main(String[] args ){
      Scanner sc = new Scanner (System.in);
      String [] nombres = new String [50];
      String [] Identificacion = new String [50];
      double [] relojuno = new double [50];
      double [] relojdos = new double [50];
      
      int numeroCompradores;
       
      String nombre, Id;
    
      double reloj1, reloj2;
      double total = 0;
      
      System.out.println("Digite cantidad de compradores: ");
      numeroCompradores = sc.nextInt();
      for(int i = 0 ; i < numeroCompradores; i++){
        System.out.println("Digite su numero de identificacion: ");
        Id = sc.next();
        System.out.println("Digite su nombre: ");
        nombre = sc.next();
        System.out.println("Digite el valor del primer reloj: ");
        reloj1 = sc.nextDouble();
        System.out.println("Digite el valor del segundo reloj: ");
        reloj2 = sc.nextDouble();
        
        Identificacion [i] = Id;
        nombres [i] = nombre;
        relojuno [i] = reloj1;
        relojdos [i] = reloj2;
            
        }
        for (int i = 0; i < numeroCompradores;i++){
            total = total + relojuno[i] + relojdos [i] ;
        }
        System.out.println("El TOTAL DE SU COMPRA ES: " + total);
  }
}