
package service.auth;

import entities.user.User;
import java.awt.Component;
import java.lang.reflect.Field;
import java.util.UUID;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AuthService {
    
    public void saveUser(JPanel regPanel) throws IllegalArgumentException, IllegalAccessException{
        Component []components = regPanel.getComponents();
        User u = new User();
        Field []fields = u.getClass().getDeclaredFields();
        for(int i = 0; i < components.length; i++){
            if(!components[i].getClass().equals(JTextField.class)) continue;
            
            for(int j = 0; j < fields.length;j++){
                if(!components[i].getName().equals(fields[j].getName())) continue;
                fields[j].setAccessible(true);
                fields[j].set(u, ((JTextField)components[i]).getText());
                fields[j].setAccessible(false);
                break;
            }
        }
        u.setId(UUID.randomUUID().toString());
        
        System.out.println(u.toString());
    }
}
