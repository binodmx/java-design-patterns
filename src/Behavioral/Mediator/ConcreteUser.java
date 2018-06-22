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
public class ConcreteUser extends User {
	 
    public ConcreteUser(Mediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);                                                 // Adding user to the list in mediator
    }
    
    @Override
    public void send(String msg){
        System.out.println(this.name+": Sent Message: "+msg);
        mediator.sendMessage(msg, this);
    }
    
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message: "+msg);
    }
 
}
