public class Q01_ThreeDMatrixUsingOneD {

    static final int X = 3;
    static final int Y = 3;
    static final int Z = 3;

    static int toOneDIndex(int x, int y, int z) {
        return x * (Y * Z) + y * Z + z;
    }

    static int[] convertToOneD(int[][][] threeD) {
        int[] oneD = new int[X * Y * Z];

        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                for (int z = 0; z < Z; z++) {
                    int index = toOneDIndex(x, y, z);
                    oneD[index] = threeD[x][y][z];
                }
            }
        }
        return oneD;
    }

    static void displayOneD(int[] array) {
        System.out.println("\n1D Array :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void displayThreeD(int[][][] array) {
        System.out.println("3D Array :");
        for (int x = 0; x < X; x++) {
            System.out.println("Layer " + x + ":");
            for (int y = 0; y < Y; y++) {
                for (int z = 0; z < Z; z++) {
                    System.out.print(array[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][][] threeDArray = new int[X][Y][Z];

        int value = 1;
        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                for (int z = 0; z < Z; z++) {
                    threeDArray[x][y][z] = value++;
                }
            }
        }

        displayThreeD(threeDArray);

        int[] oneDArray = convertToOneD(threeDArray);

        displayOneD(oneDArray);
    }
}