package Project_230430;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Test3 {
    public static void main(String[] args) {
        try{
            String name = "/Users/kimmyeong-wan/IdeaProjects/Project_230430/test";
            File dir = new File(name);
            String[] fileName = dir.list();
            for(String s : fileName){
                int end = s.length();
                String lineToAppend = "\r\nThe quick brown fox jumps over the lazy dog";
                byte[] byteArr = lineToAppend.getBytes();
                if(s.substring(end-2,end).equals("xt")){
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
