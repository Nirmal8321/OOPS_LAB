class Matrix3D {

    static int X = 3, Y = 3, Z = 3;

    public static void set(int value, int indexX, int indexY, int indexZ, int[] arr) {
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        arr[index] = value;
    }

    public static int get(int indexX, int indexY, int indexZ, int[] arr) {
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = new int[X * Y * Z];

        set(10, 1, 1, 1, arr);
        System.out.println("Value at (1,1,1): " + get(1,1,1,arr));
    }
}
