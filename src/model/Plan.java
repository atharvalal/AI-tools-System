package model;

import java.time.LocalDate;

public abstract class Plan {

    protected String planId;
    protected String planName;
    protected String planType;
    protected double subscriptionRate;
    protected LocalDate creationDate;
    protected int monthlyUsageLimit;
    protected boolean isActive;

    public Plan(String planId, String planName, String planType, double subscriptionRate, LocalDate creationDate, int monthlyUsageLimit, boolean isActive) {
        this.planId = planId;
        this.planName = planName;
        this.planType = planType;
        this.subscriptionRate = subscriptionRate;
        this.creationDate = creationDate;
        this.monthlyUsageLimit = monthlyUsageLimit;
        this.isActive = isActive;
    }

    public abstract boolean canAddExtraPrompts();
    public abstract double calcExtraPromptCost(int numberOfPrompts);
    public abstract void displayPlanDetails();
    public abstract String getPlanType();




    



}
