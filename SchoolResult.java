import java.util.Scanner;

public class SchoolResult {
    public static void main(String[] args) {
        double diemChuan;
        double diemChuyen;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter standard score (diem chuan): ");
        diemChuan = scanner.nextInt();
        System.out.print("Enter special score (diem chuyen): ");
        diemChuyen = scanner.nextDouble();
        String result = getResult(diemChuan, diemChuyen);
        System.out.print(result);

    }
    public static String getResult(double diemChuan, double diemChuyen) {
        String result;
        if (diemChuan >= 42 && diemChuyen >= 8.5) {
            result = "chuyen 1";
        } else if (diemChuan >= 41 && diemChuyen >= 8) {
            result = "chuyen 2";
        } else {
            result = "chuc ban may man lan sau";
        }
        return result;
    }

}