package factory;

public class SalesExecutive extends Employee{
    protected FirstClassFlightBooking bookFlight(){
        return new FirstClassFlightBooking();
    }
    protected FiveStarHotelReservation bookHotel(){
        return new FiveStarHotelReservation();
    }
    protected LuxuryCarReservation bookCar(){
        return new LuxuryCarReservation();
    }
}
