package Lecture_9.Homework;

public class ListOfPhones {
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone("Xiaomi","cellphone",
                "Android","Mi8", 4);



        LandLinePhone landLinePhone1 = new LandLinePhone("Sony", "landLinePhone",
                "null","T-1100", 7);

        LandLinePhone landLinePhone = new LandLinePhone("Sony", "landLinePhone",
                "null","T-1000", 7);



        WalkieTalkie walkieTalkie = new WalkieTalkie("Rogue", "walkieTalkie",
                "null", "GTS-500", 7, 1000);


        int soldCellPhones = cellphone.sellPhones() ;
        System.out.println(soldCellPhones+ " pcs");

        int soldLandLinePhones = landLinePhone.sellPhones() ;
        System.out.println( soldLandLinePhones+ " pcs");

        int soldWalkieTalkie = walkieTalkie.sellPhones() ;
        System.out.println( soldWalkieTalkie + " pcs");


        int callsCellPhones = cellphone.call();
        System.out.println(callsCellPhones);

        int callsLandLinePhones = landLinePhone.call();
        System.out.println(callsLandLinePhones);

        int callsWalkieTalkie = walkieTalkie.call();
        System.out.println(callsWalkieTalkie);



        int downCallsCellPhones = cellphone.down();
        System.out.println(downCallsCellPhones);

        int downCallsLandLinePhones = landLinePhone.down();
        System.out.println(downCallsLandLinePhones);

        int downCallsWalkieTalkie = walkieTalkie.down();
        System.out.println(downCallsWalkieTalkie);




        System.out.println("hash of LandLine1 "+ landLinePhone1.hashCode());
        System.out.println("hash of LandLine  "+ landLinePhone.hashCode());

        System.out.println("hashCode of walkieTalkie: " +walkieTalkie.hashCode());


        if(landLinePhone.equals(landLinePhone1))
            System.out.println("Telephones are equals");
}


}
