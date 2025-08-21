public class getLargestAndSmallest {

    public static int get_Largest_And_Smallest(int numbers[]){
        int Largest = Integer.MIN_VALUE; //-infinity
        int Smallest = Integer.MAX_VALUE; //+infinity

        for(int i=0; i<numbers.length; i++){
            if(Largest<numbers[i]){
                Largest = numbers[i];
            }

            if(Smallest>numbers[i]){
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest Number: "+Smallest);
        return Largest;
    }
    public static void main(String[] args){
        int numbers[] = {1, 2, 4, 6, 8, 3};

        System.out.println("Largest Number: "+get_Largest_And_Smallest(numbers));

    }
}
