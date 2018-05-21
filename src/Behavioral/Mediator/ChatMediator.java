/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Binod
 */
public class ChatMediator implements Mediator {
 
    private List<User> users;
     
    public ChatMediator(){
        this.users=new ArrayList<>();
    }
     
    @Override
    public void addUser(User user){
        this.users.add(user);
    }
     
    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }
}
