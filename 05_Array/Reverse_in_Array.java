import java.util.Arrays;
public class Reverse_in_Array {

    public static void reverseInArray(int arr[]){
        int start = 0, end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int numbers[] = {2, 6, 8, 10, 4};

        reverseInArray(numbers);
        System.out.print("Reverse Array: ");

        for(int i=0; i<numbers.length; i++){
            System.out.print(+numbers[i]+" ");
        }
        System.out.println();
    }
}
