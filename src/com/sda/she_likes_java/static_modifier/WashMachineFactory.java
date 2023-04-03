package com.sda.she_likes_java.static_modifier;

public class WashMachineFactory {
    public static void main(String[] args) {
        System.out.println("Current number os washmachines is: " +WashMachine.getNumberOfCreatedMachines());
        WashMachine samsung = new WashMachine("Samsung", "1x2");
        System.out.println("Current population number is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung serial number is: " + samsung.getSerialNumber());
        samsung.setSerialNumber(5);
        System.out.println("Serial Nr now is " + samsung.getSerialNumber());
// do not use instance references for to access static members (fields/methods)
//        samsung.setNumberOfCreatedMachines(1000);

        samsung.increaseSerialNumber();
        System.out.println("Serial number now is " + samsung.getSerialNumber());

        WashMachine samsung2 = new WashMachine("Samsung", "1x2");
        System.out.println("Current population number is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung2 serial number is: " + samsung2.getSerialNumber());
        samsung.increaseSerialNumber();
        System.out.println("Serial number now is " + samsung.getSerialNumber());

        for (int i = 0; i < 10; i++) {
            makeSomeWashMachines();
        }
        System.out.println("Hey we've made lots of wash machines: " + WashMachine.getNumberOfCreatedMachines());
    }
    // some generic way how to obtain number of produced washmachines

    public static void makeSomeWashMachines() {
        new WashMachine("LG", "11");
        new WashMachine("LG", "111");
        new WashMachine("LG", "1111");
        new WashMachine("LG", "11111");
        new WashMachine("LG", "111111");
        new WashMachine("LG", "1111111");

    }
}
