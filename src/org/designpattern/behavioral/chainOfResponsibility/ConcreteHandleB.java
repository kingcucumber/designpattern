package org.designpattern.behavioral.chainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: jinhuawa
 * Date: 4/29/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteHandleB extends Handle {
    public ConcreteHandleB() {
        super();
    }


    @Override
    public void HandleRequest() {
        //To change body of implemented methods use File | Settings | File Templates.
        if(this.getSuccessor() != null){
            System.out.println("deliver the control to the next handler..");
        }else{
            System.out.println("must handle this problem!");
        }
        System.out.println("mission has been completed!");
    }
}
