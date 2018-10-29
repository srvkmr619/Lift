/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lift;

/**
 *
 * @author sourav
 */
class Lift{
    
    public static void goToFloor(int currentFloor,int pickFloor,int dropFloor) throws InterruptedException
    {
        System.out.println("The lift is at:" + currentFloor);
        System.out.println("Coming to: "+ pickFloor);
        if(currentFloor > pickFloor)
        {
            while(currentFloor != pickFloor)
            {
                System.out.println(currentFloor);
                Thread.sleep(1000);
                currentFloor--;
            }
        }
        else
        {
            while(currentFloor != pickFloor)
            {
                System.out.println(currentFloor);
                Thread.sleep(1000);
                currentFloor++;
            }
        }
        System.out.println("The lift has arrived at:"+pickFloor);
        
        while(currentFloor != dropFloor)
        {
           if(dropFloor > currentFloor)
               currentFloor++;
           else if(dropFloor < currentFloor)
               currentFloor--;
           Thread.sleep(1000);
           System.out.println(currentFloor);
        }
        
        System.out.println("You have arrived at your destination... Thank You!");
    }
    
    
}
