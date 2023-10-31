package java.com.example;


import javax.validation.constraints.*;
import java.com.example.validation.CheckEmail;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    @Size(min=2, message = "name must be 2 or more symbols long")
    private String name;

    @NotBlank
    private String surname;

    @Min(value=500)
    @Max(value=2000)
    private int salary;

    private String department;
    private List<String> departments;
    private String carBrand;
    private List<String> carBrands;
    private String[] languages;

    @Pattern(regexp = "\\d{3} \\d{3}-\\d{2}-\\d{2}", message = "must match XXX XXX-XX-XX")
    private String phoneNumber;

    //@CheckEmail(value = "ya.ru", message = "domain must be ya.ru")
    @CheckEmail
    private String email;

    private List<String> langList;
    public Employee(){
        departments = new ArrayList<>();
        departments.add("IT");
        departments.add("HR");
        departments.add("Sales");

        carBrands = new ArrayList<>();
        carBrands.add("BMW");
        carBrands.add("MB");
        carBrands.add("Audi");

        langList = new ArrayList<>();
        langList.add("English");
        langList.add("German");
        langList.add("Chinese");
        langList.add("French");
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

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public List<String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(List<String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public List<String> getLangList() {
        return langList;
    }

    public void setLangList(List<String> langList) {
        this.langList = langList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
