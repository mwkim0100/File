package Project_230430;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        try {
            String name = "/Users/kimmyeong-wan/IdeaProjects/Project_230430/test";
            File dir = new File(name);
            String lineToAppend = scanner.nextLine();
            byte[] byteArr = lineToAppend.getBytes();

            File[] filename = dir.listFiles();
            for (File s : filename) {
                int end = s.getName().length();
                if (s.getName().substring(end - 2, end).equals("xt")) {
                    Files.write(Paths.get(s.getAbsolutePath()), byteArr, StandardOpenOption.APPEND);
                    System.out.println(s+"에 "+lineToAppend+"를 삽입했습니다.");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
