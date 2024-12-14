package com.workintech.s17d2.tax;

import org.springframework.stereotype.Component;

@Component
public class DeveloperTax implements Taxable{
    private static final double SIMPLE_TAX_RATE = 15d;
    private static final double MIDDLE_TAX_RATE = 25d;
    private static final double UPPER_TAX_RATE = 35d;

    @Override
    public Double getSimpleTaxRate() {
        return SIMPLE_TAX_RATE;
    }

    @Override
    public Double getMiddleTaxRate() {
        return MIDDLE_TAX_RATE;
    }

    @Override
    public Double getUpperTaxRate() {
        return UPPER_TAX_RATE;
    }
}
