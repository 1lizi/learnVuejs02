package method;

public class Demo04 {
    public static void main(String args[]){
        //调用可变参数的方法
    printMax(34,2,4,5,6,45.5);
    printMax(new double[]{1,2,3});
}
public static void  printMax(double... numbers){
    if (numbers.length == 0){
        System.out.println("No argument passed ");
        return;
    }
    double result = numbers[0];

     //排序！
    for (int i = 1; i < numbers.length; i++){
        if (numbers[i] > result ){
            result = numbers[i];
        }
    }
    System.out.println("The max value is " + result);
}
}
