package Recursion.ApnaCollege;

// remove duplicate in string give that string only contains small alphabets
public class Question11 {

    public static void solution(String s,int i,boolean[] isPresent,StringBuilder newString){

        if(i == s.length()-1){
            System.out.println(newString);
            return;
        }

        int index = s.charAt(i) - 'a';
        if(!isPresent[index]){
            isPresent[index] = true;
            newString.append(s.charAt(i));
        }

        solution(s,i+1,isPresent,newString);

    }
}
