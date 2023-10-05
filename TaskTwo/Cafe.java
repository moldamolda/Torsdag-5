import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();
    private void loadMenuData() {
        File file = new File("C:\\Users\\Pauline\\Desktop\\Torsdag-5\\TaskTwo\\src\\coffees.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
            System.out.println(coffeeMenu.size());

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }
    public void printMenu() {
        loadMenuData();

        for(int i = 0; i < coffeeMenu.size(); i++) {
            System.out.println(coffeeMenu.get(i));
        }

        for(String s: coffeeMenu) {
            System.out.println(s);
        }


    }
}