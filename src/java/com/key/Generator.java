/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.key;

import java.util.Random;

/**
 *
 * @author Uchenna
 */
public class Generator {
    
    public static  int trackCode(){
        Random rand = new Random();
        int num = rand.nextInt(9000000) + (1000000);
        return num;
    }

    
}
