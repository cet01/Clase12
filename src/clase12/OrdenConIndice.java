
public class OrdenConIndice {
    
    public void seleccion(int[] a, int[] aux) {
        for(int i = 0; i <= a.length - 2; i++) {
            int pos = i;
            for(int j = i + 1; j <= a.length - 1; j++) {
                if(comparar(a, aux, pos, j) == 1)
                    pos = j;
            }
            intercambiar(aux, i, pos);
        }
    }
    
    public void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
    
    public int comparar(int[] a, int[] aux, int i, int j) {
        if(a[aux[i]] == a[aux[j]]) {
            return 0;
        }
        else {
            if(a[aux[i]] < a[aux[j]])
                return -1;
            else   
                return 1;
        }
    }
    
    public void cargar(int[] a, int numAzar) {
        for(int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * numAzar);
    }
    
    public void inicializar(int[] a) {
        for(int i = 0; i < a.length; i++)
            a[i] = i;
    }
    
    public void escribirEnUnaLinea(int[] a) {
        for(int i = 0; i < a.length - 1; i++)
            System.out.print(a[i] + " ");
        System.out.println(a[a.length - 1]);
    }
    
    public void escribirConIndice(int[] a, int[] aux) {
        for(int i = 0; i < a.length - 1; i++)
            System.out.print(a[aux[i]] + " ");
        System.out.println(a[aux[a.length - 1]]);
    }
    
    public void mostrarArreglos(int[] a, int[] aux) {
        System.out.print("a[i] = ");
        escribirEnUnaLinea(a);
        System.out.print("aux[i] = ");
        escribirEnUnaLinea(aux);
        System.out.print("a[aux[i]] = ");
        escribirConIndice(a, aux);
    }
    
    public void principal() {
        int n = 10;
        int[] a, aux;
        a = new int[n];
        aux = new int[n];
        cargar(a, 100);
        inicializar(aux);
        System.out.println("Antes de ordenar");
        mostrarArreglos(a, aux);
        System.out.println("Ordenando...");
        seleccion(a, aux);
        System.out.println("Despues de ordenar");
        mostrarArreglos(a, aux);
    }
    
    public static void main(String[] args) {
        OrdenConIndice programa = new OrdenConIndice();
        programa.principal();
    }
}