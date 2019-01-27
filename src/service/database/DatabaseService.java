
package service.database;

import entities.user.User;

public class DatabaseService {
    
    private String db = "users.txt";
    
    public User findUserById(String id){
        throw new UnsupportedOperationException();
    }
    
    public User findUserByEmail(String email){
        throw new UnsupportedOperationException();
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
