import Command.*;
import Entities.Enemy;
import Entities.Player;
import World.WorldMap;

import java.util.HashMap;
import java.util.Scanner;


public class Console {
    private boolean exit = false;
    private  HashMap<String, Command> map = new HashMap<>();
    private WorldMap worldMap = new WorldMap();

    public void inicialization(){
        map.put("goto", new GoTo(worldMap));
        map.put("showinventory", new ShowInventory());
        map.put("search", new Search());
        map.put("quit", new Quit());
        map.put("hide", new Hide());
        map.put("opendoor", new OpenDoor());
        map.put("steal", new Steal());
        map.put("pickUp", new PickUp());
        map.put("use", new UseItem());
        map.put("text", new Text());
        map.put("fight", new Fight());
        worldMap.loadMap();

    }

    private Scanner scanner = new Scanner(System.in);

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

    public void start(){
        inicialization();
        String text = Text.giveSpeech();
        System.out.println(text);
        try{
            do{
                doCommand();
            }while(!exit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
