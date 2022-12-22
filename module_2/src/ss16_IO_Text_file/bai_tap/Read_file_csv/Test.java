package ss16_IO_Text_file.bai_tap.Read_file_csv;

import java.io.*;

public class Test {

    public static final String PATH = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss16_IO_Text_file\\bai_tap\\Read_file_csv\\file.csv";
    public static final String WRITE_PATH = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss16_IO_Text_file\\bai_tap\\Read_file_csv\\test.csv";

    public static void readFile(String path) {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] arr;
            Country country;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String code = arr[1];
                String name = arr[2];
                country = new Country(id, code, name);
                System.out.println(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    public static void writeFile(Country country) throws IOException {
//        BufferedWriter br=new BufferedWriter(new FileWriter(WRITE_PATH));
//        br.write(country.getId()+","+country.getCode()+","+country.getName()+"\n");
//        br.close();
//    }
    public static void main(String[] args) {
        Test.readFile(PATH);
//        Test.writeFile(WRITE_PATH,);
    }
}
