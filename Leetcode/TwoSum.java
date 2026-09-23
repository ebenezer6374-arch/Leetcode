import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
class TwoSum{
    public static int[] checkTwoSum (int [] nums , int target){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int[] {map.get(need) , i};
            }
            map.put(nums[i] ,i);
        }
        return new int[]{};
    }
    public static void main(String [] args){
            int [] arr = {2,7,9,7};

            System.out.println( Arrays.toString(checkTwoSum(arr , 9)) );

    }
}

