import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class MilitaryCadence {
    
    public MilitaryCadence() {

    }
    public void singIDontKnow() {
        try {
            File file = new File("./idontknow.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                try {
                    System.out.println(scanner.nextLine());
                    TimeUnit.MILLISECONDS.sleep(100);
                }
                catch (InterruptedException e){}
            }
            scanner.close();
        } 
        catch(FileNotFoundException e) {
            System.out.println("IDontKnow cadence file not found");
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void singEverywhereWeGo() {
        try {
            File file = new File("./everywhere.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                try {
                    System.out.println(scanner.nextLine());
                    TimeUnit.MILLISECONDS.sleep(200);
                    
                }
                catch (InterruptedException e){}
            }
            scanner.close();
        } 
        catch(FileNotFoundException e) {
            System.out.println("Everywhere cadence file not found");
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void singInArmy() {
        try {
            File file = new File("./inarmy.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                try {
                    System.out.println(scanner.nextLine());
                    TimeUnit.MILLISECONDS.sleep(200);
                }
                catch (InterruptedException e){}
            }
            scanner.close();
        } 
        catch(FileNotFoundException e) {
            System.out.println("Sing in Army cadence file not found");
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}