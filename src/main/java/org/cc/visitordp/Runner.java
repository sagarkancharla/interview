package org.cc.visitordp;

import org.cc.visitordp.creditcards.BronzeCreditCard;
import org.cc.visitordp.creditcards.CreditCard;
import org.cc.visitordp.creditcards.GoldCreditCard;
import org.cc.visitordp.creditcards.SilverCreditCard;
import org.cc.visitordp.offers.GasOfferVisitor;
import org.cc.visitordp.offers.HotelOfferVisitor;
import org.cc.visitordp.offers.OfferVisitor;

public class Runner {
    public static void main(String[] args) {
        OfferVisitor hotelOfferVisitor = new HotelOfferVisitor();
        OfferVisitor gasOfferVisitor = new GasOfferVisitor();

        CreditCard bronze = new BronzeCreditCard();
        CreditCard silver = new SilverCreditCard();
        CreditCard gold = new GoldCreditCard();

        bronze.accept(hotelOfferVisitor);
        bronze.accept(gasOfferVisitor);

        gold.accept(hotelOfferVisitor);

        silver.accept(gasOfferVisitor);
    }
}
