package com.kapil.sealed;

public final class OnlineEducation implements Education {
    @Override
    public void conductClass() {
        System.out.println("Hello there from Online Education");
    }
}
