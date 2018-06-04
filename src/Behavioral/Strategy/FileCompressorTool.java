/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 160278m
 */
public class FileCompressorTool {
    private IStrategy strategy;
    private String name;

    public FileCompressorTool (String name){
            this.name = name;
    }
    
    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }
    
    public void setStrategy(IStrategy strategy){
            this.strategy = strategy;
    }

    public IStrategy getStrategy(){
            return strategy;
    }

    public void compress(){
            System.out.print(this.name + " compresses files ");
            strategy.compress();
    }

}
