package edu.escuelaing.arem;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        try {
            URL mysite = new URL("http://ldbn.escuelaing.edu.co:80/");
            System.out.println("Protocol " +mysite.getProtocol());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
