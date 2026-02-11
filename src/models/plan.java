package models;

import java.time.LocalDate;

public abstract class plan {

    protected String PlanId;
    protected String PlanName;
    protected String planType;
    protected double subscriptionRate;
    protected LocalDate creationDate;
    protected int monthlyUsageLimit;
    protected boolean isActive;


    



}
