import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, Integer> sub = new HashMap<String, Integer>();
        int low = 150;
        int high = -1;
        int sum = 0;
        int avg = 0;
        String lowClass = "";
        String highClass = "";
        int classCount = 0;

        sub.put("AP Calculus AB", 102);
        sub.put("AP Composition and Literature", 96);
        sub.put("AP Computer Science Principles", 99);
        sub.put("AP Physics C", 95);
        sub.put("CCP Computer Programming", 104);

        classCount = sub.size();
        for (String subject : sub.keySet()) {
            System.out.printf("\n%-30s%5d", subject, sub.get(subject));
            if (sub.get(subject) < low) {
                low = sub.get(subject);
                lowClass = subject;
            }
            if (sub.get(subject) > high) {
                high = sub.get(subject);
                highClass = subject;
            }
            sum += sub.get(subject);
        }
        avg = sum/classCount;

        System.out.println("\nNumber of Classes: " + classCount);
        System.out.println("\nHighest Grade: " + "\n" + highClass + ": " + high);
        System.out.println("\nLowest Grade: " + "\n" + lowClass + ": " + low);
        System.out.println("\nAverage Grade: " + avg);
    }
}
