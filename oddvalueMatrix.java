package src;

public class oddvalueMatrix {
    public static void main(String[] args) {
   int[][] indices ={{0,1},{1,1}};
   int m = 3;
   int n =2;
   int ans = oddCells(2,2,indices);
        System.out.println(ans);
    }
    public static int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int [n];
        int col[] = new int [m];
        for(int x[] : indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }
        return count;
    }
}
