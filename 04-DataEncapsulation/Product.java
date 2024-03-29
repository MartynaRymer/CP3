
/**
11.The Product class describes food products using two attributes: the product name and whether the product is vegetarian.
Define the class, its attributes, and getter and setter methods for all attributes. Then create a product, set attributes'
values and display product information. 
 */
public class Product
{
private String productName;
private boolean isVegetarian;

public String getProductName(){
    return productName;
}

public void setProductName(String productName){
    this.productName = productName;
}

public boolean getIsVegetarian(){
    return isVegetarian;
}

public void setIsVegetarian(boolean isVegetarian){
    this.isVegetarian = isVegetarian;
}

public String toString(){
    return getProductName() + " is " + (getIsVegetarian() == false ? "not vegetarian" : "vegetarian");
}
}
