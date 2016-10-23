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
package org.alamantechnologies.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Swalah Amani
 */
public class PropertiesCore 
{
    public static  Properties prop = new Properties();

    /**
     * public static boolean savePro(String key,String value,String fileName) throws FileNotFoundException, IOException
     * sets the value data for the key into the specified properties file (fileName) as FileOutputStream.
     * @param key
     * key of the Property entry.
     * @param value
     * value of the Property entry for a specified key.
     * @param fileName
     * specified the Properties file.
     * @return
     * returns boolean true if and only if the operation suceeded.
     * @throws java.io.FileNotFoundException
     * @throws IOException
     * throws FileNotFoundException and/or IOExceptiona to the calling class when an exception occurred.
     */
    public static boolean savePro(String key,String value,String fileName) throws FileNotFoundException, IOException
    {
        prop.setProperty(key, value);
        prop.store(new FileOutputStream(fileName), value);
        return true;
    }

    /**
     * public static String getPro(String key,String fileName) throws FileNotFoundException, IOException fetches
     * the value data of the given key written in the specified properties file as String in Java Language.
     * @param key
     * the key of the value needed.
     * @param fileName
     * the properties file.
     * @return
     * String value of the property entry for given key.
     * @throws FileNotFoundException
     * @throws IOException
     * throws FileNotFoundException and/or IOExceptiona to the calling class when an exception occurred.
     */
    public static String getPro(String key,String fileName) throws FileNotFoundException, IOException
    {
        String value;
        prop.load(new FileInputStream(fileName));
        value = prop.getProperty(key);
        return value;
    }
}
