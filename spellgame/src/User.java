import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class User {
    private String name;
    private int[]score;
    private int solvedLevel;
    private Boolean isInstructor = false;
    private Boolean isDeveloper = false;
    private List<String> mistakes;
    private boolean[] modifiers;
    private int totalScore;
    

    public User(String n){
  	this.name=n;
  	this.solvedLevel=1;
        this.score=new int[5];
        this.modifiers = new boolean[3];
        for(int i=0;i<5;i++){
            this.score[i]=0;
        }
  	this.mistakes=new ArrayList<String>(); 
    }
    public String getName() {
  	return this.name;
    }
    public int getLevel(){
        return this.solvedLevel;
    }
    public int getLevelScore(int lvl){
        return this.score[lvl-1];
    }
    public int[] getScore(){
        return this.score;
    }
    public int getTotalScore() {
    	return this.totalScore;
    }
    public Boolean getInstructor(){
        return this.isInstructor;
    }
    public Boolean getDeveloper(){
        return this.isDeveloper;
    }
    public void setLevel(int newLevel){
        this.solvedLevel = newLevel;
    }
    public void setLevelScore(int lvl,int newScore){
        this.score[lvl-1]= newScore;
        int tol=0;
    	for(int i=0;i<5;i++) {
    		tol+=score[i];
    	}
        this.setTotalScore(tol);
    }
    public void setInstructor(Boolean isInstructor){
        this.isInstructor = isInstructor;
    }
    public void setDeveloper(Boolean setDeveloper){
        this.isDeveloper = setDeveloper;
    }
    public User getUser(){
        return this;
    }
    public void newMistake(String word) {
    	this.mistakes.add(word);
    }
    public List<String> getMistakes(){
    	return mistakes;
    }
    public boolean[] getModifiers(){
        return modifiers;
    }
    public void setTotalScore(int s){
        this.totalScore=s;
    }
    public void saveUser() throws IOException{
        JSONArray s=new JSONArray();
        for (int number : this.score) {
            s.add(number);
        }
        JSONObject player=new JSONObject();
        player.put("name", this.name);
        player.put("score",s);
        player.put("solvedLevel",this.getLevel());
        player.put("isInstructor", this.getInstructor());
        player.put("isDeveloper", this.getDeveloper());
        player.put("mistakes", this.getMistakes());
        //player.put("modifiers",this.getModifiers());
        
        
        FileWriter file=new FileWriter(this.name+".json",false);
        file.write(player.toJSONString());
        //file.write("\n");
        file.flush();

        //file.write("666");
        file.close();
        //System.out.println("saved");
        boolean nameExist=false;
        try (BufferedReader reader = new BufferedReader(new FileReader("namebook.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line here
                if(line.contains(this.name)){nameExist=true;}
                //System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(nameExist==false){
            try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter("namebook.txt",true);
            writer.write(this.name+"\n");
            writer.close();
            
            //System.out.println("Text has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
            
        }
        
        
        
    }
    public void setModifiers(int modifier){
        modifiers[modifier] = true;
    }
}


