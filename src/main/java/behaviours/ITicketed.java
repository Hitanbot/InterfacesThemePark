package behaviours;

import people.Visitor;

public interface ITicketed {

    Double defaultPrice();

    Double priceForVisitor(Visitor visitor);
}
