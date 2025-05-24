public class MyTest {
    public static void main(String[] args) {

        String part = "abc-def";
        String[] array = part.split("\\-");
        for (String string : array) {
            System.out.println(string);
        }
    
    }
}
