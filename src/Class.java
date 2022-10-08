public class Class {
    int number;
    String word;
    int [] array;

    public Class(){
    }
    public Class(int number,String word,int[]array){
        this.number=number;
        this.word=word;
        this.array=array;

    }
     int getNumber(){
        return number;
     }
     String getWord(){
        return word;
     }
     int[] getArray(){
        return array;
     }

     void setNumber(int number) {
        this.number = number;
    }

     void setWord(String word) {
        this.word = word;
    }

      void setMassiv(int[] array) {
        this.array = array;
    }
}
