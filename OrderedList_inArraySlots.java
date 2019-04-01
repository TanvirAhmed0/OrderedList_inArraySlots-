/*
Ordered list of elements

*/

public class OrderedList_inArraySlots {
    List_inArraySlots list;
    
    public OrderedList_inArraySlots() {
        list = new List_inArraySlots();
    }
    
    public OrderedList_inArraySlots( int element ) {
        this(); 
        list.add( element );
    }
    
    public String toString() {
        return list.toString();
    }
    
    public boolean add( int element ) {
        for ( int index = 0; index < list.size(); index++) {
            if ( element < list.get( index )) {
                list.add(index, element);
                return true;
            }
        }
        list.add(element);
        return true;
    }
    
    public int get( int index) {
        return list.get( index );
    }
    
    public int remove( int index ) {
        return list.remove( index );
    }
    
    public int size() {
        return list.size();
    }
}