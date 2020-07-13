package home_work1207;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SoldierService {

    private List <Soldier> soldiers =new ArrayList<Soldier>();
    private Soldier soldier;

        public SoldierService(){

        }

        public void addSoldier (Soldier soldier){
            this.soldier = soldier;
            if (soldiers.contains(soldier)){
                System.out.println("soldier "+soldier.getName()+" exists with given id so was not added");
            } else {
                soldiers.add(soldier);
                System.out.println("soldier "+soldier.getName()+" did not exist so was added");
            }
        }

        public double calcSoldierAvgAge() {

            double sumAge = calcSoldierSumAge();

            return sumAge/soldiers.size();
        }

        public double calcSoldierSumAge() {
            double sumAge = 0;

            for (int i =0; i< soldiers.size(); i++) {
                sumAge = sumAge + soldiers.get(i).getAge();
            }
            return sumAge;
        }

        public double calcSoldierMaxAge() {
            double maxAge = soldiers.get(0).getAge();

            for (int i =1; i < soldiers.size(); i++) {

                if (maxAge < soldiers.get(i).getAge()){
                    maxAge = soldiers.get(i).getAge();
                }
            }
            return maxAge;
        }

        public void printAllNames() {

            System.out.println("soldiers names are:");

            for (int i =0; i < soldiers.size(); i++) {
                System.out.println(soldiers.get(i).getName());
                }


    }


}
