package tables;

public class MultiArray {
    public static void main(String[] args) {
        char [][] t = {
                {'_', 'X', '_'},
                {'_', 'O', '_'},
                {'_', 'X', 'O'}

        };
        // petla iterujaca po wierszach
        for (int i =0; i < t.length; i++){
            for (int j=0; j < t[i].length; j++){
                System.out.printf("%3c", t[i][j]);
            }
            System.out.println(); //przeniesienie wiersza do nowej linii
        }
    }
}
