
/**
5.Find an image of a driving license on the Internet.
Take a look at what information the driving license contains.
Then define the DrivingLicense class, containing the following attributes: driver's name and surname, address, postal code,
city, driving license number, year of issue and driving license category. Use private access modifiers when declaring attributes.
Then create a driving license and try to assign values to the attributes. What message are you getting?
After that, change the access modifiers from private to public and try to assign values once again. 

6.Complete the DrivingLicense class. Define a method that displays the driving license (all data contained on the driving license).
Try to display the data in an attractive form. What access modifier will you apply to the defined method? 

7.Apply the private access modifier to all attributes of the DriverLicense class.
Then create the get and set methods for each of the attributes.
After that, modify the program and the method displaying the driving license.
Replace attributes names with get and set methods. 

8.Add a toString() method in the DrivingLicense class to return driving license information.
Use getter methods to get the driving license data. Then check the method in action.

9.In the DrivingLicense class, modify the setter method for the year of issue attribute.
The valid value of the attribute should be greater than or equal to 1980 and less than or equal to the current year.
If the given value is different, do not change the attribute.

10.Modify the setName() method in the DrivingLicense.
Regardless of the given name value, the value of the attribute should begin with a capital letter.
Replace the remaining letters with lowercase. Then check the method in action.
Tip. Use the methods available in the String class.

 */
public class DrivingLicense
{
    private String driverName;
    private String driverSurname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private String category;
    private int issueYear;
      
    
    public String getDriverName(){
        return driverName;
    };
    public String getDriverSurname(){
        return driverSurname;
    };
    public String getAddress(){
        return address;
    };
    public String getPostalCode(){
        return postalCode;
    };
    public String getCity(){
        return city;
    };
    public String getLicenseNumber(){
        return licenseNumber;
    };
    public String getCategory(){
        return category;
    };
    public int getIssueYear(){
        return issueYear;
    };
    
    
    public void setDriverName(String driverName){
        this.driverName = driverName.substring(0, 1).toUpperCase() + driverName.substring(1).toLowerCase();
    };
    public void setDriverSurname(String driverSurname){
        this.driverSurname = driverSurname;
    };
    public void setAddress(String address){
        this.address = address;
    };
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    };
    public void setCity(String city){
        this.city = city;
    };
    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber = licenseNumber;
    };
    public void setCategory(String category){
        this.category = category;
    };
    public void setIssueYear(int issueYear){
        if (issueYear >= 1980 && issueYear <=2021){
            this.issueYear = issueYear;
        }
    };
    
    public void displayLicense(){
        System.out.println("Driver's name and surname: " + getDriverName() + " " + getDriverSurname());
        System.out.println("Address: " + address + " " + getPostalCode() + " " + getCity());
        System.out.println("License number: " + getLicenseNumber());
        System.out.println("Category: " + getCategory());
        System.out.println("Issue year: " + getIssueYear());
    }

    public String toString(){
        return ("Driver's name and surname: " + getDriverName() + " " + getDriverSurname() + "\n" +
        "Address: " + address + " " + getPostalCode() + " " + getCity() + "\n" +
        "License number: " + getLicenseNumber() + "\n" +
        "Category: " + getCategory() + "\n" +
        "Issue year: " + getIssueYear());
    }
}
