import Command.*;
import Entities.Enemy;
import Entities.Player;
import World.WorldMap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Represents the main console interface for the game.
 * Handles user input, command execution, command initialization and logging of all entered commands.
 */

public class Console {
    private boolean exit = false;
    private  HashMap<String, Command> map = new HashMap<>();
    private WorldMap worldMap = new WorldMap();

    public void inicialization(){
        map.put("help", new Help());
        map.put("go", new GoTo(worldMap));
        map.put("showinventory", new ShowInventory());
        map.put("search", new Search(worldMap.getCurrentPosition()));
        map.put("quit", new Quit());
        map.put("hide", new Hide());
        map.put("open", new OpenDoor());
        map.put("use", new UseItem());
        map.put("text", new Text());
        map.put("fight", new Fight());
        worldMap.loadMap();

    }

    private Scanner scanner = new Scanner(System.in);

    /**
     * asks the player what they want to do, read their input, logs it and executes the appropriate command.
     */

    public void doCommand(){
        System.out.print(">>");
        String command = scanner.nextLine();
        command = command.trim();
        command = command.toLowerCase();
        if(map.containsKey(command)){
            System.out.println(">> "+map.get(command).execute());
        }else{
            System.out.println(">> Nondefined command");
        }
    }
    /**
     * Starts the game loop. Loads the world map and shows help and repeatedly prompts for commands till the game ends.
     */
    public void start(){
        inicialization();
        try{
            do{
                doCommand();
            }while(!exit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
