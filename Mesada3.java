
package mesada3;

import java.util.Scanner;

public class Mesada3 {

    public static void main(String[] args) {
    
    objetoMesada mesada = new objetoMesada();
    Scanner sc = new Scanner(System.in);
    
    mesada.setIdade(16);
    mesada.setNome("Ana");
    mesada.setMesada(100);
        System.out.println(mesada);
        
    int x = sc.nextInt();
    String porcentagem = null;
    double numeros = 0;
    switch(x){
        
        case 5: 
            porcentagem = "5%";
            numeros = 5 + mesada.getMesada();
            break;
        case 3:
            porcentagem = "3%";
            numeros = 3 + mesada.getMesada();
            break;
    }
        System.out.println( "total:" + numeros);
           
    }
    
   
        
        
        
        
    
    }
}
