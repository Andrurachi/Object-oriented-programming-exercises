// Hecho por Laura Daniela Agudelo Cruz y Andrés David Ramírez Chiquillo c:

public class Practica {
    public static void main(String[] args) {
        int[][] cerveza = {{1,2,3},{4,5,6},{7,8,9}};
        char[][] cafe = new char[][]{{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}};
        int d[];
        d = new int[3];
        char c[];
        c = new char[4];

        for(int i= 0; i < 3; i++){
            d[i] = cerveza[i][i];
        }

        for(int i = 3; i > -1; i--){
            c[i] = cafe[i][3-i];
        }

        System.out.print("Los productos a los que el robot les debe hacer control de calidad son los ");
        for(int i= 0; i <= 2; i++){
            System.out.print("");
            
            if (i != 2){
                System.out.print("'" + d[i]+ "', ");
            }else{
                System.out.print("y '" + d[i]+ "' ");
            }
        }
        System.out.print("de cerveza y los ");
        
        for(int i= 3; i >= 0; i--){
            if (i != 0){
                System.out.print("'"+ c[i]+ "', ");
            }else{
                System.out.print("y '" + c[i]+ "' ");
            }

        }
        System.out.print("de café.");


    }
}
