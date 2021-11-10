import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PhanTuTest {
    public static void main(String[] args) throws IOException {
        //  Đọc tham số dòng lệnh
//        PhanTu<String> p1 = new PhanTu<>();
//        String s1 = args[0];
//        String s2 = args[1];
//        p1.setVal(s1);
//        System.out.println(p1.isGreaterThan(s2));

        // Đọc từ file
        PhanTu<Integer> p2 = new PhanTu<>();
        String inputFile = args[0];
        String outputFile = args[1];
        File file = new File(inputFile);
        Scanner sc = new Scanner(file);
        OutputStream outputStream = new FileOutputStream(outputFile);
        OutputStreamWriter fileOut = new OutputStreamWriter(outputStream);
        ArrayList<Integer> tmpArr = new ArrayList<>();
        while (sc.hasNext()){
            tmpArr.add(sc.nextInt());
        }
        p2.sort(tmpArr);
        for (int num: tmpArr) {
            String res = num + " ";
            fileOut.write(res);
        }
        // Chờ ghi dữ liệu
        fileOut.flush();
        System.out.println("Đã in thành công");

    }
}
