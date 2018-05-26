/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Visitor;

/**
 *
 * @author 160278m
 */
public class Document implements IVisitable{
    private Title title;
    private Body body;
    
    public Document(Title title){
        this.title=title;
    }
    
    public Title getTitle(){
        return this.title;
    }
    
    public void addBody(Body body){
        this.body=body;
    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        this.body.accept(visitor);
        System.out.println("</document>");
    }
}
