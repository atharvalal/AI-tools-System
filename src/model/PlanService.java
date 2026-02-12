package model;

public interface PlanService {
    boolean canAddExtraPrompts();
    double calcExtraPromptCost(int numberOfPrompts);
    String displayPlanDetails();
    String getPlanTypeString();
}
