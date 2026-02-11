package model;

import java.time.LocalDate;

public abstract class Plan {

    private Long planId;
    protected String planName;
    protected String planType;
    protected double subscriptionRate;
    protected LocalDate creationDate;
    protected int monthlyUsageLimit;

    public Plan(Long planId, String planName, String planType, double subscriptionRate, LocalDate creationDate, int monthlyUsageLimit) {
        this.planId = planId;
        this.planName = planName;
        this.planType = planType;
        this.subscriptionRate = subscriptionRate;
        this.creationDate = creationDate;
        this.monthlyUsageLimit = monthlyUsageLimit;

    }

    // Getter methods for accessing private variables
    public Long getPlanId() {
        return planId;
    }

    public String getPlanName() {
        return planName;
    }

    public String getPlanType() {
        return planType;
    }

    public double getSubscriptionRate() {
        return subscriptionRate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public int getMonthlyUsageLimit() {
        return monthlyUsageLimit;
    }

    public abstract boolean canAddExtraPrompts();
    public abstract double calcExtraPromptCost(int numberOfPrompts);
    public abstract String displayPlanDetails();
    public abstract String getPlanTypeString();




    



}
