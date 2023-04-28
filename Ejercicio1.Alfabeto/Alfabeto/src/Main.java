public class Main {
    public static void main(String[] args) throws Exception {
        final int FILAS = 3;
        final int COLUMNAS = 5;
        char[][] letras = new char[FILAS][COLUMNAS];
        char letraQueToca = 'A';
 
        //Carga las letras en la matriz
        for(int f=0; f<FILAS; f++) {
            for(int c=0; c<COLUMNAS; c++) {
                letras[f][c] = letraQueToca;
                letraQueToca++;
            }
        }
 
        //Mostrar en pantalla la matriz
        for(int f=0; f<FILAS; f++) {
            for(int c=0; c<COLUMNAS; c++) {
                System.out.print(letras[f][c]+" ");
            }
            System.out.println();
        }
    }
}
