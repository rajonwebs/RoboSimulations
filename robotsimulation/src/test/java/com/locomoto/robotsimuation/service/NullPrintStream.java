package com.locomoto.robotsimuation.service;

import com.google.common.io.NullOutputStream;

import java.io.PrintStream;

/**
 * User: rajesh
 */
public class NullPrintStream extends PrintStream{

    public NullPrintStream() {
        super(new NullOutputStream());
    }
}
