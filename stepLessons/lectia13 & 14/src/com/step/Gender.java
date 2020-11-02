package com.step;

public enum Gender {
    MALE(65),
    FEMALE(60);

    private Integer pensionAge;

    private Gender(int pensionAge) {
        this.pensionAge = pensionAge;
    }

    public Integer getPensionAge() {
        return pensionAge;
    }
}
