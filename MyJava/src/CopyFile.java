import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File source = new File("test.txt");
        File destination = new File("text.txt");
        try{
            var is = new FileInputStream(source);
            var os = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
