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


    



}
