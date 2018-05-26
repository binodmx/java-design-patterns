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
public class PrintingService implements IVisitor{

    @Override
    public void visit(Body body) {
        System.out.println("<body>");
    }

    @Override
    public void visit(Document document) {
        System.out.println("<document>");
    }

    @Override
    public void visit(Heading heading) {
        System.out.println("<heading>"+heading.getValue()+"</heading>");
    }

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("<paragraph>"+paragraph.getValue()+"</paragraph>");
    }

    @Override
    public void visit(Section section) {
        System.out.println("<section>");
    }

    @Override
    public void visit(Title title) {
        System.out.println("<title>"+title.getValue()+"</title>");
    }

}
