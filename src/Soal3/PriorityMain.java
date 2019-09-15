/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author Etem
 */
public class PriorityMain {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue();
        pq.Enqueue(10);
        pq.Enqueue(30);
        pq.Enqueue(50);
        pq.Dequeue();
        pq.Enqueue(70);
        while(!pq.isEmpty()){
            int item = pq.Dequeue();
            System.out.print(item+" ");
        }
        System.out.println("");
    }
}
