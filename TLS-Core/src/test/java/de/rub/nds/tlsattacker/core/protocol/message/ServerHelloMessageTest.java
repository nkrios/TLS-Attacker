/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2017 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.core.protocol.message;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pierre Tilhaus <pierre.tilhaus@rub.de>
 */
public class ServerHelloMessageTest {

    ServerHelloMessage message;

    @Before
    public void setUp() {
        message = new ServerHelloMessage();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSelectedCipherSuite method, of class ServerHelloMessage.
     */
    @Test
    public void testGetSelectedCipherSuite() {
    }

    /**
     * Test of setSelectedCipherSuite method, of class ServerHelloMessage.
     */
    @Test
    public void testSetSelectedCipherSuite_ModifiableByteArray() {
    }

    /**
     * Test of setSelectedCipherSuite method, of class ServerHelloMessage.
     */
    @Test
    public void testSetSelectedCipherSuite_byteArr() {
    }

    /**
     * Test of getSelectedCompressionMethod method, of class ServerHelloMessage.
     */
    @Test
    public void testGetSelectedCompressionMethod() {
    }

    /**
     * Test of setSelectedCompressionMethod method, of class ServerHelloMessage.
     */
    @Test
    public void testSetSelectedCompressionMethod_ModifiableByte() {
    }

    /**
     * Test of setSelectedCompressionMethod method, of class ServerHelloMessage.
     */
    @Test
    public void testSetSelectedCompressionMethod_byte() {
    }

    /**
     * Test of toString method, of class ServerHelloMessage.
     */
    @Test
    public void testToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nServerHelloMessage:");
        sb.append("\n  Protocol Version: ").append("null");
        sb.append("\n  Server Unix Time: ").append("null");
        sb.append("\n  Server Random: ").append("null");
        sb.append("\n  Session ID: ").append("null");
        sb.append("\n  Selected Cipher Suite: ").append("null");
        sb.append("\n  Selected Compression Method: ").append("null");
        sb.append("\n  Extensions: ").append("null");

        assertEquals(message.toString(), sb.toString());
    }

    /**
     * Test of getHandler method, of class ServerHelloMessage.
     */
    @Test
    public void testGetHandler() {
    }

}
