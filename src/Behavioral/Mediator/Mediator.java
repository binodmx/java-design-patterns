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
public interface Mediator {
    public void sendMessage(String msg, ConcreteUser user);
    void addUser(ConcreteUser user);
}
