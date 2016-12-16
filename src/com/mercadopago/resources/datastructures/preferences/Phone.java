package com.mercadopago.resources.datastructures.preferences;

import com.mercadopago.core.annotations.validation.Size;

/**
 * Mercado Pago SDK
 * Preferences Payer Phone class
 *
 * Created by Eduardo Paoletta on 12/12/16.
 */
public class Phone {

    @Size(max=256) private String areaCode = null;
    @Size(max=256) private String number = null;


    public String getAreaCode() {
        return areaCode;
    }

    public Phone setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Phone setNumber(String number) {
        this.number = number;
        return this;
    }

}
