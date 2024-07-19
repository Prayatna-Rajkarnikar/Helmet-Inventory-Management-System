/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.headguardheaven.model;

/**
 *
 * @author HP
 */
public class HelmetModel {
    private int helmetId;
    private String brand;
    private int price;
    private String helmetSize;
    private String material;
    private int helmetWeight;
    private String color;
    private String helmet_type;
    private String supplier;
    private String visorType;
    
    
    public HelmetModel(int helmetId, String brand, int price, String helmetSize, 
            String material, int helmetWeight, String color, String helmet_type, 
            String supplier, String visorType){
        this.helmetId = helmetId;
        this.brand = brand;
        this.price = price;
        this.helmetSize = helmetSize;
        this.material = material;
        this.helmetWeight = helmetWeight;
        this.color = color;
        this.helmet_type = helmet_type;
        this.supplier = supplier;
        this.visorType = visorType;
    }

    //Getter and Setter 
    public int getHelmetId() {
        return helmetId;
    }

    public void setHelmetId(int helmetId) {
        this.helmetId = helmetId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHelmetSize() {
        return helmetSize;
    }

    public void setHelmetSize(String helmetSize) {
        this.helmetSize = helmetSize;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHelmetWeight() {
        return helmetWeight;
    }

    public void setHelmetWeight(int helmetWeight) {
        this.helmetWeight = helmetWeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHelmet_type() {
        return helmet_type;
    }

    public void setHelmet_type(String helmet_type) {
        this.helmet_type = helmet_type;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getVisorType() {
        return visorType;
    }

    public void setVisorType(String visorType) {
        this.visorType = visorType;
    } 
}
