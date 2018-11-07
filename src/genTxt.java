
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class genTxt {
    private OutputStream outputStream;

    public void gener(String filePath,String text)throws IOException {
        byte [] buffer=text.getBytes();
        outputStream= new FileOutputStream(filePath);
        outputStream.write(buffer);
        outputStream.close();
    }
}
