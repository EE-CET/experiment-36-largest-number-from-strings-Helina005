
   
        
    import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // Read the N strings
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }

        // Sort using a custom comparator
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare (b + a) with (a + b) to get descending order
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        // Special case: If the largest number is "0", the entire result is "0"
        if (nums[0].equals("0")) {
            System.out.println("0");
            return;
        }

        // Combine the strings
        StringBuilder sb = new StringBuilder();
        for (String s : nums) {
            sb.append(s);
        }

        System.out.println(sb.toString());
        sc.close();
    }

}
