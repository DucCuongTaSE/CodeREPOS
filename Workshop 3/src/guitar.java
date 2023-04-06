/**
 *
 * @author CuongSchmidt
 */

public class guitar {
  private String serialNumber;
  private int price;
  private String builder;
  private String model;
  private String backWood;
  private String topWood;
  
  public guitar() {
    this.serialNumber = "";
    this.price = 0;
    this.builder = "";
    this.model = "";
    this.backWood = "";
    this.topWood = "";
  }
  
  public guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.backWood = backWood;
    this.topWood = topWood;
  }
  
  public String getSerialNumber() {
    return this.serialNumber;
  }
  
  public void setSerialNumber(String serialNumber) {
    if (!serialNumber.isEmpty()) {
      this.serialNumber = serialNumber;
    }
  }
  
  public int getPrice() {
    return this.price;
  }
  
  public void setPrice(int price) {
    this.price = price;
  }
  
  public String getBuilder() {
    return this.builder;
  }
  
  public void setBuilder(String builder) {
    this.builder = builder;
  }
  
  public String getModel() {
    return this.model;
  }
  
  public void setModel(String model) {
    this.model = model;
  }
  
  public String getBackWood() {
    return this.backWood;
  }
  
  public void setBackWood(String backWood) {
    this.backWood = backWood;
  }
  
  public String getTopWood() {
    return this.topWood;
  }
  
  public void setTopWood(String topWood) {
    this.topWood = topWood;
  }
  
  public void createSound() {
  System.out.println("Serial Number: " + getSerialNumber());
  System.out.println("Price: " + getPrice());
  System.out.println("Builder: " + getBuilder());
  System.out.println("Model: " + getModel());
  System.out.println("Back Wood: " + getBackWood());
  System.out.println("Top Wood: " + getTopWood());
}

}
