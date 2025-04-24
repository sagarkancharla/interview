package org.cc.visitordp.offers;

import org.cc.visitordp.creditcards.BronzeCreditCard;
import org.cc.visitordp.creditcards.GoldCreditCard;
import org.cc.visitordp.creditcards.SilverCreditCard;

public interface OfferVisitor {

    void visitBronzeCC(BronzeCreditCard bronzeCreditCard);
    void visitSilverCC(SilverCreditCard silverCreditCard);
    void visitGoldCC(GoldCreditCard goldCreditCard);
}
