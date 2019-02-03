
package service.database;

import entities.user.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.auth.AuthService;

public class DatabaseService {
    
    private String db = "users.txt";
   //private AuthService authService = new AuthService();
   public User toUser(String dataAll){
        User ret = new User();
        String []data = dataAll.split("\t");
        ret.setId(data[0]); //id
        ret.setName(data[1]);   //name
        ret.setSurname(data[2]);    //surname
        ret.setLogin(data[3]);  //login
        ret.setEmail(data[4]);  //email
        ret.setPassword(data[5]);   //password
        return ret;
    }
   
 
    public User findUserById(String id){
        throw new UnsupportedOperationException();
    }
    
    public User findUserByEmail(String email){
       
        File f = new File(db);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        try {
            while((line = br.readLine()) != null){
                if(toUser(line).getEmail().equals(email)) return toUser(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void updateUserProfile(User user){
        throw new UnsupportedOperationException();
    }
    
    public boolean isUserExists(User user){
        throw new UnsupportedOperationException();
    }
    
    public User[] allUsers(){
        throw new UnsupportedOperationException();
    }
}
