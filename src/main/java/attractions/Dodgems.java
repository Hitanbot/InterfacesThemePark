package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public Double defaultPrice() {
        return 8.40;
    }

    public Double priceForVisitor(Visitor visitor) {
        if (visitor.getAge()<12){
            return (defaultPrice()/2);
        }
        return defaultPrice();
    }



}
