package com.kapil.sealed;

public sealed interface Education permits OfflineEducation, OnlineEducation {
    void conductClass();
}
