interface Function {
    int evaluate(int x);
}

class Half implements Function {
    public int evaluate(int x) {
        return x / 2;
    }
}

class Client {

    public static int[] processArray(int[] arr) {
        Half h = new Half();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = h.evaluate(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int[] newArr = processArray(arr);

        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
