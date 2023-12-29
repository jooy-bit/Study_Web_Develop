package basic.day2;

public class A11StringMethod {

    public static void main(String[] args) {
        
        String message = "Hello, World:)";    
        //자바 메쏘드 괄호
             //메소드 인자의 개수와 형태
        //int java.lang.String.length()
             //1. none - length, isEmpty, toUppercase, toLowercase
        System.out.println("message.length() :" + message.length());
        System.out.println("message.toUpperCase() :" + message.toUpperCase());
        System.out.println("message.isEmpty() :" + message.isEmpty());

             //2. int one - charAt,*/ 
        System.out.println("message.charAt(8) :" + message.charAt(8));
        System.out.println("message.charAt(0) :" + message.charAt(0));
        System.out.println("message.charAt(4) :" + message.charAt(4));

            //index : 문자 문자열은 0부터 순서대로 문자에게 번호를 매긴다.
            //현재 message에서 마지막 인덱스는 length-1 (0부터 시작하니까)

             //3. string one - concat, equals, startsWith, EndsWith
        System.out.println("message.concat(\"짱짱\") :" + message.concat(" 짱짱")); //return is boolean
        System.out.println("message.startsWith(\"Hello\") :" + message.startsWith("Hello"));
        System.out.println("message.endsWith(\")\") :" + message.endsWith(")"));


             //4. int two - subtring
        System.out.println("message.substring(1, 10) :"+ message.substring(1, 10));
        System.out.println("message.substring(2, 4) :"+ message.substring(2, 4));


             //5. string(char) two - replace 
        System.out.println(message.replace("Hello", "Bye"));
             
    }
        //자바 String의 중요한 메소드 10가지씩 조사해서 테스트 해보기
        //1. indexof()      //for finding the index of the first occurrence if a character or a string in the given string
            //indexOf(String str, int fromIndex) -> int

        //2.toCharArray()   //to form a new character array form this string
            //toCharArray() -> char[]
            
        //3.chatAt()        //to get character at the specified index
            //charAt(int index) -> char

        //4.concat()        //to append the passed string to the end of the given string
            //concat(String str) -> String

        //5.replace()       //to replace all the occurrences of the given character/String from given String
            //replace(char oldChat, char newChar) -> String

        //6.subtring()      //to get a part of a string from the given string
            //substring(int beginIndex, int endIndex) -> String

        //7.split()         //for splitting the given string based on the given regular Expression
            //split(String regex, int limit) -> String[]

        //8.comparaeTo()    //to compare two Srtings Lexicographically
            //compareTo(String anotherString) -> int

        //9.strip()         //to remove all trailing and leading whitespaces from the given string
            //strip() -> String

        //10.valueOf()      //to return String representation of the passed argument
            //valueOf(char[]data) -> String
            
    
}