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
public class Body implements IVisitable{
    private ArrayList<Section> sections = new ArrayList<Section>();

    public void addSection(Section section){
        this.sections.add(section);
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
        for (Iterator<Section> itr = sections.iterator(); itr.hasNext();)
        {
                ((IVisitable)itr.next()).accept(visitor);
        }
        System.out.println("</body>");
    }
}
