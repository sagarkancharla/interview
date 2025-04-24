package org.cc.visitordp.creditcards;

import org.cc.visitordp.offers.OfferVisitor;

public class SilverCreditCard implements CreditCard{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visitSilverCC(this);
    }
}
