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
public class Main {
    public static void main(String[] args){
        //Creating sub elements
        Title t = new Title("Design Patterns");
        Heading h1 = new Heading("Structural Design Patterns");
        Heading h2 = new Heading("Behavioural Design Patterns");
        Paragraph p1 = new Paragraph("Structural design patterns are those.......");
        Paragraph p2 = new Paragraph("There are many structural design patterns........");
        Paragraph p3 = new Paragraph("Behavioural  design patterns are those.......");
        Paragraph p4 = new Paragraph("There are many behavioural design patterns.........");
        
        //Creating the main document
        Section s1 = new Section(h1);
        s1.addParagraph(p1);
        s1.addParagraph(p2);
        
        Section s2 = new Section(h2);
        s2.addParagraph(p3);
        s2.addParagraph(p4);
        
        Body b = new Body();
        b.addSection(s1);
        b.addSection(s2);
        
        Document d = new Document(t);
        d.addBody(b);
        
        //Running Printing Service
        PrintingService ps = new PrintingService();
        d.accept(ps);
    }
}
