package ss17_binary_file.practive.copy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest)throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            is.close();
            os.close();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sourceFilePath = "/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/file.txt";
        String destFilePath = "/Users/mark/dev/code_gym/A0523i1_module2_codeGym/ss17_binary_file/data/fileDest.txt";

        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath);
        try {
//            copyFileUsingJava7Files(sourceFile,destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("copy completed");
        } catch (IOException e) {
            System.out.println("can't copy that file");
            throw new RuntimeException(e);
        }
    }
}













