/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 160278m
 */
public class Section implements IVisitable {
    private Heading heading;
    private ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    
    public Section(Heading heading){
        this.heading=heading;
    }
    
    public void addParagraph(Paragraph paragraph){
        this.paragraphs.add(paragraph);
    }
    
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        for (Iterator<Paragraph> itr = paragraphs.iterator(); itr.hasNext();)
        {
                ((IVisitable)itr.next()).accept(visitor);
        }
        System.out.println("</section>");
    }
    
}
