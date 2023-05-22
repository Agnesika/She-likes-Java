package com.sda.she_likes_java.exceptions;

public class SecretLocker {
    private Secret mySecret;

    public SecretLocker(Secret mySecret) {
        this.mySecret = mySecret;
    }

    public Secret tellMeYourSecret () {
        System.out.println("I'm sharing with you this... ");
        return mySecret;
    }

    // HSM - hardware security module
    // send encrypted Secret to HSM
    // get decrypted value from HSM
    // celebrate secrets:)
    public Secret decryptMessageWithHSM() throws Exception {
        // connect to HSM
        boolean canConnectToHSM = false;
        if (canConnectToHSM) {
            // HSM decrypted message for me
            return mySecret;
        }
        throw new Exception("Couldn't connect to HSM");

    }
    @Override
    public String toString() {
        return "SecretLocker{" +
                "mySecret=" + mySecret +
                '}';
    }
}
