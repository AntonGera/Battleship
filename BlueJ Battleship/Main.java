import chn.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        ConsoleIO con = new ConsoleIO();
        PlayerBoard bor = new PlayerBoard(10, 10);
        int xCord,yCord,boatType,rot;
        bor.emptyBoard();
        System.out.print(" ");
         for(int y = 1; y <= bor.getWidth(); y++)
        {
            System.out.print(y + " ");
        }
        System.out.println();
        for(int y = 0; y < bor.getHeight(); y++)
        {
            System.out.print(y+1);
            for (int x = 0; x < bor.getWidth(); x++)
                System.out.print(bor.displaySpot(x, y) + " ");
            System.out.println();
        }
        System.out.println();
        /*
        bor.setShip(1, 1, 0, "Battleship");
        bor.setShip(4, 4, 1, "Submarine");
        System.out.println(bor.setShip(6, 6, 0, "Carrier"));
        System.out.println(bor.setShip(6,6,0, "Patrol Boat")); //Test to see if you can place a ship on another ship
        System.out.println(bor.setShip(10,10,0, "Battleship")); //Test to see if you can place a ship off array
        System.out.println(bor.rotateShip(4,4));
        System.out.println(bor.rotateShip(6,6));
        System.out.println(bor.receiveAttack(1,1));
        System.out.println(bor.receiveAttack(2,1));
        System.out.println(bor.receiveAttack(3,1));
        System.out.println(bor.receiveAttack(4,1));
        System.out.println(bor.receiveAttack(5,1));
        System.out.println(bor.receiveAttack(6,1));
        System.out.println(bor.receiveAttack(2,2));
        */
        for(int x = 0; x < 5; x++)
        {
            System.out.println("Please type a X cord.");
            xCord = con.readInt();
            System.out.println("Please type a Y cord.");
            yCord = con.readInt();
            System.out.println("Please type 0 for Horizontal and 1 for Vertical");
            rot = con.readInt();
            System.out.println("BattleShip:1,Submarine:2,Carrier:3,PatrolBoat:4,Destroyer:5");
            boatType = con.readInt();
            switch(boatType)
            {
                case(1):
                    if(bor.setShip(xCord,yCord,rot,"Battleship"))
                    
                    break;
                case(2):
                    if(bor.setShip(xCord,yCord,rot,"Submarine"))
                    break;                
                case(3):
                    if(bor.setShip(xCord,yCord,rot,"Carrier"))
                    break;                
                case(4):
                    if(bor.setShip(xCord,yCord,rot,"Patrol Boat"))
                    break;                
                case(5):
                    if(bor.setShip(xCord,yCord,rot,"Destroyer"))
                    break;              
            }    
            for(int y = 0; y < bor.getHeight(); y++)
            {
                for (int x2 = 0; x2 < bor.getWidth(); x2++)
                    System.out.print(bor.displaySpot(x2, y) + " ");
                System.out.println();
            }
        }
        while(!bor.isEmpty())
        {
            System.out.println("Please type a X cord to Shoot.");
            xCord = con.readInt();
            System.out.println("Please type a Y cord to Shoot.");
            yCord = con.readInt();
            if(bor.receiveAttack(xCord,yCord))
            {
                System.out.println("U SONK MOI BITLESHOP");
            }
            
            for(int y = 0; y < bor.getHeight(); y++)
            {
                for (int x2 = 0; x2 < bor.getWidth(); x2++)
                System.out.print(bor.displaySpot(x2, y) + " ");
                System.out.println();
            }
            
        }    
        System.out.println("hoi tots pritu gud, u won");
    }
}
