package com.enigma.service;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PersonGenerator {
    private List<String>datanama=new ArrayList<>();
    private List<Integer>dataumur=new ArrayList<>();
    private List<String>datagender=new ArrayList<>();
    private String path;

    public PersonGenerator(String path) { this.path=path; }
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
                dataumur.add(Integer.parseInt(getAge));
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
        Iterator<Integer>stringIteratorumur= dataumur.iterator();
        Iterator<String>stringIteratorgender= datagender.iterator();
        while (stringIterator.hasNext() && stringIteratorumur.hasNext() && stringIteratorgender.hasNext()){
            String data = stringIterator.next();
            Integer data2 =stringIteratorumur.next();
            String data3 =stringIteratorgender.next();
            System.out.print(data);
            System.out.print(data2);
            System.out.print(data3);
        }
    }
    public void getAverageAge(){
        Integer total=0;
        for (Integer integer : dataumur) {
            total += integer;
        }
        int average=total/dataumur.size();
        System.out.println("Rata Rata Umur :"+average);
    }
    public void getFriend(){
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
            int Male=0;
            int Female=0;
            for (String str: stringList){
                String getGender=str.substring(48,49);
                if (getGender.equals("L")){
                    Male++;
                }else {Female++;}
            }
            System.out.println("Jumlah Teman Pria   :"+Male);
            System.out.println("Jumlah Teman Wanita :"+Female);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public void getTermudaTertua(){
        Object min=Collections.min(dataumur);
        System.out.println("Umur Termuda :"+min);
        Object max=Collections.max(dataumur);
        System.out.println("Umur Tertua  :"+max);
    }
}

