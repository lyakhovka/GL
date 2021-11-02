import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GLTest
{
    public static void main(String[] args) throws Exception
    {
        ArrayList <String> fileContent = new ArrayList<String>();
        Double res = 0.0;

        File file = new File("/home/olena/work/GL/number.txt");
        Scanner sc = new Scanner(file);

        System.out.println("File content:");
        while (sc.hasNextLine()) {
            fileContent.add(sc.nextLine());
            System.out.println(fileContent.get(fileContent.size()-1));
        }


        for (int i=0; i< fileContent.size(); i++){
           if (ifDouble(fileContent.get(i))) {
               res = res + Double.parseDouble(fileContent.get(i));
               System.out.println("res = " + res);
           }

        }
    }

    private static boolean ifDouble(String s) {
        try {
        double d = Double.parseDouble(s);
    } catch (NumberFormatException nfe) {
        return false;
    }
        return true;
    }

}