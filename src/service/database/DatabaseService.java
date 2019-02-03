package service.database;

import entities.user.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import service.auth.AuthService;

public class DatabaseService {

    private String db = "users.txt";
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

    public User findUserById(String id) throws IOException {
        File f = new File(db);
        if (!f.exists()) {
            return null;
        }
        BufferedReader r = new BufferedReader(new FileReader(f));
        String line;
        while ((line = r.readLine()) != null) {
            if (toUser(line).getId().equals(id)) {
                r.close();
                return toUser(line);

            }
        }
        r.close();
        return null;
    }

    public User findUserByEmail(String email) {
        throw new UnsupportedOperationException();
    }

    public void updateUserProfile(User user) throws FileNotFoundException, IOException {
        User au=findUserById(user.getId());
       
        saveUser(user);
    }

    public boolean isUserExists(User user) {
        throw new UnsupportedOperationException();
    }

    public User[] allUsers() {
        throw new UnsupportedOperationException();
    }

    public void saveUser(User user) throws IOException {
        File f = new File(db);
        if (!f.exists()) {
            return;
        } 
        
        
       
        String line;
        BufferedWriter w = new BufferedWriter(new FileWriter(f));
       
                w.write(new StringBuilder()
                .append(user.getId())
                .append("\t")
                .append(user.getName())
                .append("\t")
                .append(user.getSurname())
                .append("\t")
                .append(user.getLogin())
                .append("\t")
                .append(user.getEmail())
                .append("\t")
                .append(user.getPassword())
                .append("\t").toString());

            
        w.close();

    }
}
