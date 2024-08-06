
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yuan
 */
public class ExistingPlayers {
    private ArrayList<User> list;
    
    public ExistingPlayers() throws FileNotFoundException, IOException, ParseException{
        this.list= new ArrayList<>();
        FileReader fReader = new FileReader("namebook.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            String line;
            //System.out.println("jhvijfvv");
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                JSONParser parser = new JSONParser();
                //System.out.println("jcdcndnsjndssd");
                FileReader getInfo=new FileReader(line+".json");
                JSONObject obj=(JSONObject) parser.parse(getInfo);
                String name=(String) obj.get("name");
                JSONArray score=(JSONArray) obj.get("score");
                String lvl=obj.get("solvedLevel").toString();
                JSONArray mistakes=(JSONArray) obj.get("mistakes");
                getInfo.close();
                int totalS=0;
                User toAdd=new User(name);
                for(int i=0;i<5;i++){
                    String s= score.get(i).toString();
                    int num=Integer.parseInt(s);
                    toAdd.setLevelScore(i+1, num);
                    totalS+=num;
                }
                toAdd.setLevel(Integer.valueOf(lvl));
                toAdd.setTotalScore(totalS);
                //this.list.add(toAdd);
                for(int i=0;i<mistakes.size();i++){
                    toAdd.newMistake(mistakes.get(i).toString());
                }
                list.add(toAdd);
            }
            fReader.close();
            bufferedReader.close();
    
    }
    public void showList(){
        for(int i=0;i<this.list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public ArrayList<User> getList(){
        return this.list;
    }

    
}
