/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Administrator
 */
public class Tree extends Plant {
    
    @Override
    public void grow(){
        System.out.println("tree growing");
    }
    
    public void shedLeaves(){
        System.out.println("tree sheds leaves in autum");
    }
    
}
