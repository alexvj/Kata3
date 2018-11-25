/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author Álex
 */
public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("protonmail.com");
        histogram.increment("protonmail.com");
        histogram.increment("protonmail.com");
        histogram.increment("gmail.es");
        histogram.increment("yahoo.es");
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAMA", histogram);
        histo.execute();
    }
    
}
