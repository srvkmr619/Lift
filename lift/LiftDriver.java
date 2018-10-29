/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lift;

import java.util.Scanner;

/**
 *
 * @author sourav
 */
public class LiftDriver {
    public static int currentFloor;
    public static int pickFloor;
    public static int dropFloor;
    
    public static void main(String[] args) throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current floor: ");
        currentFloor = input.nextInt();
        System.out.println("Where to Pick?");
        pickFloor = input.nextInt();
        System.out.println("Which Floor?");
        dropFloor = input.nextInt();
        Lift.goToFloor(currentFloor, pickFloor, dropFloor);
        
        Thread one = new Thread();
    }
    
}
