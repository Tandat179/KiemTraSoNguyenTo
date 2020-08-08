import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        UseFor useFor = new UseFor();
        a = nhapVaoSoA("Nhap Vao So A");
        useFor.isResult(a);
    }

    public static int nhapVaoSoA(String s) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        a = scanner.nextInt();
        return a;
    }
}