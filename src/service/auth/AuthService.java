package service.auth;

import entities.user.User;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AuthService {

    public boolean signUp(JPanel regPanel) throws IllegalArgumentException, IllegalAccessException {
        Component[] components = regPanel.getComponents();
        User u = new User();
        Field[] fields = u.getClass().getDeclaredFields();
        for (int i = 0; i < components.length; i++) {
            if (!components[i].getClass().equals(JTextField.class)) {
                continue;
            }

            for (int j = 0; j < fields.length; j++) {
                if (!components[i].getName().equals(fields[j].getName())) {
                    continue;
                }
                fields[j].setAccessible(true);
                fields[j].set(u, ((JTextField) components[i]).getText());
                fields[j].setAccessible(false);
                break;
            }
        }
        
        if(isUserExists(u)) return false;
        
        u.setId(UUID.randomUUID().toString());

        File db = new File("users.txt");
        if (!db.exists()) {
            try {
                db.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        BufferedWriter bw = null;
        try {
             bw = new BufferedWriter(new FileWriter(db, true));
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }

        StringBuilder sb = new StringBuilder();
        sb.
                append(u.getId())
                .append("\t")
                .append(u.getName())
                .append("\t")
                .append(u.getSurname())
                .append("\t")
                .append(u.getLogin())
                .append("\t")
                .append(u.getEmail())
                .append("\t")
                .append(u.getPassword());
        
        try {
            bw.write(sb.toString());
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
        
    }

    private boolean isUserExists(User u){
        
        File db = new File("users.txt");
        if(!db.exists()) try {
            db.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(db));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String line;
        try {
            while((line = br.readLine()) != null){
                if(line.contains(u.getLogin())) return true;
                if(line.contains(u.getEmail())) return true;
            }   
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean signin(JPanel logPanel) throws IllegalArgumentException, IllegalAccessException{
        Component[] components = logPanel.getComponents();
        User u = new User();
        Field[] fields = u.getClass().getDeclaredFields();
        for (int i = 0; i < components.length; i++) {
            if (!components[i].getClass().equals(JTextField.class)) {
                continue;
            }

            for (int j = 0; j < fields.length; j++) {
                if (!components[i].getName().equals(fields[j].getName())) {
                    continue;
                }
                fields[j].setAccessible(true);
                fields[j].set(u, ((JTextField) components[i]).getText());
                fields[j].setAccessible(false);
                break;
            }
        }
        
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader("users.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        try {
            while((line = br.readLine()) != null){
                if(line.contains(u.getPassword()) && (isUserLoginExists(line, u.getLogin()))) return true;
            }   
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    private boolean isUserLoginExists(String dataAll, String loginOfNewUser){
        User u = toUser(dataAll);
        return u.getLogin().equals(loginOfNewUser);
    }
    private boolean isUserEmailExists(String dataAll, String emailOfNewUser){
        User u = toUser(dataAll);
        return u.getEmail().equals(emailOfNewUser);
    }
    
    private User toUser(String dataAll){
        User ret = new User();
        String []data = dataAll.split("\t");
        ret.setId(data[0]);
        ret.setName(data[1]);
        ret.setSurname(data[2]);
        ret.setEmail(data[3]);
        ret.setLogin(data[4]);
        ret.setPassword(data[5]);
        System.out.println(ret.toString());
        return ret;
    }
}
