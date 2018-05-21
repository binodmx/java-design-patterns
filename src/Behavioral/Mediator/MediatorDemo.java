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
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();
        User user1 = new User(mediator, "a");
        User user2 = new User(mediator, "b");
        User user3 = new User(mediator, "c");
        User user4 = new User(mediator, "d");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user3.send("I love you");
    }
}
