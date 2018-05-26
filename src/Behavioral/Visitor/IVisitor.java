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
public interface IVisitor {
    public void visit(Body body);
    public void visit(Document document);
    public void visit(Heading heading);
    public void visit(Paragraph paragraph);
    public void visit(Section section);    
    public void visit(Title title);    
}
