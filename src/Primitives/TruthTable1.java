package Primitives;

public class TruthTable1 {
    public static void main(String[] args) {
        // visa and ticket

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean canTravel =  visa == myVisa && ticket == myTicket == myTicket;

        System.out.println(canTravel);

        // ask question
        boolean online = true;
        boolean campus = true;
        boolean student = true;
        boolean askQuestion = student == online ||  student == campus;

        System.out.println("Can I ask question?" + askQuestion);


        // 90% and more attendance and score of80 or more pass this class

        int regAttendance =90;
        int regScore =80;

        int yourAttendance = 100;
        int yourScore = 90;

        boolean pass = yourAttendance >= regAttendance && yourScore >= regScore;
        System.out.println("Can I pass the course? >>"+pass);





    }
}
