package type;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = n % 2;
        if (b>=2 &&  b >= 5){
            System.out.println("Wierd");
        } else {
            System.out.println("Not wierd");
        }
    }
}
