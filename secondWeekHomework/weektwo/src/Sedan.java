public class Sedan extends Car{
    private int monthlyRentCar;

    public int getMonthlyRentCar()
    {
        return monthlyRentCar;
    }
    public void setMonthlyRentCar(int monthlyRentCar)
    {
        this.monthlyRentCar=monthlyRentCar;
    }
    public int sedansMonthlyFee()
    {
            int day=30;
            int pay=(300*day);
            return pay;

    }
    public void sedansDailyFee(){
        System.out.println("Günlük kiralama yaptınız.");
    }


}
