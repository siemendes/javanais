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
        String commenceParVoyellePattern = "^[aeiouy]";
        if(Pattern.matches(commenceParVoyellePattern, str.toLowerCase())){
            strResultBuilder.append("av");
        }

        String consonneSuivieParYoyellePattern = "\\*[zrtpqsdfghjklmwxcvbn][aeiouy]\\*";
        if(str.length()>1){
            for(int i =0; i<str.length()-1;i++){

                strResultBuilder.append(str.subSequence(i,i));

                if(Pattern.matches(consonneSuivieParYoyellePattern, str.toLowerCase().subSequence(i,i+1).toString())){
                    strResultBuilder.append("av");
                }
            }

        }else{
            strResultBuilder.append(str) ;
        }

        return strResultBuilder.toString();
    }
}
