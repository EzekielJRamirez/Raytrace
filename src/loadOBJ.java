import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class loadOBJ {

    /**
     * this is my attempt to read the vertex and faces of the teapot.obj
     * file
     */
    public static void main(String[] args) throws FileNotFoundException {
//        File myObj = new File("teapot.obj");
//        Scanner readMe = new Scanner(myObj);
        try {
            File myObj = new File("teapot.obj");
            Scanner readMe = new Scanner(myObj);
            while (readMe.hasNext()) {
                String data = readMe.nextLine();
                System.out.println(data);
            }
            readMe.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

//        System.out.println("File name: " + myObj.getName());
    }
}
