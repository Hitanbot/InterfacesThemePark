package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge()>=12 && visitor.getHeight()>=145){
            return true;
        }
        return false;
    }


    public Double defaultPrice() {
        return 8.40;
    }



    public Double priceForVisitor(Visitor visitor) {
        if (visitor.getHeight()>=200){
            return (2*defaultPrice());
        }
        return defaultPrice();
    }
}
