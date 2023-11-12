/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author User
 */
@SuppressWarnings("StaticNonFinalUsedInInitialization")
public class GameUtil {
    
    static List<String> sentences;
    static String sentence;
    public static StringBuilder sentenceToShow;
    public static int numOfTryings;
    
    public static void chooseSentence(){
        Random rand = new Random();
        int index=rand.nextInt(sentences.size());
        sentence=sentences.get(index);
        
    }
    public static void initSentenceToShow(){
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' ')
                sentenceToShow.append(' ');
            else
                sentenceToShow.append('-');
        }
    }
    
    public static void updateSentenceToShow(char letter){
     for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==letter)
                sentenceToShow.setCharAt(i, letter);
         }   
    }
      
    public static void increaseNumOfTryings(){
        numOfTryings++;
    }
    
    public static boolean checkWinning(){
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)=='-')
                return false;
        }
        return true;
    }
    
    static{
        sentences=new ArrayList();
        sentences.add("hello");
        sentences.add("Elisheva");
        sentences.add("Zimerman");
        sentences.add("Good Day");
        chooseSentence();
        initSentenceToShow();
        
        
    }
}
