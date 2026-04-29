import java.util.List;
import java.util.Scanner;

    private static final Scanner scanner = new Scanner(System.in);
    private static final RouteService service = new RouteService();

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║ ROUTE TRACKER SYSTEM v1.0 ║");
        System.out.println("╚══════════════════════════════════════════╝");

        boolean running = true;
        while (running) {
            printMainMenu();
            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1: menuDriverManagement(); break;
                case 2: menuCheckpointManagement(); break;
                case 3: menuRouteAnalysis(); break;
                case 0:
                    System.out.println("Goodbye!");
                    DBConnection.closeConnection();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println();
        System.out.println("──────── MAIN MENU ────────");
        System.out.println(" 1. Driver Management");
        System.out.println(" 2. Checkpoint Management");
        System.out.println(" 3. Route Analysis & Reports");
        System.out.println(" 0. Exit");
        System.out.println("───────────────────────────");
    }

    private static void menuDriverManagement() {
        boolean back = false;
        while (!back) {
            System.out.println();
            System.out.println("── Driver Management ──");
            System.out.println(" 1. Register New Driver");
            System.out.println(" 2. View All Drivers");
            System.out.println(" 3. Update Driver Name");
            System.out.println(" 4. Delete Driver");
            System.out.println(" 0. Back");

            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1: registerDriver(); break;
                case 2: viewAllDrivers(); break;
                case 3: updateDriver(); break;
                case 4: deleteDriver(); break;
                case 0: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void registerDriver() {
        String id = readString("Enter Driver ID : ");
        String name = readString("Enter Driver Name : ");
        boolean ok = service.registerDriver(id, name);
        System.out.println(ok ? "Driver registered successfully." : "Failed to register driver.");
    }

    private static void viewAllDrivers() {
        List<Driver> drivers = service.getAllDrivers();
        if (drivers.isEmpty()) {
            System.out.println("No drivers found.");
            return;
        }
        System.out.println("\n── All Drivers ──");
        for (Driver d : drivers) {
            System.out.println(" " + d);
        }
    }

    private static void updateDriver() {
        String id = readString("Enter Driver ID : ");
        String newName = readString("Enter New Driver Name : ");
        boolean ok = service.updateDriverName(id, newName);
        System.out.println(ok ? "Driver updated." : "Update failed.");
    }

    private static void deleteDriver() {
        String id = readString("Enter Driver ID to delete: ");
        boolean ok = service.removeDriver(id);
        System.out.println(ok ? "Driver deleted (and all checkpoints)." : "Delete failed.");
    }

    private static void menuCheckpointManagement() {
        boolean back = false;
        while (!back) {
            System.out.println();
            System.out.println("── Checkpoint Management ──");
            System.out.println(" 1. Add Checkpoint to Driver Route");
            System.out.println(" 2. Update Checkpoint");
            System.out.println(" 3. Delete Checkpoint");
            System.out.println(" 4. Find Checkpoint in Driver Route");
            System.out.println(" 0. Back");

            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1: addCheckpoint(); break;
                case 2: updateCheckpoint(); break;
                case 3: deleteCheckpoint(); break;
                case 4: findCheckpoint(); break;
                case 0: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void addCheckpoint() {
        String driverId = readString("Driver ID : ");
        String checkpointId = readString("Checkpoint ID : ");
        String locationName = readString("Location Name : ");
        System.out.println("Checkpoint Type (DELIVERY / FUEL / REST):");
        String type = readString("Type : ");
        double distance = readDouble("Distance from Last (km) : ");
        double expected = readDouble("Expected Duration (min) : ");
        double actual = readDouble("Actual Duration (min) : ");

        boolean ok = service.addCheckpointToDriver(driverId, checkpointId,
                locationName, type, distance, expected, actual);
        System.out.println(ok ? "Checkpoint added successfully." : "Failed to add checkpoint.");
    }

    private static void updateCheckpoint() {
        String cpId = readString("Checkpoint ID : ");
        String newLocation = readString("New Location Name : ");
        double newExpected = readDouble("New Expected Duration (min): ");
        double newActual = readDouble("New Actual Duration (min): ");
        boolean ok = service.updateCheckpointDetails(cpId, newLocation, newExpected, newActual);
        System.out.println(ok ? "Checkpoint updated." : "Update failed.");
    }

    private static void deleteCheckpoint() {
        String cpId = readString("Checkpoint ID to delete: ");
        boolean ok = service.removeCheckpoint(cpId);
        System.out.println(ok ? "Checkpoint deleted." : "Delete failed.");
    }

    private static void findCheckpoint() {
        String driverId = readString("Driver ID : ");
        String checkpointId = readString("Checkpoint ID : ");
        Checkpoint cp = service.findCheckpointInRoute(driverId, checkpointId);
        if (cp == null) {
            System.out.println("Checkpoint not found in driver's route.");
        } else {
            System.out.println("Found → " + cp);
        }
    }

    private static void menuRouteAnalysis() {
        boolean back = false;
        while (!back) {
            System.out.println();
            System.out.println("── Route Analysis ──");
            System.out.println(" 1. Print Full Route Summary (Driver)");
            System.out.println(" 2. Compute Route Score");
            System.out.println(" 3. Check Route Consistency");
            System.out.println(" 0. Back");

            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1: printSummary(); break;
                case 2: showRouteScore(); break;
                case 3: checkConsistency(); break;
                case 0: back = true; break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void printSummary() {
        String driverId = readString("Driver ID: ");
        service.printRouteSummary(driverId);
    }

    private static void showRouteScore() {
        String driverId = readString("Driver ID: ");
        double score = service.computeRouteScore(driverId);
        if (score < 0) {
            System.out.println("Driver not found.");
        } else {
            System.out.printf("Route Score for %s : %.1f%n", driverId, score);
        }
    }

    private static void checkConsistency() {
        String driverId = readString("Driver ID: ");
        boolean consistent = service.checkRouteConsistency(driverId);
        System.out.println("Critical Route Check: " +
                (consistent
                        ? "All required checkpoints present"
                        : "WARNING – Missing critical checkpoints!"));
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        try {
            int val = Integer.parseInt(scanner.nextLine().trim());
            return val;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static double readDouble(String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Defaulting to 0.0");
            return 0.0;
        }
    }

