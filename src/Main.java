import model.PersonelPlan;
import model.Plan;
import model.ProPlan;
import model.TeamMember;

import java.lang.reflect.Member;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Plan freePlan = new PersonelPlan(1L, "Free Plan", "Personel", 0, LocalDate.now(), 100, 10, 4, 0);
        freePlan.calcExtraPromptCost(4);
        Plan proPlan = new ProPlan(2L,"Pro Plan","Pro",450,LocalDate.now(),4500,10,6);
        //Type casting is done here to access child specific methods
        ((ProPlan) proPlan).addTeamMembers();
        ((ProPlan) proPlan).addTeamMembers();
        ((ProPlan) proPlan).removeTeamMembers();
        int availableSlots = ((ProPlan) proPlan).getAvailableSlots();

        System.out.println(freePlan.displayPlanDetails());
        System.out.println("\n");
        System.out.println(proPlan.displayPlanDetails());
        System.out.println("Available Slots : "+availableSlots);
        int totalTeamUsage = ((ProPlan) proPlan).getTotalTeamUsage(4500);
        System.out.println("Total teams Usage : "+ totalTeamUsage);
        System.out.println(" ");
        TeamMember m1 = new TeamMember(1,"Atharva","Atharvakop7@gmail.com","Admin",LocalDate.now(),2000);
        System.out.println(m1.toString());
        System.out.println(m1.validateMemberId(m1.getMemberId()));
        System.out.println(m1.validateEmail(m1.getEmail()));



    }
}