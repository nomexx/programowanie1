package SDAColectionPractice.zadanie1;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class LinkedList {
    public static void main(String[] args) {


    List<Integer>linkedList= new java.util.LinkedList<>();
    linkedList.add(3);
        Iterator<Integer>iterator=linkedList.iterator();
        Random random= new Random();
while (iterator.hasNext()){
    linkedList.add(linkedList.size()/2,random.nextInt(10));
    System.out.println(linkedList);
    if (linkedList.size()>20){
        break;
    }
}


    }}
