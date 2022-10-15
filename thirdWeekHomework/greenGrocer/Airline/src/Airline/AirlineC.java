package Airline;

import java.util.List;

public abstract class AirlineC {

    private String name;
    private boolean control;
    private boolean business;
    private int businessPrice;
    private int economicPrice;
    private List<String> seats;

    public List<String> getSeats(){
        return seats;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSeats(List<String> seats){
        this.seats=seats;
    }



    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }



    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }
    public int getEconomicPrice(){
        return economicPrice;
    }

    public void setEconomicPrice(int economicPrice) {
        this.economicPrice = economicPrice;
    }



    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }
}
