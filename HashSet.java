import java.util.HashSet;

public class HashSet{
    public static void main(String[] args) {
        HashSet h1 = new HashSet();
        h1.add(200);
        h1.add("Trinity");
        h1.add(false);
        h1.add(null);

        System.out.println(h1);
        h1.remove(200);
        System.out.println("New HashSet:" + h1);
    }
}