
import java.util.Scanner;


public class ColectivoDoWhile {
    
    public void principal() {
        Scanner scan = new Scanner(System.in);
        boolean llegadaColectivo;
        do {
            System.out.println("Esperando el colectivo");
            System.out.println("Llego el colectivo? (V o F)"); 
            llegadaColectivo = scan.nextBoolean();
        } while(llegadaColectivo == false);
        System.out.println("Ya llegó el colectivo");
    }
    
    public static void main(String[] args) {
        ColectivoDoWhile c = new ColectivoDoWhile();
        c.principal();
    }       
}
