package aiqiyi2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Node implements Comparable<Node>{
    int x;
    int y;
    public Node(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Node node) {
        if(this.y>node.y)
            return 1;
        else if(this.y<node.y)
            return -1;
        else
            return 0;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            int n=scanner.nextInt();
            ArrayList<Node> list=new ArrayList<Node>();
            scanner.nextLine();
            for(int i=0;i<n;i++){
                String s=scanner.nextLine();
                String[] arr=s.split(" ");
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[1]);
                int tmp ;
                if(num1 > num2){
                    tmp = num1;
                    num1 = num2;
                    num2 = tmp;
                }
                Node node=new Node(num1,num2);
                list.add(node);
            }
            Collections.sort(list);
            ArrayList<Node> result=new ArrayList<Node>();
            Node node=list.get(0);
            int y=node.y;
            result.add(node);
            for(int i=1;i<n;i++){
                Node temp=list.get(i);
                if(temp.x>=y){
                    result.add(temp);
                    y=temp.y;
                }
            }
            System.out.println(result.size());
        }
        scanner.close();
    }
}