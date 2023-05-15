import java.util.Scanner;


public class ClienteRelojs
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numeroCompradores;
    ClientePoo[] losClientes = new ClientePoo [50];
    
    String Id, nombre;
    double reloj1, reloj2;
    double Total = 0 ;
    System.out.println("Digite cuantos compradores son");
    numeroCompradores = sc.nextInt();
    for(int i = 0; i < numeroCompradores ; i++)
    {
        System.out.println("Digite la identificacion del comprador: ");
        Id = sc.next();
         System.out.println("Digite su nombre: ");
        nombre = sc.next();
         System.out.println("Digite el valor del primer reloj: ");
        reloj1 = sc.nextDouble();
         System.out.println("Digite el valor del segundo reloj: ");
        reloj2 = sc.nextDouble();
        
        ClientePoo unCliente = new ClientePoo();
        unCliente.Id = Id;
        unCliente.nombre = nombre;
        unCliente.relojuno = reloj1;
        unCliente.relojdos = reloj2;
      }
      for (int i = 0; i < numeroCompradores; i++){
          double sum = losClientes[i].relojuno + losClientes[i].relojdos;
          Total = sum;
        }
        System.out.println("EL VALOR TOTAL DE SU COMPRA ES: " + Total);
        System.out.println("GRACIAS VUELVA PRONTO  ;D");
        System.out.println("      DAGO´S COMPANY   ");
      }
    }
    
 
     
       
    

    