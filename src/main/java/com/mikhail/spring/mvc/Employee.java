package com.mikhail.spring.mvc;


import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, message = "name length must be more than 2 symbols")
    private String name;

    //@NotEmpty(message = "surname is empty")
    @NotBlank(message = "surname is empty")
    private String surname;

    @Min(value = 500, message = "must be >= than 500")
    @Max(value = 1000, message = "must be <= than 1000")
    private int salary;

    private String department;
    private Map<String, String> departments;

    private String carBrand;

    private Map<String, String> carBrands;

    private String[] languages;

    private Map<String, String> languagesList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Phone is incorrect. Pattern: XXX-XX-XX")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Hrenovye Gabotniki", "HR");
        departments.put("Prodajniki", "sales");

        carBrands = new HashMap<>();
        carBrands.put("Geely Coolray", "Geely");
        carBrands.put("Haval H9", "Haval");
        carBrands.put("Dongfeng J", "Dongfeng");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Deutch", "DE");
        languagesList.put("French", "FR");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
