import java.lang.*;

 class Subject {
     private String sbId;
          private String name;
     private int maxMark;
     private int markObt;
public Subject(String sbId,String name,int maxMark){
 this.sbId=sbId;
 this.name=name;
 this.maxMark=maxMark;
}
public String getSbId(){
    return  sbId;}
    public String getName(){
    return  name;}
    public int getMaxMark(){
    return  maxMark;}
    public int getMarkObt(){
    return  markObt;}
    public void setMaxMark(int mm){
         maxMark=mm;
    }
    public void setMarkObtaint(int mo){
        markObt=mo;
    }
    public String toString(){
        return "SubjectId :"+sbId+"\nName is"+name+"\nMark Obtained="+markObt+"\nmaximum mark="+maxMark;
    }
}



class ObjectArray{
    public static void main(String args[]){
     Subject s[]=new Subject[2];
     s[0]= new Subject("s12","Phy",100);
          s[1]= new Subject("s13","Che",100);

    }
}