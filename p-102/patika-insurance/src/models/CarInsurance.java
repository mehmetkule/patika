package models;

import java.util.Date;

public class CarInsurance extends Insurance {
    public CarInsurance(String name, double price, Date startDate, Date endDate) {
        super(name, price, startDate, endDate);
    }

    @Override
    public void calculate() {
        // Calculate car insurance price
    }
}
