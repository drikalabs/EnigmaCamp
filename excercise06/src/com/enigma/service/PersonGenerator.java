package com.enigma.service;

import java.io.*;
import java.util.*;

public class PersonGenerator {
    private List<String>datanama=new ArrayList<>();
    private List<String>dataumur=new ArrayList<>();
    private List<String>datagender=new ArrayList<>();
    private String path;

    public PersonGenerator(String path) {
        this.path=path;
    }
    public void Readfile(){
        File file=new File(this.path);
        try {
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            List<String> stringList=new ArrayList<>();
            while (true){
                String txt=bufferedReader.readLine();
                if (txt==null){
                    break;
                }
                stringList.add(txt);
            }
            for (String str: stringList){
                String getName=str.substring(7,30);
                datanama.add(getName.trim());
                String getAge =str.substring(38,40);
                dataumur.add(getAge.trim());
                String getGender=str.substring(48,49);
                datagender.add(getGender.trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void print() {
        Iterator<String>stringIterator= datanama.iterator();
        Iterator<String>stringIteratorumur= dataumur.iterator();
        Iterator<String>stringIteratorgender= datagender.iterator();
        while (stringIterator.hasNext() && stringIteratorumur.hasNext() && stringIteratorgender.hasNext()){
            String data = stringIterator.next();
            String data2 =stringIteratorumur.next();
            String data3 =stringIteratorgender.next();
            System.out.print(data);
            System.out.print(Integer.parseInt(data2));
            System.out.print(data3);
            }
    }
}
