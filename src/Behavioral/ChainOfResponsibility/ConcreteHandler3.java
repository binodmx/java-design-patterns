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
public class ConcreteHandler3 extends Handler{
    @Override
    protected boolean handleRequestImpl(Request request){
        if (request.getValue() == 0){
            System.out.println("Zero values are handled by ConcreteHandler3:");
            System.out.println("\tConcreteHandler3.HandleRequest : " 
                    + request.getDescription() + request.getValue());
            return true;
        } else {
            return false;
        }
    }
}
