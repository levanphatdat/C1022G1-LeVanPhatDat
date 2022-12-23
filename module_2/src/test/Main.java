package test;


import java.io.IOException;
import java.util.List;

public class Main {

    public static final String SOURCES = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss16_IO_Text_file\\bai_tap\\Copy_file_text\\source_file.csv";
    public static final String RESULT = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\test\\test.csv";

    public static void main(String[] args) throws IOException {
        RaW raW=new RaW();
        List<String> list= RaW.readFileText(SOURCES);
        int count= countChar(list);
        raW.writeFile(RESULT,count,list);

    }
    public static int countChar(List<String>list) {
        int count = 0;
        for (String line : list) {
            count += line.length();
        }
        return count;
    }
}
