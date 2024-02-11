import java.util.*;

class Mul {
    public static void main(String[] args) {
        int sum = 9;
        ArrayList<String> n = new ArrayList<>();
        n.add("5");
        n.add("4");
        n.add("2");
        n.add("3");
        n.add("9");
        n.add("1");
        n.add("7");
        Collections.sort(n, Comparator.comparingInt(Integer::parseInt));
        double small1 = Double.parseDouble(n.get(0));
        double small2 = Double.parseDouble(n.get(1));

        System.out.println(n);

        if (small1 + small2 < sum) {
            System.out.println("The product of these two is"+(small1*small2));
        } else {
            System.out.println("Sum of two smallest numbers is greater than or equal to the specified sum");
        }
    }
}
