package src;

public class Highest_altitude {
    public static void main(String[] args) {
        int[] gain = {-3,-4,-2,-1,4,3,2};
       int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    public static int largestAltitude(int[] gain) {
        int num = gain.length;
        int[] alt = new int[num+1];
        alt[0] = 0;
        for(int i =0; i<gain.length;i++)
        {
          alt[i+1]= gain[i]+alt[i];
        }
        num =0;
        for(int i=0; i<alt.length-1;i++)
        {


            if(num<alt[i+1])
            {
                num = alt[i+1];

            }

        }
        return num;
    }
}

