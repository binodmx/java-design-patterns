/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.ChainOfResponsibility;

/**
 *
 * @author Binod
 */
public class ChainOfResponsibilityDemo {
    public static void main(String args[]){
        // Setup Chain of Responsibility
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        h3.setSuccessor(h1);

        // Send requests to the chain
        h1.handleRequest(new Request("Value = ", -1));
        h1.handleRequest(new Request("Value = ",  0));
        h1.handleRequest(new Request("Value = ",  1));
        h1.handleRequest(new Request("Value = ",  2));
        h1.handleRequest(new Request("Value = ", -5));	
    }
}
