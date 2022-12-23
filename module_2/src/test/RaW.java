package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RaW {
        public static List<String> readFileText(String filePath) {
            List<String> stringList = new ArrayList<>();
            try {
                File file = new File(filePath);
                FileReader fileReader = new FileReader(file);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                BufferedReader br = new BufferedReader(fileReader);
                String line;
                while ((line = br.readLine()) != null) {
                    stringList.add(line);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringList;
        }

        public void writeFile(String filePath, int count, List<String> list) throws IOException {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (String l:list){
                buff.write(l + "\n");
            }
            buff.write("The number: " +count+"\n");
            buff.close();
        }
    }

