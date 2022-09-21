public class Main {
    public static void main(String[] args) {
        String[] harf = {"Ü"};
        String[] sesliHarfler = {"a","o","ı","u","A","O","I","U"};



        for (int i = 0 ; i< sesliHarfler.length ; i++) {

            if (harf[0] == sesliHarfler[i]) {
                System.out.println(harf[0] + " Kalın Sesli Bİr Harftir.");
            }else{
                    System.out.println(harf[0] + " İnce Sesli Bir Harftir");
                    return;
            }
        }
    }
}
