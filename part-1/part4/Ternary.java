public class Ternary {
    public static void main(String[] args) {
        String makeOfcar="Volkswagen";
        boolean isDomenstic = makeOfcar == "Volkswagen" ? true : false;
        if(isDomenstic){
            System.out.println("domestic");
        }

        int age = 10;
        String ageOfkid = age>=18?"adult":"kid";
        System.out.println("he/she is "+ageOfkid);
        boolean canVote=age>=18?true:false;
        String vote = canVote?"can vote":"cant vote";
        System.out.println(vote);
    }
}
