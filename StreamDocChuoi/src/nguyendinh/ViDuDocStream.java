package nguyendinh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ViDuDocStream {
    public static void main(String[] args) throws IOException {
        InputStreamReader ipReader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(ipReader);

        System.out.print("Nhap mot chuoi bat ky: ");

        String lineDocDuoc = bufReader.readLine();

        System.out.println(lineDocDuoc);
    }
}