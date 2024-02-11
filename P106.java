import java.util.*;

class ShoppingCart{
    ArrayList<Integer> itemId = new ArrayList<>();
    ArrayList<String> itemname = new ArrayList<>();
    ArrayList<Double> itemprice = new ArrayList<>();

    public void addItems() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter item ID to add item:");
        int id = sc.nextInt();
        itemId.add(id);

        System.out.println("Enter item name to add item:");
        String name = sc.next();
        itemname.add(name);

        System.out.println("Enter item price to add item:");
        double price = sc.nextDouble();
        itemprice.add(price);
    }

    public void showItems() {
        System.out.println("ID\tName\tPrice");
        System.out.println("--------------------------------");

        for (int i = 0; i < itemId.size(); ++i) {
            System.out.println(itemId.get(i) + "\t" + itemname.get(i) + "\t" + itemprice.get(i));
            System.out.println("--------------------------------");
        }
    }

    public void deleteItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item index to delete: ");
        int a = sc.nextInt();

        if (a >= 0 && a < itemId.size()) {
            itemId.remove(a);
            itemname.remove(a);
            itemprice.remove(a);
            System.out.println("Item removed successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    public void updateItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item index to update: ");
        int b = sc.nextInt();

        if (b >= 0 && b < itemId.size()) {
            System.out.println("Enter new item name: ");
            String newName = sc.next();
            itemname.set(b, newName);

            System.out.println("Enter new item price: ");
            double newPrice = sc.nextDouble();
            itemprice.set(b, newPrice);

            System.out.println("Item updated successfully");
        } else {
            System.out.println("Invalid index");
        }
    }
}

class Shop {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc1 = new Scanner(System.in);
        ShoppingCart a = new ShoppingCart();
        int choice;

        do {
        	System.out.println(" ");
            Thread.sleep(50);
        	System.out.print("W");
            Thread.sleep(500);
            System.out.print("E");
            Thread.sleep(500);
            System.out.print("L");
            Thread.sleep(500);
            System.out.print("C");
            Thread.sleep(500);
            System.out.print("O");
            Thread.sleep(500);
            System.out.print("M");
            Thread.sleep(500);
            System.out.print("E");
            Thread.sleep(500);
            System.out.print(" T");
            Thread.sleep(50);
            System.out.print("O");
            Thread.sleep(500);
            System.out.print(" Y");
            Thread.sleep(500);
            System.out.print("A");
            Thread.sleep(500);
            System.out.print("S");
            Thread.sleep(500);
            System.out.print("H");
            Thread.sleep(500);
            System.out.print("O");
            Thread.sleep(500);
            System.out.print("D");
            Thread.sleep(500);
            System.out.print("E");
            Thread.sleep(500);
            System.out.print("E");
            Thread.sleep(500);
            System.out.print("P");
            Thread.sleep(500);
            System.out.print(" S");
            Thread.sleep(500);
            System.out.print("H");
            Thread.sleep(500);
            System.out.print("O");
            Thread.sleep(500);
            System.out.println("P");
            Thread.sleep(500);
        	System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>>");
            System.out.println(".  Menu");
            System.out.println("----------");
            System.out.println("1. Add Items");
            System.out.println("2. Show Items");
            System.out.println("3. Delete Items");
            System.out.println("4. Update Items");
            System.out.println("5. Exit");

            choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    a.addItems();
                    break;
                case 2:
                    a.showItems();
                    break;
                case 3:
                    a.deleteItems();
                    break;
                case 4:
                    a.updateItems();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        } while (choice != 5);
    }
}
