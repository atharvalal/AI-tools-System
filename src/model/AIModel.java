package model;

public class AIModel {
    private Long modelId;
    private String modelName;
    private String description;
    private double basePrice;

    public  AIModel(Long modelId, String modelName, String description, double basePrice) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.description = description;
        this.basePrice = basePrice;
    }

    public Long getModelId() {
        return this.modelId;
    }
    public String getModelName() {
        return this.modelName;
    }
    public String getDescription() {
        return this.description;
    }
    public double getBasePrice() {
        return  this.basePrice;
    }

}
