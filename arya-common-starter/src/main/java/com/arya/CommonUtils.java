package com.arya;


import java.io.*;
import java.util.*;

public class CommonUtils {

    public static void main(String[] args) {

        CommonUtils commonUtils=new CommonUtils();
        Set<String> finalList=new HashSet<>();
        Map<String, List<String>> stringListMap = commonUtils.readAllTestFileOnPath("/Users/apple/IdeaProjects/Arya-starterv2/target/pmd/rulesets");

        stringListMap.forEach((k,v)->{
            String fileName="<rule ref=\"category/java/"+k.substring(4)+"/";
            v=v.stream().filter(i->i.contains("<rule name="))
                    .map(String::trim)
                    .map(i->i.replace("<rule name=\"",fileName))
                    .map(i->i+" />").toList();

            finalList.addAll(v);


        });

        commonUtils.writeToFile("target/a.txt",finalList.stream().sorted().toList());

    }

    public Map<String, List<String>> readAllTestFileOnPath(String dirPath){
        Map<String,List<String>> contents=new HashMap<>();
        for(File file:getAllFileOnPath(dirPath)){
            List<String> content = readFile(file);
            contents.put(file.getName(),content);
        }
        return contents;
    }
    public List<File> getAllFileOnPath(String dirPath){
        File fl=new File(dirPath);
        if(fl.isDirectory())
            return Arrays.asList(fl.listFiles());
        else
            return null;
    }

    public List<String> readFile(File file){
        try(FileReader reader=new FileReader(file)){

            try(BufferedReader bf=new BufferedReader(reader)){

                return bf.lines().toList();
            }catch (Exception e){
                e.printStackTrace();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void writeToFile(String fileName,List<String> content){
        try(FileWriter fileWriter=new FileWriter(fileName)){
            try(BufferedWriter bw=new BufferedWriter(fileWriter)){

                for(String line:content){

                    bw.write(line);
                    bw.newLine();
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
