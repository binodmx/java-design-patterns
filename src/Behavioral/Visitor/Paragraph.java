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
public class Paragraph implements IVisitable {
    private String value;
    
    public Paragraph(String value){
        this.value=value;
    }
    
    public String getValue(){
        return this.value;
    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
