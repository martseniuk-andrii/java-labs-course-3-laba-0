package lol.kek;

public class Variant11 {

    public enum PARTS_OF_THE_WORLD{
        SOUTH, NORTH, WEST, EAST  // 0 180 270 90
    }

    /**
     *
     * @param number int
     * @return sum and product
     */

    public int[] integerNumbersTask(int number) {
        int hundreds = number / 100;           // Сотні
        int tens = (number / 10) % 10;         // Десятки
        int ones = number % 10;                // Одиниці

        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        return new int[]{sum, product};
    }

    /**
     *
     * @param number
     * @return true, if number is possitive
     */
    public boolean booleanTask(int A, int B) {
        return A % 2 == 0 && B % 2 == 0;
    }


    /**
     *
     * @param a
     * @param b
     * @return result arr
     */
    public int[] ifTask(int a, int b) {
        if (a==b)
            return new int[]{
                    0, 0
            };
        int max = Math.max(a, b);
        return new int[]{max, max};
    }


    /**
     *
     * @param n1
     * @param n2
     * @return day of week day represented number1
     */
    public PARTS_OF_THE_WORLD switchTask(int n1, int n2) {
        var moveDir = 360;
        var commands = new int[]{n1, n2};

        for (int command : commands) {
            switch (command) {
                case 1: {
                    moveDir -= 90;
                    break;
                }
                case -1: {
                    moveDir += 90;
                    break;
                }
                case 2: {
                    moveDir += 180;
                    break;
                }
            }
        }

        return switch (moveDir % 360 / 90) {
            case 0 -> PARTS_OF_THE_WORLD.NORTH;
            case 1 -> PARTS_OF_THE_WORLD.EAST;
            case 2 -> PARTS_OF_THE_WORLD.SOUTH;
            case 3 -> PARTS_OF_THE_WORLD.WEST;
            default -> PARTS_OF_THE_WORLD.NORTH;
        };
    }


    /**
     *
     * @param n is integer number
     * @return int
     */
    public int forTask(int n) {
        assert n >0: "Argument should be more than zero";
        int sum = n * n;

        for (int i = n + 1; i <= 2 * n; i++) {
            sum += i * i;
        }
        return sum;
    }


    public int[] whileTask(int N) {
        int K = 0;  // Лічильник для числа K
        int sum = 0;  // Сума чисел

        // Поки сума менша за N, збільшуємо K і додаємо його до суми
        while (sum < N) {
            K++;
            sum += K;
        }

        return new int[]{K, sum};
    }

    public double[] arrayTask(double[] array, int k) {
        int n = array.length;
        assert k>=1 && n>=k : "wrong input";
        var outarr = new double[n / k];
        for (int i = 1; i <= outarr.length; i++) {
            outarr[i-1] = array[i * k - 1];
        }
        return outarr;
    }

    /**
     *
     * @param array
     * @return transformed array
     */
    public int[][]  twoDimensionArrayTask(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols]; // Нова матриця для результату

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Якщо рядок непарний (0, 2, 4, ...), копіюємо зліва направо
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix[i][j];
                }
            } else {
                // Якщо рядок парний (1, 3, 5, ...), копіюємо справа наліво
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix[i][cols - j - 1];
                }
            }
        }

        return result;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}