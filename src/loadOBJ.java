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

        File file = new File("C:\\Users\\Zeeker\\IdeaProjects\\Raytrace\\src\\teapot-Copy.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }

    public static int absolute(int v) {
        if (v > 0) {
            return v;
        } else {
            return v * -1;
        }
    }
}
