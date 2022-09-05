package Arrays.ApnaCollege.PracticeQuestions;

public class Question1 {

    //Question 1:Given an integer array nums,
    // return true if any value appears at least twice in the array,
    // and return false if every element is distinct.

    public static boolean solution(int[] nums){

        for(int i=0;i<nums.length-1;i++){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }

        }
        return false;
    }

}
