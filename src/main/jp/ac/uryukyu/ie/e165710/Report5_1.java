package jp.ac.uryukyu.ie.e165710;

public class Report5_1 {
    public static void main(String[] args) {
        try {
            String str =　3．14;
            double value = Double.parseDouble(str);
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました");
            e.printStackTrace();
            return;
        }
    }
}
