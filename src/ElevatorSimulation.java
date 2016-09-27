import java.util.Scanner;
/*
Test Elevator Simulation week 4. 
This Program simulates an elevator panel that skips the 13th floor. 
 */

public class ElevatorSimulation 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("floor: ");
        int floor = in.nextInt(); 
        
        // Adjust floor if necessary
        
        int actualFloor;
        if (floor > 13)
        {
            actualFloor = floor - 1;
        }
        else
        {
            actualFloor = floor; 
        }
            System.out.println("The elevator will travel to the actual floor " + actualFloor);
            }
        }
