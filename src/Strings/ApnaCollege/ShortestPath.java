package Strings.ApnaCollege;

public class ShortestPath {

    public static double solution(String sD){
        int x=0;
        int y=0;

        for(int i=0;i<sD.length();i++){
            char direction = sD.charAt(i);
            if(direction == 'E')
                y++;
            else if(direction == 'W')
                y--;
            else if(direction == 'N')
                x++;
            else if(direction == 'S')
                x--;

        }

        return Math.sqrt((x*x)+(y*y));




    }


}
