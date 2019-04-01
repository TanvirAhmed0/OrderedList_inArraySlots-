/*
Tests out ordered list
*/
public class UserOfOrderedList {
    public static void main( String[] args) {
        //Testing out the constructor and toString
        OrderedList_inArraySlots test = new OrderedList_inArraySlots();
        System.out.println(test);
        test = new OrderedList_inArraySlots( 0 );
        System.out.println(test);
        
        //Testing add method
        test.add( 1 );
        System.out.println(test);
        test.add( 8 );
        System.out.println(test);
        test.add( 6 );
        System.out.println(test);
        test.add( 0 );
        System.out.println(test);

        
        //Testing get method
        System.out.println( test.get( 1 ));
        
        //Testing remove method
        test.remove( 1 );
        System.out.println( test );
    }
}