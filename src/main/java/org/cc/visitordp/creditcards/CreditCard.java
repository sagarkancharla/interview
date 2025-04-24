package org.cc.visitordp.creditcards;

import org.cc.visitordp.offers.OfferVisitor;

public interface CreditCard {

    String getName();
    void accept(OfferVisitor visitor);
}
