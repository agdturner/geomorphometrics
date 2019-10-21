/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.leeds.ccg.andyt.projects.geomorphometrics.core;

import java.io.IOException;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_Environment;

/**
 *
 * @author geoagdt
 */
public class Geomorphometrics_Environment {
    
    public final transient Generic_Environment env;
    
    public Geomorphometrics_Environment() throws IOException {
        this(new Generic_Environment());
    }
    
    public Geomorphometrics_Environment(Generic_Environment e) {
        env = e;
    }
    
    
}
