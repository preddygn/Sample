package demo;

import java.util.*;

interface XList {

    static XList sampledemo()
    {
        System.out.println("Shreeja");
        return null;
    }

}
public class Demo  {

    public static void main(String[] args) {
        System.out.println(XList.sampledemo());
        System.out.println("Gold");  
    }
}
