public class DEQ {
    private Node last=null,head=null;
    void addHead(Matrix m){
        if(head!=null){
            head.next= new Node(null,head,m);
            head=head.next;

        }
        else{
            head=new Node(null,last,m);
            if(last==null)last=head;
        }
    }
    void addTail(Matrix m){
        if(last!=null){
            last.previous= new Node(last,null,m);
            last=last.previous;
        }
        else{
            last=new Node(head,null,m);
            if(head==null)head=last;
        }
    }
    Matrix getHead(){
        return head.m;
    }
    Matrix getTail(){
        return last.m;
    }

    @Override
    public String toString() {
        String out="";
        Node i=head;
        while(i!=null){
            out+=i.m.s+'\n';
            i=i.previous;
        }
        return out;
    }
}
