 import java.util.Arrays;
 

//  This code gives an sorted array of squared number for a given input of sorted integers consisting negative numbers also
// The method is two pointers where two numbers are compared from both ends and greate number's square is added from backwards in the ouput
 class sortedSquares{
    public static void main(String[] args) {
        int[] inputArray = {-6,-2,1,3,4,5};

        int[] output = new int[inputArray.length];

        output=sorted_squares(inputArray);

        System.out.println("input: "+Arrays.toString(inputArray));

        System.out.println("output: "+Arrays.toString(output));
        
    }

    public static int[] sorted_squares(int[] input){
        int[] output = new int[input.length];

        int i=0,j=input.length-1,k=j;

        while(i<=j){
            if(Math.abs(input[i])>Math.abs(input[j])){
                output[k]=input[i]*input[i];
                i++;
                k--;
            }
            else{
                output[k]=input[j]*input[j];
                j--;
                k--;
            }
        }

        return output;
    }
 }