public class Main {

    public static void main(String[] args) {
        //6 bölenler = 1-2-3 Toplamları ise 6(Böyle Sayılar Mükemmel Sayı Olur)

        int number = 28;
        int sum = 0;


        for (int i=1 ; i<number ;i++ ){
            int result = number/i;
            if(result*i==number){
                sum=sum+i;
            }
        }
        if (sum==number){
            System.out.println(number + " Mükemmel Sayıdır");
        }else{
            System.out.println(number + " Mükemmel Sayı Değildir");
        }

    }
}