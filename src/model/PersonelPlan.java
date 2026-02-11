package model;

public abstract class PersonelPlan extends Plan {
    private int extraUsageAllowed;
    private double extraUsage;
    private double extraUsageCost;

    public double getExtraUsageCost() {
        return extraUsageCost;
    }

}
