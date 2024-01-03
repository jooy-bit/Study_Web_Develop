package basic.day4;

public class ProbStringReverse {
    public static void main(String[] args) {
        String message = "안녕하세요 좋은 하루네요!";
        char[] messageArray = new char[message.length()];
       
        for (int i = message.length()-1; i >= 0; i--)
        /*{ //char temp = message.charAt(i);*/ System.out.print(message.charAt(i)/*temp */);
        //}

    }
}
