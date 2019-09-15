package Soal1;

/**
 *
 * @author Etem
 */
public class StackMain {
    public static void main(String[] args){
        Stack s= new Stack();
        s.push(10);//Insert 10
        s.push(20);//Insert 20
        s.push(30);//Insert 30
        s.pop();//Pop the top
        s.push(40);//Insert 40
        s.push(50);//Insert 50
        while(!s.isEmpty()){
            int value = s.pop();
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println("");
    }
}
