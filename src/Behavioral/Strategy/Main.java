/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 160278m
 */
public class Main {

    public static void main(String[] args) {

            FileCompressorTool fct = new FileCompressorTool("FileCompressor");

            fct.setStrategy(new Technique_7zip());
            fct.compress();
            
            fct.setStrategy(new Technique_zip());
            fct.compress();
            
            fct.setStrategy(new Technique_rar());
            fct.compress();

    }
}
