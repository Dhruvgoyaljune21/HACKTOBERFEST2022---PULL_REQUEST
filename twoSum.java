 import java.util.HashMap;
import java.util.Map;

//returns the indices the two integers whose sum is the target
 class twoSum{

    public static void main(String[] args) {
        
        int inputArray[]={1, -2, 4, 9, 6, 2, 8};
        int target = 7;
        int outputArray[]=twoSumBruteForce(inputArray, target);
        System.out.println(outputArray[0]+" "+outputArray[1]+" BruteForce");

        outputArray=twoSumOptimized(inputArray, target);
        System.out.println(outputArray[0]+" "+outputArray[1]+" Optimized O(n)");

    }

    // Brute force methord works O(n^2) usinf two for loops
    public static int[] twoSumBruteForce(int[] inputArray,int target){
        int outputArray[]=new int[2];
        
        for(int i=0; i < inputArray.length; i++){
            for(int j=i+1; j < inputArray.length; j++){
                if(inputArray[i]+inputArray[j] == target){
                    outputArray[0]=i;
                    outputArray[1]=j;
                }
            }
        }
        return outputArray;
    }

    // Optimized method works in O(n) using hashmap
    public static int[] twoSumOptimized(int[] inputArray,int target){

        int outputArray[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i < inputArray.length; i++){
            
            if(map.containsKey(target - inputArray[i])){
                outputArray[1] = i;
                outputArray[0] = map.get(target - inputArray[i]);
                return outputArray;
            }
            map.put(inputArray[i], i);
        }

        return outputArray;
    }
 }