/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yuan
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class scoreBoard {
    
        private LinkedList<User> users;
        public scoreBoard() throws FileNotFoundException, IOException, ParseException{
            this.users=new LinkedList<>();
            FileReader fReader = new FileReader("namebook.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                //System.out.println(line);
                JSONParser parser = new JSONParser();
                FileReader getInfo=new FileReader(line+".json");
                JSONObject obj=(JSONObject) parser.parse(getInfo);
                String name=(String) obj.get("name");
                JSONArray score=(JSONArray) obj.get("score");
                getInfo.close();
                int totalS=0;
                for(int i=0;i<5;i++){
                    String s= score.get(i).toString();
                    int num=Integer.parseInt(s);
                    totalS+=num;
                }
                User newU=new User(name);
                newU.setTotalScore(totalS);
                this.addNew(newU);
            }
            fReader.close();
            bufferedReader.close();
            while(this.users.size()<10){
                User empty=new User("[empty profile]");
                users.add(empty);
            }
        }

        public User getUserByRk(int rk){
            return this.users.get(rk);
        }
	
	public void listScoreinDetail() {}
	
	public void addNew(User newUser) {
		int index=0;
		while (index < users.size() && users.get(index).getTotalScore() > newUser.getTotalScore() ) {
            index++;
        }
        users.add(index, newUser);
	}
}
