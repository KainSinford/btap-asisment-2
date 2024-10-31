
package btap.cs303;

public class BtapCS303 {
    public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("nhap ten");
            String name = scanner.nextLine();
            System.out.print("nhap tuoi:");
            String age = scanner.nextLine();

            System.out.print("nhap gioi tinh:");
            String gender = scanner.nextLine();

            System.out.print("nhap GPA:");
            String gpa = scanner.nextLine();

            System.out.print("nhap chuyen nganh:");
            var major = scanner.nextLine();

            System.out.print("nhap que quan:");
            String hometown = scanner.nextLine();

            System.out.println("\n thong tin sinh vien:");
            System.out.println("Nhap ten: Truong Nguyen Bao Tam" + name);
            System.out.println("Nhap tuoi: 19" + age);
            System.out.println("Nhap gioi tinh: Male" + gender);
            System.out.println("Nhap gpa: 5.0" + gpa);
            System.out.println("Nhap chuyen nganh: CNTT" + major);
            System.out.println("Nhap que quan: Quang Ngai" + hometown);

        }
    }
}
