package ss16_IO_Text_file.bai_tap.Copy_file_text;


import java.util.List;

public class CopyFileText {

    public static final String SOURCE = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss16_IO_Text_file\\bai_tap\\Copy_file_text\\source_file.csv";
    public static final String TARGET = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss16_IO_Text_file\\bai_tap\\Copy_file_text\\target_file.csv";


    public static void main(String[] args) {
        ReadAndWriteCharFile readAndWriteCopyFile = new ReadAndWriteCharFile();
        List<String> list = ReadAndWriteCharFile.readFile(SOURCE);
        int count = sumChar(list);
        readAndWriteCopyFile.writeFile(TARGET, count, list);
    }

    public static int sumChar(List<String> list) {
        int count = 0;
        for (String l : list) {
            count += l.length();
        }
        return count;
    }
}
