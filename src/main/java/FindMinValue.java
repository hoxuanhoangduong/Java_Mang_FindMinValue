public class FindMinValue {
    public static void main(String[] args) {
        int []arr = {1,3,5,7,15,16,17,0,1,0};
        int index = minValue(arr);
        System.out.println("The Smallest element in the array is : "+ arr[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
