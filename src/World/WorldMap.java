package World;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorldMap {


    public boolean loadMap(){
            String line;
            while ((line = br.readLine()) != null){
                String[] lines = line.split(";");
            }
            return true;
        }catch (IOException e){
            return false;
        }



    }

}