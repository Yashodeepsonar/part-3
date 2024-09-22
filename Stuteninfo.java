package practice;
import java.util.*;

class Student {
    ArrayList<Integer> id = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> age = new ArrayList<>();

    public void add() {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter id:");
        int p = sc1.nextInt();
        id.add(p);

        System.out.println("Enter Name:");
        String n = sc1.next();
        name.add(n);

        System.out.println("Enter age:");
        int q = sc1.nextInt();
        age.add(q);
    }

    public void show() {
        System.out.println("ID\t|Name\t|Age");
        System.out.println("-----------------------------");

        for (int i = 0; i < id.size(); i++) {
            System.out.println(id.get(i) + "\t|" + name.get(i) + "\t|" + age.get(i));
            System.out.println("-----------------------------");
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter index to delete (0 to " + (id.size() - 1) + "): ");
        int a = sc.nextInt();
        System.out.println("Are you sure, You want to delete this record (Y/N)?");
        String b = sc.next();

        if (b.equalsIgnoreCase("Y")) {  
            if (a >= 0 && a < id.size()) {
                id.remove(a);
                name.remove(a);
                age.remove(a);
                System.out.println("Info removed successfully");
            } else {
                System.out.println("Invalid index");
            }
        } else {
            System.err.println("Cancelled deletion");
        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index to update (0 to " + (id.size() - 1) + "): ");
        int b = sc.nextInt();

        if (b >= 0 && b < id.size()) {
            System.out.println("Enter new name: ");
            String newName = sc.next();
            name.set(b, newName);

            System.out.println("Enter new age: ");
            int newAge = sc.nextInt();
            age.set(b, newAge);

            System.out.println("Info updated successfully");
        } else {
            System.err.println("Invalid index");
        }
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student a = new Student();
        int choice;
        do {
        	System.out.println("\tMenu");
        	System.out.println("----------------------");
            System.out.println("1. Add Student Info");
            System.out.println("2. Delete Student Info");
            System.out.println("3. Update Student Info");
            System.out.println("4. Show Student Info");
            System.out.println("5. Exit");
            System.out.println("----------------------");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    a.add();
                    break;
                case 2:
                    a.delete();
                    break;
                case 3:
                    a.update();
                    break;
                case 4:
                    a.show();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.err.println("Invalid Input");
            }
        } while (choice != 5);
    }
}
