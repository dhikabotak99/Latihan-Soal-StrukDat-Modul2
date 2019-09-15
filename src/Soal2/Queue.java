package Soal2;

/**
 *
 * @author Etem
 */
public class Queue {
    private int max;//Membuat nilai maksimal pada array
    private int front;//Nilai paling awal
    private int rear;//Nilai paling akhir
    private int nItems;//Jumlah Item
    private int[] queue;
    
    public void enqueue(int e){
        if (rear==max-1) {//Mengatur lokasi Rear
            rear=-1;
        }
        queue[++rear]=e;//Menabahkan nilai rear dan memasukkan nilai
        nItems++;//Menambahkan nilai nItems
    }
    
    //Untuk Menghapus Item di Queue
    public long dequeue(){
        long temp = queue[front++];//Mengambil value dan mengurangi nilai front
        if (front==max) {//Mengatur Lokasi Front
            front=0;
        }
        nItems--;
        return temp;
    }
}

    