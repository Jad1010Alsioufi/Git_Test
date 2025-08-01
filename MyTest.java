public class MyTest {
    public static void main(String[] args) {

        String part = "abc-def-545";
        String[] array = part.split("\\-");
        for (String string : array) {
            System.out.println(string);
        }
    
    }
}
