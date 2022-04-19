public class Arrays {

    public static void main(String[] args) {
        int [] arr = new int[5];
        int [] arr3, arr4;
        int arr2[] = new int[10];
        int arr5[], plainInt;

        System.out.println(arr[0]); //-> first
        System.out.println(arr[4]); //-> last

        arr[0] = 3;

//        System.out.println(arr[10]);

//        int [][] matrix = new int[2][];
        int [][] matrix = {{1, 2}, {3, 4}};
        System.out.println(matrix[1][1]);

        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
