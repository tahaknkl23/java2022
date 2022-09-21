public class Main {
    public static void main(String[] args) {
        int nummber1 = 220;
        int nummber2 = 284;
        int sum1 = 0;
        int sum2 = 0;

        for (int i=1 ; i<nummber1 ; i++){
            if (nummber1 % i == 0){
                sum1 = sum1+ i;
            }
        }
        for (int j=1 ; j<nummber2 ; j++){
            if(nummber2 % j ==0){
                sum2 = sum2 + j;
            }
        }
        if(nummber1 == sum2 && nummber2 == sum1){
            System.out.println(nummber1 + " ve " + nummber2 + " Sayıları Arkadaş Sayılardır.");
        }else{
            System.out.println(nummber1 + " ve " + nummber2 + " Sayıları Arkadaş Sayılar Değildir.");
        }
    }
}