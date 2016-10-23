/* 
 * The MIT License
 *
 * Copyright 2016 AL-AMAN TECHNOLOGIES.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.alamantechnologies.builder;

import java.io.IOException;
import java.math.BigDecimal;
import org.alamantechnologies.core.PropertiesCore;

/**
 *
 * @author swala
 */
public class PropertiesBuilderImpl implements PropertiesBuilder
{
    private final String PROPERTIES_FILE;
    
    /**
     * public PropertiesBuilderImpl(String propertiesFile) initialize the PROPERTIES_FILE.
     * 
     * @param propertiesFile
     * propertiesFile - the location of the PropertiesFile should be provided as Java String variable.
     */
    public PropertiesBuilderImpl(String propertiesFile)
    {
        PROPERTIES_FILE = propertiesFile;
    }
    
    @Override
    public boolean setProBoolean(String key, boolean value) throws IOException
    {
        return PropertiesCore.savePro(key, String.valueOf(value), PROPERTIES_FILE);
    }

    @Override
    public boolean setProInt(String key, int value) throws IOException {
        return PropertiesCore.savePro(key, String.valueOf(value), PROPERTIES_FILE);
    }

    @Override
    public boolean setProFloat(String key, float value) throws IOException {
        return PropertiesCore.savePro(key, String.valueOf(value), PROPERTIES_FILE);
    }

    @Override
    public boolean setProDouble(String key, double value) throws IOException {
        return PropertiesCore.savePro(key, String.valueOf(value), PROPERTIES_FILE);
    }

    @Override
    public boolean setProBigDecimal(String key, BigDecimal value) throws IOException {
        return PropertiesCore.savePro(key, String.valueOf(value), PROPERTIES_FILE);
    }

    @Override
    public boolean setProChar(String key, char value) throws IOException {
        return PropertiesCore.savePro(key, String.valueOf(value), PROPERTIES_FILE);
    }

    @Override
    public boolean setProString(String key, String value) throws IOException {
        return PropertiesCore.savePro(key, value, PROPERTIES_FILE);
    }

    @Override
    public boolean getProBoolean(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getProInt(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getProFloat(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getProDouble(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BigDecimal getProBigDecimal(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char getProChar(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getProString(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
