package com.lls.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cat")
public class Pet {
    private String petType;
    private String petColor;

    public String getPetType() {
        return petType;
    }

    @Value("短尾")
    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetColor() {
        return petColor;
    }

    @Value("卡其色")
    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", petColor='" + petColor + '\'' +
                '}';
    }
}
