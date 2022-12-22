package ss16_IO_Text_file.thuc_hanh.FindMaxValueAndWriteFile;

import java.util.List;

public class FindMaxValue {


    public static final String NUMBERS = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss16_IO_Text_file\\thuc_hanh\\FindMaxValueAndWriteFile\\numbers.csv";
    public static final String RESULT = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\ss16_IO_Text_file\\thuc_hanh\\FindMaxValueAndWriteFile\\result.csv";

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(NUMBERS);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(RESULT, maxValue);
    }
}
