/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.geolift.nlp;

import java.util.TreeSet;

/**
 *
 * @author ngonga
 */
public class Configuration {

    public String inputText;
    public String nerTool;
    public String similarity;
    public String coherence;
    public String apriori;
    public String algorithm;
    public String sparqlEndpoint;
    public String graph;
    public TreeSet<String> labelProperties;
    
    public Configuration()
    {
        
    }
}