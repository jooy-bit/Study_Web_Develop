package basic.day2;

public class A09HangulCharTest {

    public static void main(String[] args) {
        char start = '나';
        int codeNa = start;
        int codeNet = '냿';

        // 나부터 냿까지  while문으로 출력해보세요.
        while (codeNa<= codeNet) {
            System.out.print((char)codeNa++);
        }
        
        codeNa = start;
        //모두 몇개의 문자가 있는지 개수를 구하시오.
        System.out.println("\n'나'에서 '냿'까지 문자의 개수는 "+(codeNet-codeNa+1)+"개 입니다.");
        
    }
}