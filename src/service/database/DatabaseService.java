package service.database;

import entities.user.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseService {
    
    private String db = "users.txt";
    
    public User toUser(String dataAll) {
        User ret = new User();
        String[] data = dataAll.split("\t");
        ret.setId(data[0]); //id
        ret.setName(data[1]);   //name
        ret.setSurname(data[2]);    //surname
        ret.setLogin(data[3]);  //login
        ret.setEmail(data[4]);  //email
        ret.setPassword(data[5]);   //password
        return ret;
    }
    
    public User findUserById(String id) {
        File f = new File(db);
        if (!f.exists()) {
            return null;
        }
        BufferedReader r = null;
        try {
            r = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        try {
            while ((line = r.readLine()) != null) {
                if (toUser(line).getId().equals(id)) {
                    r.close();
                    return toUser(line);
                    
                }
            }
            r.close();
        } catch (IOException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void updateUserProfile(User user) throws FileNotFoundException, IOException {
        User au = findUserById(user.getId());
        File f = new File(db);
        File f2 = new File("user2.txt");
        BufferedReader r = new BufferedReader(new FileReader(f));
        BufferedWriter w = new BufferedWriter(new FileWriter(f2));
        String str;
        while ((str = r.readLine()) != null) {
            User u = toUser(str);
            if (u.getId() != user.getId()) {
                w.write(str);
            } else {
                saveUser(user);
            }
        }
        f.delete();
        r.close();
        w.close();
        f2.renameTo(f);
    }
    
    public boolean isUserExists(User user) {
        ArrayList<User> users = getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(user.getEmail()) || users.get(i).getLogin().equals(user.getLogin())) {
                return true;
            }
        }
        return false;
    }
    
    public User findUserByEmail(String email) {
        File f = new File(db);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        try {
            while ((line = br.readLine()) != null) {
                if (toUser(line).getEmail().equals(email)) {
                    return toUser(line);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<User> getAllUsers() {
        ArrayList<User> ret = new ArrayList<>();
        File f = new File(db);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        try {
            while ((line = br.readLine()) != null) {
                ret.add(toUser(line));
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    public void saveUser(User user) {
        File f = new File(db);
        if (!f.exists()) {
            return;
        }
        String line;
        BufferedWriter w = null;
        try {
            w = new BufferedWriter(new FileWriter(f));
        } catch (IOException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
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
        } catch (IOException ex) {
            Logger.getLogger(DatabaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
