public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 12;
        boolean varMi = false;


        for (int i=0 ; i< sayilar.length ; i++){
            if(sayilar[i] == aranacak) {
                System.out.println("Sayi Dizinin " + i + ". Elemanıdır");
                return;
            }else{
                System.out.println("Sayi Mevcut Değildir.");
                return;
                }
        }
    }
}