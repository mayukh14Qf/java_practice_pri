
import java.io.*;

public class FileHandle {
    public static void main(String[] args) throws IOException {

        // Creating A new File
//        File obj1=new File("D:\\spring course\\Java_Private\\src\\Lc.txt");
//        try {
//            if (obj1.createNewFile()){
//                System.out.println("file Successfully created ...");
//            }
//            else {
//                System.out.println("File already exits ...");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // File Information

//            if (obj1.exists()){
//                System.out.println("File Name is : "+ obj1.getName());
//                System.out.println("File Location is : "+ obj1.getAbsolutePath());
//                System.out.println("File writable : "+obj1.canWrite());
//                System.out.println("File Readable : "+obj1.canRead());
//                System.out.println("File Size : "+obj1.length());
//                System.out.println("File Removed: "+obj1.delete());
//            }
//            else {
//                System.out.println("File does not Exist ");
//            }


        // Write On a File
        try {
            FileWriter f=new FileWriter("D:\\spring course\\Java_Private\\src\\hello.txt");
            try {
                f.write("Hello Friends ..");
            }
            finally {
                f.close();
            }
            System.out.println("Successfully written...");

        }
        catch (IOException e){
            System.out.println("Exception Handled .."+e);
        }

        // File Reading

//        try {
//            FileReader fileReader=new FileReader("D:\\spring course\\Java_Private\\src\\Lc.txt");
//            try {
//                int i;
//                while ((i=fileReader.read())!=-1){
//                    System.out.print((char) i);
//                }
//            }
//            finally {
//                fileReader.close();
//            }
//        }
//        catch (IOException e){
//            System.out.println(e);
//        }

        // Rename file

//        File obj2=new File("D:\\spring course\\Java_Private\\src\\rename.txt");
//        if (obj1.exists()){
//            System.out.println(obj1.renameTo(obj2));
//        }
//        else {
//            System.out.println("File doest not exist..");
//        }

        // Copy one file to another

//        FileInputStream i=new FileInputStream("D:\\spring course\\Java_Private\\src\\rename.txt");
//        FileOutputStream o=new FileOutputStream("D:\\spring course\\Java_Private\\src\\Lc.txt");
//        int j;
//        while ((j=i.read())!=-1){
//            o.write((char)j);
//        }
//        System.out.println("Data Copied Successfully");

//        File file=new File("D:\\spring course\\Java_Private\\src\\rename.txt");
//        Scanner sc=new Scanner(file);
//        while (sc.hasNextLine()){
//            String line= sc.next();
//            System.out.println(line);
//        }


    }
}