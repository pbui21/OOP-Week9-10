import java.io.*;

public class PhanTuTest {
    public static void main(String[] args) throws IOException {
        PhanTu<String> p1 = new PhanTu<>();
        String s1 = args[0];
        String s2 = args[1];
        p1.setVal(s1);
        System.out.println(p1.isGreaterThan(s2));

        // Doc tu file
//        String filename = args[0];
//        PhanTu<Integer> p2 = new PhanTu<>();
//        InputStream is = new FileInputStream(new File(filename));
//        int s3;
//        int s4;
//        while ((s3 = is.read()) != -1){
//            p2.setVal(s3);
//            while ((s4 = is.read()) != -1) {
//
//                System.out.println(p2.isGreaterThan(s4));
//            }
//        }
    }
}
