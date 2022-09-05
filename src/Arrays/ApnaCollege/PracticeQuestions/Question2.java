package Arrays.ApnaCollege.PracticeQuestions;

public class Question2 {

    public static int solution(int[] nums,int find){

        int end = nums.length;

        for(int start=0;start<end;start++){
            int mid = (start+end)/2;

            if(nums[mid] == find){
                return nums[mid];
            }
            if(nums[mid] > find){
                end = mid-1;
            }else{
                start = mid+1;
            }


        }


        return -1;
    }


}
