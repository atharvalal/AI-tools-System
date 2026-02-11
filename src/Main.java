import model.PersonelPlan;
import model.Plan;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Plan freePlan = new PersonelPlan(1L, "Free Plan", "Personel", 0, LocalDate.now(), 100, 10, 4, 0);
        freePlan.calcExtraPromptCost(4);

        System.out.println(freePlan.displayPlanDetails());


    }
}