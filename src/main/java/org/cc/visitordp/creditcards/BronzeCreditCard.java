package org.cc.visitordp.creditcards;

import org.cc.visitordp.offers.OfferVisitor;

public class BronzeCreditCard implements CreditCard{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visitBronzeCC(this);
    }
}
