package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count= " + bigData.count); //int 초기값 0
        System.out.println("bigData.data= " + bigData.data); //참조형 초기값 null

        //NullPointerException
        System.out.println("bigData.data.value= " + bigData.data.value);
    }
}
