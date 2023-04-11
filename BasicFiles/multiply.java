import java.util.*;

class multiply {
    static int multi(int a[], int b[]) {
        return crr[i][j];
    }

    static int multi(int a[], int b[]) {
        return arr[i][j] * brr[i][j];
    }

    class dimatmulti {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr;
            int[][] brr;
            int[][] crr;

            int r = sc.nextInt();
            int c = sc.nextInt();
            arr = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.print("enter the second array\n");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            brr = new int[r1][c1];
            crr = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {

                    brr[i][j] = sc.nextInt();
                }
            }
            System.out.print("enter the addition array\n");
            if ((r1 == r) && (c == c1)) {
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        crr[i][j] = arr[i][j] + brr[i][j];
                    }
                }

                for (int i = 0; i < r; i++) {
                    System.out.print("\n");
                    for (int j = 0; j < c; j++) {

                        System.out.print(" ", multiple.multi(crr[i][j]));
                    }
                }
            }
        }
    }
}