package factory;

public class App {
    public static void prepareEmployeeForTravel(Employee employee){
        employee.getReadyForTravel();
        System.out.println(employee);
    }
    public static void main(String[] args){
        Developer developer = new Developer();
        prepareEmployeeForTravel(developer);

        SalesExecutive salesExecutive = new SalesExecutive();
        prepareEmployeeForTravel(salesExecutive);
    }
}
