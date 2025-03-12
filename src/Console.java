import Command.*;
import java.util.HashMap;
import java.util.Scanner;


public class Console {
    private boolean exit = false;
    private HashMap<String, Command> map = new HashMap<>();

    public void inicialization(){
        map.put("goto", new GoTo());
        map.put("showInventory", new ShowInventory());
        map.put("Search", new Search());
        map.put("stop", new Quit());
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
