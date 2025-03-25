import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_read {
    public static void main(String[] args) {
        try(FileInputStream File1 = new FileInputStream("temp.txt");){
            int temp;
            while ((temp = File1.read()) != -1) {
                System.out.print((char)temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        
        try(FileOutputStream File2 = new FileOutputStream("temp1.txt")) {
            for(int i=0;i<=10;i++){
                File2.write(i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
        try(FileInputStream File3 = new FileInputStream("temp1.txt")) {
            int temp;
            while ((temp = File3.read()) != -1) {
                System.out.print(temp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
