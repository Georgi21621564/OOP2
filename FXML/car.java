package com.example.varnarental;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String carClass;
    private String category;
    private String features;
    private String imagePath;
    private boolean smoker;
    private boolean available;

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getCarClass() { return carClass; }
    public void setCarClass(String carClass) { this.carClass = carClass; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getFeatures() { return features; }
    public void setFeatures(String features) { this.features = features; }

    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    public boolean isSmoker() { return smoker; }
    public void setSmoker(boolean smoker) { this.smoker = smoker; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
