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
public interface IVisitable {

    /**
     *
     * @param visitor
     */
    public void accept(IVisitor visitor);
}
