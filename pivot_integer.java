package src;

class pivot_integer{
    public static void main(){
        int num = 8;
        System.out.println("The pivot is:"+pivotInteger(num));
    }
        public static int pivotInteger(int n){
              int sum = (n+1)*n/2;
              int pivot = (int)Math.sqrt(sum);
              return pivot*pivot==sum? pivot:-1;
       }
       
}