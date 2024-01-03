package basic.day4;

public class A24StacticMethod {
    argumentTest();
    argumentTest(i:999);
    argumentTest(i:40,j:3);
    //메소드가 실행될 떄 실매개 변수 값이 형식매개변수로 전달, 저장됩니다.
    public static void main(String[] args){
            //리턴이 없는 메소드 = 인자로 선언된 ()안 변수는 메소드의 지역변수
        //인자가 없는 메소드
        public static void argumentTest(){
            System.out.println("인자값 없는 메소드");
        }
        //인자가 하나인 메소드
        public static void argumentTest(int i){                 //이 범위 안에서만 사용가능한 변수
            System.out.println("인자가 1개 정수 "+i+" 입니다.");
        }
        //인자가 두개인 메소드
        public static void argumentTest(int i, int j){

        }
        
        

        //리턴값이 int인 메소드
        public static int resultIntTest(){
            return 999;
        }
        //리턴값이 boolean인 메소드
        public static boolean resultBooleanTest(){
            return false;
        }
        //리턴값이 String인 메소드
        public static String  resultStringTest(){
            return "Hello";
        }
        //리턴값이 char인 메소드
        public static char  resultCharTest(){
            return 'A';
        }

    }//
}//