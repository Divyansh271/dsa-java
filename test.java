import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
nums.add(10);
nums.add(20);
nums.add(30);

Iterator<Integer> it = nums.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}
    }
}
