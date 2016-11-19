/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.ucu.functions;

/**
 *
 * @author Andrii_Rodionov
 */
public interface MyFunction {

    MyFunction func = new MyFunction() {
        @Override
        public Object apply(Object t) {
            return 2 * ((Integer) t);
        }
    };

    Object apply(Object t);
}
