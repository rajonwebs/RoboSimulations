package com.locomoto.robotsimulation.impl;

import static org.apache.commons.io.IOUtils.closeQuietly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.locomoto.robotsimulation.service.CommanderInf;

/**
 * Implementation of {@link CommanderInf} which reads the commands from  {@link InputStream}
 * of input.
 * <p/>
 * User: rajesh
 */
public class InputStreamCommander implements CommanderInf {

    private BufferedReader reader;

    /**
     * Input stream to read command from
     * @param inputStream the input stream
     */
    public InputStreamCommander(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String getNextCommand()
            throws IOException {
        return reader.readLine();
    }
    
    public void cleanup() {
        closeQuietly(reader);
    }
}
