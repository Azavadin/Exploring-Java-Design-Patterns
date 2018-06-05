package factory;

public class Developer extends Employee{
    protected EconomyFlightBooking  bookFlight(){
        return new EconomyFlightBooking();
    }
    protected ThreeStarHotelReservation bookHotel(){
        return new ThreeStarHotelReservation();
    }
    protected EconomyCarReservation bookCar(){
        return new EconomyCarReservation();
    }
}
