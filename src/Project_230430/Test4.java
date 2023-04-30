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
            //"/Users/kimmyeong-wan/IdeaProjects/Project_230430/test" 디렉토리를
            //File 객체로 가리킨다.
            String name = "/Users/kimmyeong-wan/IdeaProjects/Project_230430/test";
            File dir = new File(name);

            //File 객체가 가리키는 디렉토리 안의 디렉토리,파일들을
            // 반환타입이 File 객체인 fileName배열에 넣는다.
            File[] filename = dir.listFiles();

            //넣고싶은 문장을 생성한후 바이트로 변환하고 byteArr배열에 넣는다.
            String lineToAppend = "문장 삽입 확인2";
            byte[] byteArr = lineToAppend.getBytes();


            for (File s : filename) {
                int end = s.getName().length();
                //확장자가 txt인 파일만 수정하는 알고리즘
                if(s.isDirectory()){
                    continue;
                }
                if (s.getName().substring(end - 3, end).equals("txt")) {
                    Files.write(Paths.get(s.getAbsolutePath()), byteArr, StandardOpenOption.APPEND);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
