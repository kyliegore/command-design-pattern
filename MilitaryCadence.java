/**
 * @author Christian Rios, Anton Aarnink, Jack Hempstead, Kylie Gore
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * @author Anton, Christian, Kylie
 */
public class MilitaryCadence {
    
    public MilitaryCadence(){}
    
    /**
     * this method reads in file from folder then prints with a time delay on each line 
     * one by one then clears the console after it is done. it also checks for exception throws
     * for the file reading, time delay, as well as generic. 
     */
    public void singIDontKnow() {
        try {
            File file = new File("./idontknow.txt");
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
            System.out.println("IDontKnow cadence file not found");
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * this method reads in file from folder then prints with a time delay on each line 
     * one by one then clears the console after it is done. it also checks for exception throws
     * for the file reading, time delay, as well as generic. 
     */
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
            System.out.println("IDontKnow cadence file not found");
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    /**
     * this method reads in file from folder then prints with a time delay on each line 
     * one by one then clears the console after it is done. it also checks for exception throws
     * for the file reading, time delay, as well as generic. 
     */
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
            System.out.println("IDontKnow cadence file not found");
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
