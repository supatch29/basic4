public class Main {

   public static boolean testscore (int interviewScore, int englishScore){
        boolean isOk;
        if(interviewScore > 70 || englishScore > 50) {
            isOk = true ;
        } else {
            isOk = false ;
        }
        return isOk;
    }

    public static void main(String[] args) {
        System.out.println(testscore(75,40));
        System.out.println(testscore(75, 60));
    }
}
