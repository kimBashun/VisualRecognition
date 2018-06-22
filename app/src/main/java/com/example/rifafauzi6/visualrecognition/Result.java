package com.example.rifafauzi6.visualrecognition;

/**
 * Created by rifafauzi6 on 05/04/18.
 */

public class Result {

    String name;
    Double score;

    public Result(){}

    public Result(String name, Double score){
        this.name=name;
        this.score=score;
    }

    public String getname(){
        return name;
    }

    public Double getscore(){
        return score;
    }

    public void setname(String name){

        this.name=name;
    }

    public void setscore(Double score){
        this.score=score;
    }

}
