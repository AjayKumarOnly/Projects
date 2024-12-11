import java.util.ArrayList;
import java.util.Scanner;

class allMethod{
    private
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner =new Scanner(System.in);
    public void addTask(){
        String inputTask = scanner.next();
        list.add(inputTask);
        System.out.println("Task added Successfully");
    }
    public void deleteTask(){
        System.out.println("Select the Task to Delete..");
        displayTask();
        int delete = scanner.nextInt();
        if(delete <= 0 && delete < list.size()){
            list.remove(delete);
            System.out.println("Task Deleted Successfully");
        }
    }
    public void displayTask(){
        if(list.isEmpty()){
            System.out.println("No Task Present inside it ...");
        }else {
            for(int i = 0;i<list.size();i++){
                System.out.println(i + ". " + list.get(i));
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
        allMethod m = new allMethod();
        boolean running = true;
        while(running){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n 1 -> Add the Task");
        System.out.println("\n 2 -> Delete the Task");
        System.out.println("\n 3 -> Display the Task");
        System.out.println("\n 4 ->Quit");

        int getNum = scanner.nextInt();
        switch (getNum){
            case 1:
                    m.addTask();
                    break;
            case 2:
                    m.deleteTask();
                    break;
            case 3:
                    m.displayTask();
                    break;
            case 4:
                    running = false;
                    break;
            default:
                System.out.println("Invalid Number");
        }
    }

}}