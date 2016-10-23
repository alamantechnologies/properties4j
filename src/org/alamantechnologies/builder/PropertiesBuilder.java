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

/**
 *
 * @author swala
 */
public interface PropertiesBuilder {

    /**
     * public boolean setProperties(String key,boolean value)throws IOException sets the value for the key
     * in the specified 'Properties' file as boolean in the Java programming language.
     * 
     * @param key
     * key - the key value of the properties entry
     * @param value
     * value - the boolean value for the key.
     * @return
     * Returns 'true' if and only if the operation succeeded.
     * otherwise throws java.io.IOException.
     * @throws java.io.IOException
     */
    public boolean setProBoolean(String key,boolean value)throws IOException;
    
    /**
     * public boolean setProperties(String key,int value)throws IOException sets the value for the key
     * in the specified 'Properties' file as int in the Java programming language.
     * 
     * @param key
     * key - the key value of the properties entry
     * @param value
     * value - the int value for the key.
     * @return
     * Returns 'true' if and only if the operation succeeded.
     * otherwise throws java.io.IOException.
     * @throws java.io.IOException
     */
    public boolean setProInt(String key,int value)throws IOException;
    
    /**
     * public boolean setProperties(String key,float value)throws IOException sets the value for the key
     * in the specified 'Properties' file as float in the Java programming language.
     * 
     * @param key
     * key - the key value of the properties entry
     * @param value
     * value - the float value for the key.
     * @return
     * Returns 'true' if and only if the operation succeeded.
     * otherwise throws java.io.IOException.
     * @throws java.io.IOException
     */
    public boolean setProFloat(String key,float value)throws IOException;
    
    /**
     * public boolean setProperties(String key,double value)throws IOException sets the value for the key
     * in the specified 'Properties' file as double in the Java programming language.
     * 
     * @param key
     * key - the key value of the properties entry
     * @param value
     * value - the double value for the key.
     * @return
     * Returns 'true' if and only if the operation succeeded.
     * otherwise throws java.io.IOException.
     * @throws java.io.IOException
     */
    public boolean setProDouble(String key,double value)throws IOException;
    
    /**
     * public boolean setProperties(String key,BigDecimal value)throws IOException sets the value for the key
     * in the specified 'Properties' file as boolean in the Java programming language.
     * 
     * @param key
     * key - the key value of the properties entry
     * @param value
     * value - the BigDecimal value for the key.
     * @return
     * Returns 'true' if and only if the operation succeeded.
     * otherwise throws java.io.IOException.
     * @throws java.io.IOException
     */
    public boolean setProBigDecimal(String key,BigDecimal value)throws IOException;
    
    /**
     * public boolean setProperties(String key,char value)throws IOException sets the value for the key
     * in the specified 'Properties' file as char in the Java programming language.
     * 
     * @param key
     * key - the key value of the properties entry
     * @param value
     * value - the char value for the key.
     * @return
     * Returns 'true' if and only if the operation succeeded.
     * otherwise throws java.io.IOException.
     * @throws java.io.IOException
     */
    public boolean setProChar(String key,char value)throws IOException;
    
    /**
     * public boolean setProperties(String key,String value)throws IOException sets the value for the key
     * in the specified 'Properties' file as String in the Java programming language.
     * 
     * @param key
     * key - the key value of the properties entry
     * @param value
     * value - the String value for the key.
     * @return
     * Returns 'true' if and only if the operation succeeded.
     * otherwise throws java.io.IOException.
     * @throws java.io.IOException
     */
    public boolean setProString(String key,String value)throws IOException;

    
    
    /**
     * public boolean getProBoolean(String key) Retrieves the value of the provided key
     * in the specified 'Properties' file as boolean in the Java programming language.
     * @param key
     * key - the key value of the properties entry.
     * @return
     * the saved boolean value for the given 'key'. 
     */
    public boolean getProBoolean(String key);

    /**
     * public int getProInt(String key) Retrieves the value of the provided key
     * in the specified 'properties' file as int in the Java programming language.
     * @param key
     * key - the key value of the properties entry.
     * @return
     * the saved int value for the given 'key'.
     */
    public int getProInt(String key);

    /**
     * public float getProFloat(String key) Retrieves the value of the provided key
     * in the specified 'properties' file as float in the Java programming language.
     * @param key
     * key - the key value of the properties entry.
     * @return
     * the saved int value for the given 'key'.
     */
    public float getProFloat(String key);

    /**
     * public double getProDouble(String key) Retrieves the value of the provided key
     * in the specified 'properties' file as double in the Java programming language.
     * @param key
     * key - the key value of the properties entry.
     * @return
     * the saved double value for the given 'key'.
     */
    public double getProDouble(String key);

    /**
     * public BigDecimal getProBigDecimal(String key) Retrieves the value of the provided key
     * in the specified 'properties' file as BigDecimal in the Java programming language.
     * @param key
     * key - the key value of the properties entry.
     * @return
     * the saved BigDecimal value for the given 'key'.
     */
    public BigDecimal getProBigDecimal(String key);

    /**
     * public char getProChar(String key) Retrieves the value of the provided key
     * in the specified 'properties' file as char in the Java programming language.
     * @param key
     * key - the key value of the properties entry.
     * @return
     * the saved char value for the given 'key'.
     */
    public char getProChar(String key);

    /**
     * public String getProString(String key) Retrieves the value of the provided key
     * in the specified 'properties' file as String in the Java porgramming language.
     * @param key
     * key - the key value of the properties entry.
     * @return
     * the saved String value for the given 'key'.
     */
    public String getProString(String key);
}
