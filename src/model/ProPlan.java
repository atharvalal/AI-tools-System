package model;

import java.time.LocalDate;

public class ProPlan extends Plan implements TeamManageable {
    private int maxTeamMembers;
    private int currentTeamMembers;

    public ProPlan(Long planId, String planName, String planType, double subscriptionRate, LocalDate creationDate, int monthlyUsageLimit, int maxTeamMembers, int currentTeamMembers) {
        super(planId, planName, planType, subscriptionRate, creationDate, monthlyUsageLimit);
        this.maxTeamMembers = maxTeamMembers;
        this.currentTeamMembers = currentTeamMembers;
    }

    public boolean addTeamMembers(){
        if (this.currentTeamMembers < this.maxTeamMembers){
            this.currentTeamMembers++;
            return true;
        }
        return  false;
    }
    public boolean removeTeamMembers(){
        if(this.currentTeamMembers>0){
            this.currentTeamMembers--;
            return  true;
        }
        return  false;
    }
    public int getAvailableSlots(){
        int availableSlots = (this.maxTeamMembers-this.currentTeamMembers);
        return  availableSlots;
    }
    public int getTotalTeamUsage(int totalTeamUsage){
        return (totalTeamUsage);

    }




    @Override
    public boolean canAddExtraPrompts() {
        return false;
    }

    @Override
    public double calcExtraPromptCost(int numberOfPrompts) {
        return 0;
    }


    @Override
    public String displayPlanDetails() {
        return "planId: "+getPlanId()+"\n"+"planName: "+planName+"\n"+"planType: "+planType+"\n"+"subscriptionRate: "+subscriptionRate+"\n"+"creationDate: "+creationDate+"\n"+"monthlyUsageLimit: "+monthlyUsageLimit+"\n"+"maxTeamMembers: "+maxTeamMembers+"\n"+"currentTeamMembers: "+currentTeamMembers+"\n";
    }

    @Override
    public String getPlanTypeString() {
        return "";
    }
}
