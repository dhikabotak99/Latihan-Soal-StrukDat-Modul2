package Soal3;

/**
 *
 * @author Etem
 */
public class PriorityQueue {
    private int max;
    private int[] queue;
    private int nItems;
    
    public PriorityQueue(int s){
        max=s;
        queue = new int[max];
        nItems=0;
    }
    public void Enqueue(int e){
        int j;
        if (nItems==0) {//Jika tidak ada
            queue[nItems++]=e;
        }
        else{//Jika ada
            for (j = nItems-1; j >= 0; j--) {//Dimulai dari yang terakhir
                if (e>queue[j]) {//Jika item baru lebih besar
                    queue[j+1]=queue[j];//pindahkan ke belakang
                }
                else{
                    break;
                }
            }
            queue[j+1]=e;
            nItems++;
        }
    }
    
    public int Dequeue(){
        return queue[--nItems];
    }
    
    public int peekMin(){
        return queue[nItems-1];
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
}
