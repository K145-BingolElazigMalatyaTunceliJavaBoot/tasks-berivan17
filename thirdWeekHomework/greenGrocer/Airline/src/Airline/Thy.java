package Airline;



public class Thy extends AirlineC implements CateringService {


    @Override
    public void abroadCatering() {
        System.out.println("We have catering service");
    }

    @Override
    public void domesticCatering() {
        System.out.println("We have catering service");
    }

    @Override
    public int ticketPrice(boolean business) {
        setBusiness(business);

        if (isBusiness()) {

            setBusinessPrice(1200);
            int businessPrice = getBusinessPrice();
            return businessPrice;

        } else {
            setEconomicPrice(600);
            return getEconomicPrice();
        }
    }
}
