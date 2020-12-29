public class ArrayPreStreamAPI {
    public static void main(String[] args) {
        ///1
        int[] arr = new int[]{1,2,3,4,5,6,22};

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] < 20) {
                System.out.println(arr[i]);
                counter++;
                if(counter == 3) break;
            }
        }
    }
}
