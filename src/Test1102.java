public class Test1102 {
    int a;
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }





    public static void main(String[] args) {
//        for(int i=1;i<=200;i++){
//            if(Test1102.isPrime(i)){
//                System.out.println(i);
//            }
//        }

//        int ?eee=3;
//        int num =

        Test1102 t1 = new Test1102();
        Test1102 t2 = new Test1102();
        System.out.println(t1!=t2);
    }
}
