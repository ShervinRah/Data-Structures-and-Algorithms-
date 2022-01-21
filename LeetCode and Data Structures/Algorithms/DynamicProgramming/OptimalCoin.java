package DynamicProgramming;

public class OptimalCoin {
    private int x[];
    
    public OptimalCoin(int[] x) {
            this.x = x;
    }
    public int recursive() {
            return OPT(x.length);
    }
    public int OPT(int i) {
            if(i==0)
                    return 0;
            else if(i==1)
                    return x[i-1];
            return Math.max(OPT(i-1), x[i-1]+OPT(i-2));
    }
    public int polynomial() {
            int N=x.length;
            if(N==1)
                    return x[0];
            if(N==2)
                    return Math.max(x[0], x[1]);
            int arr[]=new int[N];
            arr[0]=x[0];
            arr[1]=Math.max(x[0], x[1]);
            for(int i=2;i<N;i++) {
                    arr[i]=Math.max(arr[i-1], x[i]+arr[i-2]);
            }
            return arr[N-1];
    }
    public static void main(String args[]) {
            int A[]= {7,5,13,1,15,4,11};
            OptimalCoin opt=new OptimalCoin(A);
            System.out.println("Maximum total value of coins(recursive): "+opt.recursive());
            System.out.println("Maximum total value of coins(polinomial): "+opt.polynomial());
    }
}
