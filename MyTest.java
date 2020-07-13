package home_work1207;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {

        //create soldiers
        Soldier s1=new Soldier("Avi",22,12221);
        Soldier s2=new Soldier("Don",23,12222);
        Soldier s3=new Soldier("Jon",24.5,12223);
        Soldier s4=new Soldier("Sam",26.8,12225);
        Soldier s5=new Soldier("Ken",28,12226);
        Soldier s6=new Soldier("Tim",21,12227);

        //send soldiers to service to be added to List
        SoldierService soldierService = new SoldierService();
        soldierService.addSoldier(s1);
        soldierService.addSoldier(s2);
        soldierService.addSoldier(s3);
        soldierService.addSoldier(s4);
        soldierService.addSoldier(s5);
        soldierService.addSoldier(s6);
        //add again soldier Ken again to get message
        soldierService.addSoldier(s5);

        //get avg age, max age and sum age
        double soldierAvgAge = soldierService.calcSoldierAvgAge();
        double soldierMaxAge = soldierService.calcSoldierMaxAge();
        double soldierSumAge = soldierService.calcSoldierSumAge();

        //print all the soldiers that got added to the list
        soldierService.printAllNames();

        //print soldiers avg age, max age and sum age
        System.out.println("max soldiers age is:"+soldierMaxAge);
        System.out.println("sum soldiers age is:"+soldierSumAge);
        System.out.println("avg soldiers age is:"+soldierAvgAge);
    }
}
