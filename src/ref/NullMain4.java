package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //참조값을 주면 해결!
        System.out.println("bigData.count= " + bigData.count); //int 초기값 0
        System.out.println("bigData.data= " + bigData.data); //참조형 초기값 null

        //NullPointerException
        System.out.println("bigData.data.value= " + bigData.data.value);
    }
}
