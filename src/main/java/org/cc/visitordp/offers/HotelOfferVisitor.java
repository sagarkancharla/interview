package org.cc.visitordp.offers;

import org.cc.visitordp.creditcards.BronzeCreditCard;
import org.cc.visitordp.creditcards.GoldCreditCard;
import org.cc.visitordp.creditcards.SilverCreditCard;

public class HotelOfferVisitor implements OfferVisitor {
    @Override
    public void visitBronzeCC(BronzeCreditCard bronzeCreditCard) {
        System.out.println("we are computing the cashback for a bronze  card buying hotel");

    }

    @Override
    public void visitSilverCC(SilverCreditCard silverCreditCard) {
        System.out.println("we are computing the cashback for a silver  card buying hotel");

    }

    @Override
    public void visitGoldCC(GoldCreditCard goldCreditCard) {
        System.out.println("we are computing the cashback for a gold  card buying hotel");

    }
}
