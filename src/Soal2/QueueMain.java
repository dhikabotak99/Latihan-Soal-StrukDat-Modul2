package Soal2;

/**
 *
 * @author Etem
 */
public class QueueMain {
    public static void main(String[] args){
        Queue que = new Queue(5);
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.dequeue();
        que.enqueue(40);
        que.enqueue(50);
        
        while(!que.isEmpty()){
            int n=que.dequeue();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println(que.peekFront());
    }

}
