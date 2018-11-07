import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class editFile {
    private OutputStream outputStream;
    String text="";
    public void read(String path)throws IOException {
        Scanner in = new Scanner(new File(path));
        while(in.hasNext())
            text += in.nextLine() + "\r\n";
        in.close();
    }
    public void edit(String path)throws IOException {
        System.out.println(text);
        System.out.println("What do you want to replace in this text?\r\n Write me this: ");
        String oldWord="";
        Scanner scan=new Scanner(System.in);
        oldWord=scan.next();
        System.out.println("What do you want to replace in this phrase?\r\n Write me this: ");
        String newWord="";
        Scanner scanN=new Scanner(System.in);
        newWord=scanN.next();
        text=text.replace(oldWord,newWord);
        byte [] buffer=text.getBytes();
        outputStream= new FileOutputStream(path);
        outputStream.write(buffer);
        outputStream.close();

    }
}
