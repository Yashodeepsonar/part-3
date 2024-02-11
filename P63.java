import java.util.Scanner;

class MyJava {
    int[] rollno;
    int[] mob;
    String[] sname;
    String[] address;
    int i = 0;

    public MyJava() {
        rollno = new int[5];
        mob = new int[10];
        sname = new String[10];
        address = new String[15];
    }

    public static void main(String[] args) {
        MyJava m = new MyJava();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1. inputData");
            System.out.println("2. showInfo");
            System.out.println("3. Update");
            System.out.println("4. delete");
            System.out.println("5. exit");

            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    m.inputData(sc);
                    break;
                case 2:
                    m.showInfo();
                    break;
                case 3:
                    m.update();
                    break;
                case 4:
                    m.delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 5);
    }

    public void inputData(Scanner sc) {
        System.out.println("Enter roll no");
        rollno[i] = sc.nextInt();
        System.out.println("Enter mobile");
        mob[i] = sc.nextInt();
        System.out.println("Enter student name");
        sc.nextLine(); 
        sname[i] = sc.nextLine();
        System.out.println("Enter address");
        address[i] = sc.nextLine();
        i++;
    }

    public void showInfo() {
        System.out.println("RollNo\tSName\tMob\tAddress");
        System.out.println("---------------------------");
        for (int k = 0; k < i; k++) {
            System.out.println(rollno[k] + "\t" + sname[k] + "\t" + mob[k] + "\t" + address[k]);
        }
    }

    public void update() {
        
        System.out.println("Enter thr roll number");
        

    }

    public void delete() {
    
        System.out.println("Delete function is not implemented yet.");
    }
}