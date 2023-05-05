package LinkedList;

public class main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(2);
//        list.insertFirst(15);
//        list.insertFirst(17);
//
//        list.insertLast(20);
//        list.insert(100,3);
//        list.display();
//       // list.deleteFirst();
//
//
//        System.out.println(list.deleteLast());
//        list.display();
//        list.delete(2);
//        list.display();


//        DLL list = new DLL();
//        list.insertFirst(5);
//        list.insertFirst(2);
//        list.insertFirst(15);
//        list.insertFirst(17);
//
//        list.display();
        //list.displayReverse();

        CLL list = new CLL();
        list.insert(5);
        list.insert(2);
        list.insert(15);
        list.insert(17);
        list.display();
        list.delete(15);
        list.display();


        

    }
}
