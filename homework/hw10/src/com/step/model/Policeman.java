package com.step.model;

public class Policeman extends Person {
    private boolean allowedToUseGun;
    private double salary;
    private String lastArrestDate;
    private String lastArrestReason;

    public Policeman(boolean allowedToUseGun, double salary, String name, String surname, float height, String race, String birthDate) {
        super(name, surname, height, race, birthDate);
        this.allowedToUseGun = allowedToUseGun;
        this.salary = salary;
    }

    public void arrestSomeone(Person personToArrest, String reason) {
        showActionInfo(personToArrest, reason, "has been arrested by");
    }

    public void shootBandit(Person personToShoot, String reason) {
        if (allowedToUseGun) {
            showActionInfo(personToShoot, reason, "has been shot by");
        }
        else {
            System.out.println(this.getName() + " " + this.getSurname() + " is not allowed to use guns!");
        }
    }

    private void showActionInfo(Person bandit, String reason, String action) {
        this.lastArrestDate = "01.01.2020"; //need a today function;
        this.lastArrestReason = reason;

        System.out.println(bandit.getName() + " " + bandit.getSurname() +
                " " + action + ": " + this.getName() + " " + this.getSurname() +
                " / " + this.lastArrestDate + ", for: " + this.lastArrestReason);
    }
}
