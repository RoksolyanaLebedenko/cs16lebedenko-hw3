/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.ucu.functions;

import java.util.Comparator;

/**
 *
 * @author Andrii_Rodionov
 */
public interface MyComparator extends Comparator<Object>{

    MyComparator cmp = new MyComparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Integer) o1) - ((Integer) o2);
        }
    };

    int compare(Object o1, Object o2);
    
}
