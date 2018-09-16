package xiaohongshu;

import java.util.Scanner;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public static ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> st = new Stack<ListNode>();
        ListNode temp = head;
        for(int i = 0; i < k ; i++){
            if(head != null){
                st.push(head);
            }else{
                return temp;
            }
            head = head.next;
        }

        ListNode first = st.pop();
        ListNode res = first;
        for(int i = 0; i<k-1; i++){
            first.next = st.pop();
            first = first.next;
        }
        first.next = reverseKGroup(head,k);
        return res;
    }

    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);


            String str=scn.nextLine();
         int a[]=new int [str.length()];
         int count=0,j=0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)==' ')
            {
                String string=str.substring(count,i);
                a[j++]=Integer.parseInt(string);
                count=i+1;
            }
        }
        ListNode head=new ListNode(a[0]);
        head.next=null;
        ListNode r=head;
        for (int i = 1;i < a.length&&a[i]!=0; i++) {
            ListNode temp=new ListNode(a[i]);
            r.next=temp;
            r=temp;
        }

        int k=scn.nextInt();
//        System.out.println(k);
        ListNode newhead=reverseKGroup(head,k);

        ListNode ll=head;
        while(ll!=null){
            System.out.println(ll.val);
            ll=ll.next;
        }



    }

}

