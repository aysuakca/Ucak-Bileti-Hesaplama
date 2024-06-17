import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int km, age, type;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Mesafeyi KM Turunden Giriniz :");
        km = input.nextInt();

        System.out.print("Lütfen Yasinizi Giriniz :");
        age = input.nextInt();

        System.out.print("Lütfen Yolculuk Tipini Giriniz (1 => Tek Yon, 2 => Gidis Donus):");
        type = input.nextInt();

        total = km * 0.10;
        double child = total * 0.5;
        double young = total * 0.1;
        double elder = total * 0.3;

        double discChild = total - child;
        double typeChild = discChild * 0.2;

        double discYoung = total - young;
        double typeYoung = discYoung * 0.2;

        double discElder = total - elder;
        double typeElder = discElder * 0.2;



        if ((age >= 0)&& (age < 12)) {
            if ((km >= 0) && (type == 1) || (type == 2)) {
                if (type == 1) {
                    System.out.println("Toplam Tutar : " + discChild);
                } else {
                    System.out.println("Toplam Tutar :" + (discChild - typeChild) * 2);
                }
            } else {
                System.out.println("Hatali Veri Girdiniz!");
            }
        }
     if ((age > 12) && (age<24)) {
        if ((km >= 0) && (type == 1) || (type == 2)) {
            if (type == 1) {
                System.out.println("Toplam Tutar : " + discYoung);
            } else {
                System.out.println("Toplam Tutar :" + (discYoung - typeYoung) * 2);
            }
        } else {
            System.out.println("Hatali Veri Girdiniz!");
        }
    }
        if (age >= 65){
            if ((km >= 0) && (type == 1) || (type == 2)) {
                if (type == 1) {
                    System.out.println("Toplam Tutar : " + discElder);
                } else {
                    System.out.println("Toplam Tutar :" + (discElder - typeElder) * 2);
                }
            } else {
                System.out.println("Hatali Veri Girdiniz!");
            }
        }
}
}

