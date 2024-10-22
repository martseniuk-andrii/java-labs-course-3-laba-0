import lol.kek.Variant11;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import lol.kek.Variant11.PARTS_OF_THE_WORLD;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class TestVariant11 {

    @Test
    public void MassTest() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }


    @Test(dataProvider = "integerProvider")
    public void integerTest(int p1, int[] res) {
        assertArrayEquals(res, new Variant11().integerNumbersTask(p1));
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{{100, new int[]{1,0}}, {120,new int[]{3,0}}, {131, new int[]{5,3}}};
    }

//    @Test(expectedExceptions = AssertionError.class)
//    public void negativeIntegerTest() {
//        new Variant11().integerNumbersTask(-2);
//    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int a, int b, int[] result) {
        assertArrayEquals(result , new Variant11().ifTask(a,b));
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{2, 3, new int[]{3,3}}, {1,1, new int[]{0,0}}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int a, int b, boolean p3) {
        assertEquals(new Variant11().booleanTask(a, b), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{5, 2, false}, {0, 1, false}, {-4, 4, true}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int n1, int n2, PARTS_OF_THE_WORLD result) {
        assertEquals(new Variant11().switchTask(n1, n2), result);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][]{{1, 1, PARTS_OF_THE_WORLD.SOUTH}, {1, -1, PARTS_OF_THE_WORLD.NORTH}, {2, 1, PARTS_OF_THE_WORLD.EAST}, {2,2, PARTS_OF_THE_WORLD.NORTH}};
    }

//    @Test(expectedExceptions = AssertionError.class)
//    public void switchNegativeTest() {
//        new Variant11().forTask(10);
//    }

    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int n, int expected) {
        assertEquals(expected, new Variant11().forTask(n));
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{
                {3, 86},
                {7, 924},
                {12, 4394}
        };
    }

    //////////////////////////////////////////

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int[] res) {
        assertArrayEquals(res, new Variant11().whileTask(a));
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{10, new int[]{4,10}}};
    }


    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][]{{1, 2}, {-2, 1}, {2, -1}};
    }

    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(double[] array, int k, double[] expected) {
        double[] result = new Variant11().arrayTask(array, k);
        assertArrayEquals(expected, result, 0);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][]{{new double[]{10, 2, 3}, 1, new double[]{10, 2, 3}}, {new double[]{10, 2, 13}, 2, new double[]{2}},
                {new double[]{4, 3, 5, -4, 9, 2}, 3, new double[]{5, 2}}};
    }


    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] input, int[][] output) {
        assertArrayEquals(output, new Variant11().twoDimensionArrayTask(input));
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input = {{2, 3, 6, 9, -9},
                {34, 98, -9, 2, 1},
                {-4, 2, 1, 6, 1},
                {-98, 8, 1, 5, 3}};

        int[][] input23 = {{2, 3, 6, 9, -9},
                {1, 2, -9, 98, 34},
                {-4, 2, 1, 6, 1},
                {3, 5,1, 8,-98}};

        return new Object[][]{{input, input23}};

    }

    @Test
    public void arrayTest2() {
        assertArrayEquals(new int[]{2, 3}, new int[]{2, 3});
    }

}