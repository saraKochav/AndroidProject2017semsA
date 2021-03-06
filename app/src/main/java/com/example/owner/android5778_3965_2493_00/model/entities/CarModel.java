package com.example.owner.android5778_3965_2493_00.model.entities;

import java.util.Date;

/**
 * Created by owner on 26/11/2017.
 */

public class CarModel {
    String modelCode;
    String companyName;
    String modelName;
    float engineCapacity;
    Enums.GearBox gearBox;
    int seats;
    String color;
    Date yearManufacture;

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Enums.GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(Enums.GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(Date yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "modelCode='" + modelCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", gearBox=" + gearBox +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", yearManufacture=" + yearManufacture +
                '}';
    }
}

