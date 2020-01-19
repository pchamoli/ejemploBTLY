/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author pchamoli
 * Ordena un array y busca los números que suman una cantidad determinada
 */
public class SortAndSum {
    
    public static Integer[] buscarNumeros(Integer[] parametro, Integer suma){        
        Integer [] retorno;
        List <Integer> aret = new ArrayList <Integer>();
        
        Arrays.sort(parametro, 0, parametro.length);
        
        for(int i=0; i<parametro.length; i++){
            for(int j=i+1; j<parametro.length;j++){
                if(parametro[i]+parametro[j]>suma) break;
                
                if(parametro[i]+parametro[j]==suma) {
                    aret.add(parametro[i]);
                    aret.add(parametro[j]);
                } 
            }
        }
        
        retorno = aret.toArray(new Integer[aret.size()]);
        
        return retorno;
    }
    
    public static void main(String[] args) {
        
        Integer [] numeros = {3,5,-4,8,11,1,-1,6};
        Integer suma = 10;
        /*
        Integer [] numeros = {2,-7,4,8,-11};
        Integer suma = 56;
        */
        Integer[] retorno = buscarNumeros(numeros, suma);
        
        for(Integer e : retorno){
				System.out.println(e);
		}
    }
}
