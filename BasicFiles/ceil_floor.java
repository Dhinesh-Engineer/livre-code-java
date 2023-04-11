import java.util.Scanner;

public class ceil_floor {
    public static void main(String[] args) {    
int arr[] = {1,4,6,8,9};
int b=-1;
int j=0;
for(int i=0;i<=10;i++){
    if(i==0) {
        System.out.println("number " + i + "ceil " + arr[j] + "floor " + b);

    }
    if(i==1) {
        System.out.println("number " + i + "ceil " + arr[j] + "floor " + i);
        j++;
    }
    if(i>=2 && i<=3){
        System.out.println("number " + i + "ceil " + arr[j] + "floor " + 1);
        if(i==3){

        }

    }
    if(i==4 ){
        System.out.println("number " + i + "ceil " + arr[j] + "floor " + 4);

    }
    if(i==5 || i==6){
        System.out.println("number " + i + "ceil " + arr[j] + "floor " + arr[j]);
        j++;
    }
    if(i==7 || i==8){
       System.out.println("number " + i + "ceil " + 8 + "floor " + arr[j-1]);
       j++;

    }
    if(i==9 ){
        System.out.println("number " + i + "ceil " + arr[j-1] + "floor " + arr[j-1]);

    }
    if(i==10){
        System.out.println("number " + i + "ceil " + b + "floor " + arr[j-1]);

    }
}
    }
}
