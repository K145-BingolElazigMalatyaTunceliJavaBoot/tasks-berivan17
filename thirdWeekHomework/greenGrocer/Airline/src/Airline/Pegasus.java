package Airline;



public class Pegasus extends AirlineC implements CateringService {

    @Override
    public void abroadCatering() {
        System.out.println("We don't have catering service");
    }

    @Override
    public void domesticCatering() {
        System.out.println("We have catering service");
    }

    @Override
    public int ticketPrice(boolean business) {

        setBusiness(business);
        if (isBusiness()){
            int price=(3*getBusinessPrice());
            return price;
        }
        else {
            return super.getEconomicPrice();
        }
    }

}
