package smartdocklandsapp;
import smartwaste.model.*;
import smartwaste.adt.*;
/**
 * @author Michal Pokojny - x23355999
 */
public class SmartDocklandsApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test 1 - Polymorphism
        SmartWaste bin1 = new GeneralWasteBin("BIN001", "Grand Canal Dock", 85, "Active", "Mixed");
        SmartWaste bin2 = new RecyclingBin("BIN002", "Grand Canal Dock 2", 60, "Active", "Plastic");
        System.out.println(bin1);
        System.out.println(bin2);
        System.out.println("Priority bin1: " + bin1.getCollectionPriority());
        System.out.println("Priority bin2: " + bin2.getCollectionPriority());

        // Test 2 - SinglyLinkedList
        SinglyLinkedList<SmartWaste> route = new SinglyLinkedList<>();
        route.add(bin1);
        route.add(bin2);
        System.out.println("Size before remove: " + route.size()); 
        route.remove(0);
        System.out.println("Size after remove: " + route.size());  

        // Test 3 - Queue
        Queue<SmartWaste> queue = new Queue<>();
        queue.enqueue(bin1); 
        System.out.println("Queue peek: " + queue.peek());
    }
    
}
