package Soal1;

/**
 *
 * @author Etem
 */
public class Stack {
    private int max; //Ukuran dari array stack private long[] stackArray;
    private int top; //Stack Paling atas
    private int stackArray[] = new int[10];
    
    public void push(int p){//Method Push
        stackArray[++top]=p;
    }
    public int pop(){//Method pop
        return stackArray[top--];
    }
    public int top(){//Method top
        return top;
    }
}
