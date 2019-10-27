package com.saepio.app2;

public class Word {
    private String meaning;
    private String path;
    private String langName;

    public Word(String M, String P, String LM){
        meaning = M;
        path = P;
        langName = LM;
    }

    public String getMeaning(){
        return meaning;
    }

    public String getLangName() {
        return langName;
    }

    public String getPath() {
        return path;
    }
}
