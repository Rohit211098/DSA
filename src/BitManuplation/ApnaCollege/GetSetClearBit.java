package BitManuplation.ApnaCollege;

public class GetSetClearBit {


    public static void getIBit(int num,int index){
        int bitMask = 1<<index;

        if((num & bitMask) != 0){
            System.out.println("bit in index "+index+" of num "+num+" is 1");
        }else{
            System.out.println("bit in index "+index+" of num "+num+" is 0");
        }


    }
}
