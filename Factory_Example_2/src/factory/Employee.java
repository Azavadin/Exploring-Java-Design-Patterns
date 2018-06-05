package factory;

public abstract class Employee {
    private FlightBooking flight;
    private HotelReservation hotel;
    private CarReservation car;

    public void getReadyForTravel() {
        flight = bookFlight();
        hotel = bookHotel();
        car = bookCar();
    }

    protected abstract FlightBooking bookFlight();
    protected abstract HotelReservation bookHotel();
    protected abstract CarReservation bookCar();


    public String toString(){
        return String.format("%s %s %s ", getClass(), flight, hotel, car);
    }
}
