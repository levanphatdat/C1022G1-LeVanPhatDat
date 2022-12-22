package ss16_IO_Text_file.bai_tap.Copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCopyFile {
    public static List<String> readFile(String filePath) {
        List<String> list=new ArrayList<>();
        try {
            File file=new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            while ((line=bufferedReader.readLine())!= null){
                list.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File does not exist in error content");
        }
        return list;
    }
    public void writeFile(String filePath, int count) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(filePath));
            br.write("The number of characters in the file is : " + count);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
