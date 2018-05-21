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
public abstract class Handler{
    protected Handler successor;
    
    public void setSuccessor(Handler successor){
            this.successor = successor;
    }
    
    protected abstract boolean handleRequestImpl(Request request);

    public final void handleRequest(Request request){
        boolean handledByThisNode = this.handleRequestImpl(request);
        if (successor != null && !handledByThisNode){
                successor.handleRequest(request);
        }
    }      
}
