package com.step.model;

public class Doctor extends Person {
    private String type; // dentist, oculist etc...
    private double salary;
    private Person lastClient;

    public Doctor(String type, double salary, String name, String surname, float height, String race, String birthDate) {
        super(name, surname, height, race, birthDate);
        this.type = type;
        this.salary = salary;
    }

    public void showClientProblems(Person client, String problem) {
        switch (this.type) {
            case "dentist": {
                showActionInfo(client, "has teeth problems");
                break;
            }
            case "oculist": {
                showActionInfo(client, "has eyes problems");
                break;
            }
            default: {
                showActionInfo(client, "has health problems");
                break;
            }
        }
    }

    public void healClient(Person client, String problem) {
        switch (this.type) {
            case "dentist": {
                showActionInfo(client, "teeth been healed");
                break;
            }
            case "oculist": {
                showActionInfo(client, "eyes been healed");
                break;
            }
            default: {
                showActionInfo(client, "health been treated good");
                break;
            }
        }
    }


    private void showActionInfo(Person client, String problem) {
        this.lastClient = client;

        System.out.println(lastClient.getName() + " " + lastClient.getSurname() + " " + problem + ".");
        System.out.println("Doctor " + this.getName() + " " + this.getSurname() + " (" + this.type + ").");
    }
}
