package jenkins.morse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class Traduction {
	
	public static void main(String[] args) {
		while(true){
			String x, mode;
			System.out.print("\ntoMorse = 1  or toSpeech = 2\n->");
	        mode = lireString();
	        System.out.print("\nEntrer le mot à traduire\n->" );
	        
	        x = lireString();
	        x = x.toUpperCase();
			System.out.println(translate(x, mode));
		}
	}
    public static String translate(String x, String mode) {
    	String toReturn = "";
        String codeMorse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                         ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                         "...","-","..-","...-",".--","-..-","-.--","--..",
                         ".-.-.-","-----",".----","..---","...--","....-",".....",
                         "-...","--...","---..","----"};
        String corespondance[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",".","0","1","2","3","4","5","6","7","8","9"};

        
        if("1".equals(mode)) {
        	for (int i = 0; i < x.length();i++) {
                for (int t = 0; t < corespondance.length;t++) {
    	            if (x.charAt(i) == corespondance[t].charAt(0)) {
    	            	toReturn += (codeMorse[t] +" ");
    	            	break;
    	            }
                }
            }
        } else if ("2".equals(mode)){
        	String phraseTransforme = "";
        	String phrase[] = x.split(" ");
        	for(String lettre: phrase){
        		switch (lettre) {
	    			case ".-" : phraseTransforme += "A" ; break ;
	    			case "-..." : phraseTransforme += "B"; break ;
	    			case "-.-." : phraseTransforme += "C" ; break ;
	    			case "-.." : phraseTransforme += "D"; break ;
	    			case "." : phraseTransforme +=  "E"; break ;
	    			case "..-." : phraseTransforme += "F" ; break ;
	    			case "--." : phraseTransforme += "G" ; break ;
	    			case "...." : phraseTransforme += "H" ; break ;
	    			case ".." : phraseTransforme += "I"; break ;
	    			case ".---" : phraseTransforme += "J"; break ;
	    			case "-.-" : phraseTransforme += "K"; break ;
	    			case ".-.." : phraseTransforme += "L" ; break ;
	    			case "--" : phraseTransforme += "M"; break ;
	    			case "-." : phraseTransforme += "N"; break ;
	    			case "---" : phraseTransforme += "O" ; break ;
	    			case ".--." : phraseTransforme += "P"; break ;
	    			case "--.-" : phraseTransforme += "Q"; break ;
	    			case ".-." : phraseTransforme += "R"; break ;
	    			case "..." : phraseTransforme +="S"; break ;
	    			case "-" : phraseTransforme += "T" ; break ;
	    			case "..-" : phraseTransforme += "U" ; break ;
	    			case "...-" : phraseTransforme += "V"; break ;
	    			case ".--" : phraseTransforme += "W"; break ;
	    			case "-..-" : phraseTransforme +="X"; break ;
	    			case "-.--" : phraseTransforme += "Y"; break ;
	    			case "--.." : phraseTransforme += "Z"; break ;
	    			case ".----" : phraseTransforme += "1" ; break ;
	    			case "..---" : phraseTransforme += "2"; break ;
	    			case "...--" : phraseTransforme += "3"; break ;
	    			case "....-" : phraseTransforme += "4"; break ;
	    			case "....." : phraseTransforme += "5"; break ;
	    			case "-...." : phraseTransforme += "6"; break ;
	    			case "--..." : phraseTransforme += "7"; break ;
	    			case "---.." : phraseTransforme += "8"; break ;
	    			case "----." : phraseTransforme += "9"; break ;
	    			case "-----" : phraseTransforme += "0"; break ;
	    			case "  " : phraseTransforme += " " ; break;
    			
    				}
    			
    			
    			}
        	toReturn = phraseTransforme;
        	}
		return toReturn;
    			
    			
        }

 
    
    public static String lireString () {
       
    	 String ligne_lue = null ;
    	 try { 
    		  InputStreamReader lecteur = new InputStreamReader (System.in) ;
    		  BufferedReader entree = new BufferedReader (lecteur) ;
    		  ligne_lue = entree.readLine() ;
    	  }
    	  catch (IOException err) { 
        	System.exit(0) ;
    	  }
    	  return ligne_lue ;
      }
      
    }

