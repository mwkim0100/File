package Project_230430;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test3 {
    public static void main(String[] args) {
        try{
            //"/Users/kimmyeong-wan/IdeaProjects/Project_230430/test" 디렉토리를
            //File 객체로 가리킨다.
            String name = "/Users/kimmyeong-wan/IdeaProjects/Project_230430/test";
            File dir = new File(name);

            //File 객체가 가리키는 디렉토리 안의 디렉토리,파일들을 이름을
            // 반환타입이 String인 fileName배열에 넣는다.
            String[] fileName = dir.list();

            //넣고싶은 문장을 생성한후 바이트로 변환하고 byteArr배열에 넣는다.
            String lineToAppend = "문장삽입확인1";
            byte[] byteArr = lineToAppend.getBytes();

            //fileName배열에 들어있는 디렉토리와 파일의 이름을 차례대로 s에 대입한다.
            for(String s : fileName){
                //파일 확장자가 txt인 파일들만 수정하기 위해 if문을 사용해서
                //파일 이름의 끝 세글자가 txt일때만 문장을 삽입한다.
                int end = s.length();
                if(s.substring(end-3,end).equals("txt")){
                    //Path.get에는 절대경로가 들어와야 한다.
                    //Path.get(name+"/"+s)
                    //Files.write(Paths.get(s), byteArr, StandardOpenOption.APPEND);
                    Files.write(Paths.get(name+"/"+s), byteArr, StandardOpenOption.APPEND);

                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
