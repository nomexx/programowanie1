package SDAColectionPractice.Kalkulator;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQUEE {
    public static void main(String[] args) {
        PriorityQUEE priorityQUEE= new PriorityQUEE();
        priorityQUEE.wypelnij();
        priorityQUEE.wypisz();

    }

    Random random = new Random();
    Queue<Double> kolejkaPior = new PriorityQueue<>(Double::compareTo);
    public void wypelnij(){
        for (int i = 0 ;i<20;i++) {
            kolejkaPior.offer(random.nextDouble()*10);
        }
    }
    public void wypisz(){
        while (kolejkaPior.peek()!=null){
            System.out.println( kolejkaPior.poll());
        }
    }
}
