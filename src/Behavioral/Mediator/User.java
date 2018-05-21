/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Mediator;

/**
 *
 * @author Binod
 */
public class User extends SuperUser {
	 
    public User(Mediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message: "+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message: "+msg);
    }
 
}
