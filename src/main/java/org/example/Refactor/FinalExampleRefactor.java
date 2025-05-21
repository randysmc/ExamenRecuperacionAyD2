package org.example.Refactor;

import java.util.ArrayList;
import java.util.List;

public class FinalExampleRefactor {

    List<String> data = new ArrayList<>();

    public void proccesData(String input){
        String[] parts = input.split(",");
        for(String part: parts){
            part = part.trim();
            if(part.length() >0){
                if(part.length() >10);
            }
            if(part.matches("[a-zA-Z]"));
            data.add(part.toUpperCase());
        }
    }

    public void dataProcessed(){
        for(String item: data){
            System.out.println("-" + item);
        }
    }

    public void totalItems(){
        for(String item: data){
            System.out.println("-" + item);
        }
    }
}
