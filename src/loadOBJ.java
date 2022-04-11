import java.io.*;
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
//        File text = new File("teapot-Copy.txt");
//        Scanner readMe = new Scanner(myObj);

//        try {
//            File myObj = new File("teapot-Copy.txt");
//            Scanner readMe = new Scanner(myObj);
//            while (readMe.hasNext()) {
//                String data = readMe.nextLine();
//                System.out.println(data);
//            }
//            readMe.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }

//        System.out.println("File name: " + myObj.getName());
//        System.out.println(text.getName());
        File file = new File("C:\\Users\\Zeeker\\IdeaProjects\\Raytrace\\src\\teapot-Copy.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
