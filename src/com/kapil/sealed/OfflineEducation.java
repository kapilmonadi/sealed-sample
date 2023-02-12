package com.kapil.sealed;

public final class OfflineEducation implements Education {
    @Override
    public void conductClass() {
        System.out.println("Hello there from Offline Education");
    }
}
