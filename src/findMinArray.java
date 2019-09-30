import java.util.Scanner;

public class findMinArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int row, column;
        do {
            System.out.print("enter row: ");
            row = scanner.nextInt();
            System.out.print("enter column: ");
            column = scanner.nextInt();
        }while(row<1||column<1);
        System.out.println("nhap cac phan tu : ");
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int[] index = findIndexOfMin(array);
        System.out.print("Min value is: " + array[index[0]][index[1]]+" row: "+index[0]+" column: "+index[1]);
    }
    public static int[] findIndexOfMin(int[][] array){
        int row=0;int column=0;
        int min= array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(min > array[i][j]){
                    min= array[i][j];
                    row=i;
                    column=j;
                }
            }
        }
        int[] index= {row,column};
        return index;
    }
}


