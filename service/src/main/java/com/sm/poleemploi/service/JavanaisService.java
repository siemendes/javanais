package com.sm.poleemploi.service;

import org.springframework.stereotype.Service;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("javaService")
public class JavanaisService {

    public String transformToJavanais(String str){

        if(str == null || str.isBlank()){
            return str;
        }

        StringBuilder strResultBuilder = new StringBuilder();
        int tailleChaine = str.length();

        String commenceParVoyellePattern = "[aeiouy].*";
        if(Pattern.matches(commenceParVoyellePattern, str.toLowerCase())){
            strResultBuilder.append("av");
        }

        String consonneSuivieParYoyellePattern = ".*[^aeyiou][aeyiou].*";
        if(tailleChaine>1){
            for(int i =0 ; i<tailleChaine -1 ;i++){

                strResultBuilder.append(str.substring(i,i+1));

                if(Pattern.matches(consonneSuivieParYoyellePattern, str.toLowerCase().substring(i,i+2))){
                    strResultBuilder.append("av");
                }
            }
            strResultBuilder.append(str.substring(tailleChaine-1,tailleChaine));
        }else{
            strResultBuilder.append(str) ;
        }
        return strResultBuilder.toString();
    }

    public String retourDepuisJavanais(String str){

        if(str == null || str.isBlank()){
            return str;
        }

        String contientAVEntreConsonneVoyelle = ".*[^aeyiou][a][v][aeyiou].*";

        if(str.length()>3){
            for(int i =0 ; i<str.length() - 3 ;i++){

                if(Pattern.matches(contientAVEntreConsonneVoyelle, str.toLowerCase().substring(i,i+4))){
                    str = str.substring(0,i+1) + str.substring(i+1).replaceFirst("av","");
                }
            }
        }

        String commenceParAVEtVoyelle = "[a][v][aeyiou].*";
        if(Pattern.matches(commenceParAVEtVoyelle, str.toLowerCase())){
            str = str.replaceFirst("av","");
        }

        return str;
    }
}
