package gmit.ie;

//Neil Morrison
//05/03/2020
//G00339724@gmit.ie

public class Employee {

    private String Title;
    private String Name;
    private int pps;
    private String phone;
    private String EmployementType;
    private int age;

    public Employee(String title, String name, int pps, String phone, String EmployementType, int age) {
        if (title == "Mr" || title == "Mrs" || title == "Miss"){
            this.Title = title;
        }else{
            throw new IllegalArgumentException("Title must be Mr, Mrs, or Miss");
        }
        if(name.length() < 5 || name.length() > 22){
            this.Name = name;
        }
        else{
            if (name.length() < 5){
                throw new IllegalArgumentException("Name must be a least 5 characters long");
            }
            else{
                throw new IllegalArgumentException("Name must be under 22 characters long");
            }

        }
        if(pps == 6){
            this.pps = pps;
        }
        else{
            throw new IllegalArgumentException("pps must be six characters");
        }

        if(phone.length() == 7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("phone number must be 7 digits");
        }

        if(EmployementType == "Part-Time" || EmployementType == "Full-Time"){
            this.EmployementType = EmployementType;
        }
        else{
            throw new IllegalArgumentException("Employment type can only be either Full-time or Part-time");
        }

        if(age >= 18){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Employee must be over the age of 18");
        }

    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
            Name = name;
    }

    public int getPps() {
        return pps;
    }

    public void setPps(int pps) {
        this.pps = pps;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployementType() {
        return EmployementType;
    }

    public void setEmployementType(String employementType) {
        EmployementType = employementType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
