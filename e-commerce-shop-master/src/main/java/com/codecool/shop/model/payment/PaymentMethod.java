package com.codecool.shop.model.payment;

public interface PaymentMethod {
    void updateStatus();

    boolean isFinished();

    void setFinished(boolean finished);

    String getName();
}
