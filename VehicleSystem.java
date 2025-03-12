import java.sql.SQLOutput;

class Vehicle {
    private static double registrationFee = 500; // Static variable
    private final String registrationNumber; // Final variable
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updatedRegistrationFees(double updatedFees) {
        registrationFee = updatedFees;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using instanceof
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
        }
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("GD52", "Yagyata", "Car");
        Vehicle vehicle2 = new Vehicle("LX56", "Loveleen", "Motorcycle");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updatedRegistrationFees(1000.0);
        System.out.println();

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}