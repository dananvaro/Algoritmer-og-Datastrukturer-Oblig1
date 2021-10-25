package no.oslomet.cs.algdat.Oblig1;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {



    @org.junit.jupiter.api.Test
    void maks() {
        int[] beste = {1,2,3,4,5,6,7,8,9};
        assertEquals(9, Oblig1.maks(beste), "Implementer maks og denne testen");
    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {
        int[] gjennomsnitt = {9,8,7,6,5,4,3,2,1};
        int[] random = Oblig1Test.randPerm(10);
        assertEquals(8, Oblig1.ombyttinger(gjennomsnitt), "Implementer ombyttinger og denne testen");
    }


    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        int[] a= {3,3,4,5,5,6,7,7,7,8,9};
        assertEquals(7, Oblig1.antallUlikeSortert(a), "Implementer antallUlikeSortert og denne testen");
    }


    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        int[] b = {1,2,3,4,5};
        assertEquals(5, Oblig1.antallUlikeSortert(b), "Implementer antallUlikeUsortert og denne testen");
    }



    @org.junit.jupiter.api.Test
    void delsortering() {
        int[] forventer = {1,3,5,2,4};
        int[] b = {1,2,3,4,5};
        Oblig1.delsortering(b);
        assertEquals(Arrays.toString(forventer), Arrays.toString(b) , "Implementer delsortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {
        char [] a = {'A','B','C','D','E','F','G','H','I','J'};
        Oblig1.rotasjon(a);
        char[] forventet = {'J','A','B','C','D','E','F','G','H','I'};
        assertEquals(Arrays.toString(forventet), Arrays.toString(a), "Implementer rotasjon og denne testen");
    }

    @org.junit.jupiter.api.Test
    void flett() {
        String a = "ACEG";
        String b = "BDFH";
        String c = "";
        assertEquals("ABCDEFGH", Oblig1.flett(a,b), "Implementer flett og denne testen");
        assertEquals("ABCDEFGH", Oblig1.flett(a,b,c), "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        int[] a = {6,10,16,11,7,12,3,9,8,5};
        int[] forventet = {6,9,0,4,8,7,1,3,5,2};

        assertEquals( Arrays.toString(forventet), Arrays.toString(Oblig1.indekssortering(a)), "Implementer indekssortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        int[] a = {5,1,6,9,2,-1};
        int[] forventet = {5,1,4};
        assertEquals(Arrays.toString(forventet), Arrays.toString(Oblig1.tredjeMin(a)), "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, true, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        String a = "ACCA";
        String b = "CAAC";
        assertEquals(true, Oblig1.inneholdt(a,b), "Implementer inneholdt og denne testen");
    }
}