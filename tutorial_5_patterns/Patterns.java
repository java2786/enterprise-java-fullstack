public class Patterns {
    static void createSquare() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void createRectangle_1() {
        int n = 5;
        for (int i = 1; i <= n * 2; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void createRectangle_2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void createTriangle_1() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void createTriangle_2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

    }

    static void createTriangle_3() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

    }

    static void createHollowSquare() {
        int n = 5;
        int rows = (int) (n * 1.5);
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == rows || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void createZShape() {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i + j == n + 1 || i == j) {
                    System.out.print("* ");
                    // 15 24 33 42 51
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void createTriangle_A() {
        int n = 10;
        int c = 2324;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (c + j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void createTriangle_reverse() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(". ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }

    static void create8() {
        int num = 5;
        for (int i = 0; i < (num * 2) - 1; i++) {
            for (int j = 0; j < num; j++) {
                if ((i == 0 && j == num - 1) || (i == num - 1 && i == j) || (i == (2 * num) - 2 && j == num - 1)) {
                    System.out.print("  ");
                } else if (i == 0 || j == 0 || i == (num * 2) - 2 || j == num - 1 || i == num - 1) {
                    System.out.print("* ");
                    // System.out.print(i+""+j+" ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    static void create4() {
        int num = 8;
        for (int i = 0; i < (num * 1.5) - 1; i++) {
            for (int j = 0; j <= num; j++) {
                if (i + j == num - 1 || i == num - 1 || j == num - 1) {
                    System.out.print("* ");
                    // System.out.print(i+""+j+" ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    static void createK() {
        int num = 5;

        for (int i = 1; i < 2 * num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || i + j == num + 1 || i - j == num - 1) {
                    System.out.print("* ");
                } else {
                    // System.out.print(i+""+j+" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void createM() {
        int num = 8;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if(j==1 || j==num || (i==j&&i<=(num+1)/2) || (i+j==num+1 && i<=(num+1)/2)){
                    System.out.print("* ");
                } else{
                    // System.out.print(i + "" + j + " ");
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // createSquare();
        // createRectangle_1();
        // createRectangle_2();
        // createTriangle_1();
        // createTriangle_2();
        // createTriangle_3();
        // createHollowSquare();
        // createZShape();
        // createTriangle_A();
        // createTriangle_reverse();
        // create8();
        // create4();
        // createK();
        createM();
    }
}
