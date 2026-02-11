package model;

import java.time.LocalDate;

public class PersonelPlan extends Plan {
    private int extraUsageAllowed;
    private double extraUsage;
    private double extraUsageCost;

    public PersonelPlan(Long planId, String planName, String planType, double subscriptionRate, LocalDate creationDate, int monthlyUsageLimit, int extraUsageAllowed, double extraUsage, double extraUsageCost) {
        super(planId, planName, planType, subscriptionRate, creationDate, monthlyUsageLimit);
        this.extraUsageAllowed = extraUsageAllowed;
        this.extraUsage = extraUsage;
        this.extraUsageCost = extraUsageCost;
    }

    public double getExtraUsageCost() {
        return extraUsageCost;
    }

    @Override
    public boolean canAddExtraPrompts() {
        return false;
    }

    @Override
    public double calcExtraPromptCost(int numberOfPrompts) {
        this.extraUsageCost = numberOfPrompts * 2;
        return this.extraUsageCost;
    }

    @Override
    public String displayPlanDetails() {
        return "planId: "+getPlanId()+"\n"+"planName: "+planName+"\n"+"planType: "+planType+"\n"+"subscriptionRate: "+subscriptionRate+"\n"+"creationDate: "+creationDate+"\n"+"monthlyUsageLimit: "+monthlyUsageLimit+"\n"+"\n"+"extraUsageAllowed: "+extraUsageAllowed+"\n"+"extraUsage: "+extraUsage+"\n"+"extraUsageCost: "+extraUsageCost;
    }

    @Override
    public String getPlanTypeString() {
        return "";
    }

}
