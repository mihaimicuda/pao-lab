import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File inputFile = new File("C:\\Users\\mmicuda\\OneDrive - ENDAVA\\Documents\\universitate\\labs\\homework\\test\\src\\colors.bmp");
//        FileImageInputStream inputStream = new FileImageInputStream(inputFile);
//        FileImageOutputStream outputStream = new FileImageOutputStream(new File("colors_out.bmp"));
//
//
//        byte[] bytes = new byte[(int)inputFile.length()];
//        inputStream.read(bytes);
//
//        int octet;
//        while((octet = inputStream.read()) != -1)
//            outputStream.write(255 - octet);
//
//        inputStream.close();
//        outputStream.close();

        File diplome = new File("./diplome.dat");

        FileOutputStream fileOutputStream = new FileOutputStream(diplome);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new Diploma("X"));
        objectOutputStream.writeObject(new Diploma("Y"));
        objectOutputStream.writeObject(new Diploma("Z"));

        FileInputStream fileInputStream = new FileInputStream(diplome);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        while(true) {
            try {
                Object object = objectInputStream.readObject();
                Diploma retrieved = (Diploma)object;
                System.out.println(retrieved);
            } catch(EOFException e) {
                break;
            }

        }

    }
}
