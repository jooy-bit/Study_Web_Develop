package basic.day3;

public class A13IfElseTest {
    public static void main(String[] args) {

        int point =69;

        if (point>=70) {
            point+=100;
        }else{
            point+=50;
        }

        //조건식? 참일때 실행명령 또는 값 => 연산부분이 3가지 삼항연산이라 한다.
        System.out.println("💕🎂고객님의 최종 포인트는 " +(point>150? (point+=200):(point+=100))+" 입니다.");
                







        
        
        
        
        //예시
        int n1 = 9, n2 = 3, n3 = 0;
        if (n1>n2) {
        int max =n1;
        if (max<n3) {
            max = n3;
            System.out.println("max: "+max);
        } else{        
            max = n2;
            if (max<n3) {
            System.out.println("max: "+max);       
                }
            }
        }  
    }
}
