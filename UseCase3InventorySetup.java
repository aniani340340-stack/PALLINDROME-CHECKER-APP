import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory class - manages centralized room availability
 */
class RoomInventory {

    private Map<String, Integer> inventory;

    // Constructor initializes inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        // Initial room availability
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    // Get availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update availability
    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("\n--- Current Room Inventory ---");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> Available: " + entry.getValue());
        }
    }
}

/**
 * Use Case 3: Centralized Room Inventory Management
 * 
 * @author Anish
 * @version 3.0
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App (Version 3.0) =====");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        // Example update
        System.out.println("\nUpdating Single Room availability...");

        inventory.updateAvailability("Single Room", 4);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nApplication Finished.");
    }
}