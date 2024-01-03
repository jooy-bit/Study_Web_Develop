package basic.day4;

public class A25MySampleMethod {
    public static void main(String[] args) {
        System.out.println(sumToN(7));
        System.out.println(MultiplyTon(7));
        System.out.println(sumMToN(7,10));
        System.out.println(MultiplyMToN(4, 7));
        System.out.println(multiplyNof2(7));
        printGuguDan(4);
    // 메소드 안에서 출력문 만들지 않기
    } //main 


//1) sumToN 
    public static int sumToN(int n){
        int sum=0;
        for (int i = 1; i <= n; i++) sum+=i;
        return sum;
    }
    
//2) MultiplyTon
    public static long MultiplyTon(int n){
        long longResult=1;
        for (int i = 0; i < n; i++) longResult*=i;
        return longResult;
    }

//3)sumMToN
    public static int sumMToN(int m,int n){
        for (int i = m; i <= n; i++) m+=i;
        return m;
    }

//4)MultiplyMToN
    public static long MultiplyMToN(int n,int m){
        for (int i = m; i <=n; i++) m*=i;
        return m;
    }

//5)multiplyNof2
    public static long multiplyNof2(int n){
        long longResult = 1;
        for (int i = 0; i <= n; i++)longResult*=2; 
        return longResult;
    }

// 구구단 '출력'하는 메소드, 리턴은 void, printGuguDan
    public static void printGuguDan(int k){
        int xx =1;
        for ( int i= 1; i < 10; i++) {
            for (int j= 1; j <= k; j++) {
                xx= i*j;
        
            System.out.println(String.format("%3d x %3d = %3d",i,j,xx));
            }
        }
    }
    
}//class
