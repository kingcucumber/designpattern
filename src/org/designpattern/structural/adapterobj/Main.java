package org.designpattern.structural.adapterobj;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/16/13
 * Time: 7:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String [] args){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
