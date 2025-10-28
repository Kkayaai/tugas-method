import java.util.Scanner;

public class method {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingin menghitung luas apa?");
        int pilihan = input.nextInt();
        switch (pilihan) {
            //persegi
            case 1:
                System.out.println("masukan sisi");
                int s = input.nextInt();
                persegi(s);
                break;
            //persegi panjang
            case 2:
                System.out.println("masukan panjang");
                int p = input.nextInt();
                System.out.println("masukan lebar");
                int l = input.nextInt();

                persegi(p,l);
                break;
            //segitiga
            case 3:
                System.out.println("masukan alas");
                int a = input.nextInt();
                System.out.println("masukan tinggi");
                int t = input.nextInt();

                segitiga(a, t);
                break;
            //lingkaran
            case 4:
                System.out.println("masukan jari-jari");
                int r = input.nextInt();

                lingkaran(r);
                break;
        
            default:
                break;
        }
    System.out.println("tekan y untuk lanjut dan tekan n untuk tidak");
    String ya = input.next();
    if (ya.equals("y")) {
        main(args);
    }
    else if (ya.equals("n"))
        System.out.println("matur suwun");
    }
    public static void persegi (int s ){
        

        int hasil = s * s ;
        System.out.println(hasil);
    } 
    public static void persegi (int p, int l){
        int hasil = p * l ;
        System.out.println(hasil);
    }
    public static void segitiga (int a, int t){
        int hasil = a * t / 2 ;
        System.out.println(hasil);
    }
    public static void lingkaran (int r){
        double hasil =Math.PI * r * r;
        System.out.println(hasil);
    }
}
