public class Main {
    public static void main(String[] args) {
        DEQ deq=new DEQ();
        for(int i=1;i<=10;i++)
            deq.addHead(new Matrix(i));
        for(int i=1;i<=10;i++)
            deq.addTail(new Matrix(-i));
        System.out.println(deq);
    }
}
