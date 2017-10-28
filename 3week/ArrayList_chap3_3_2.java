package Coding_Interview;

public class ArrayList_chap3_3_2 {
    private int top1;
    private int top2;
    private int stackSize;
    private int min_value=0;
    private int[] itemArray;
    private int[] itemArray2;
    
   
    public ArrayList_chap3_3_2(int stackSize) {
        this.top1 = -1;
        this.top2 = -1;
        this.stackSize = stackSize;
        
        this.itemArray = new int[this.stackSize];
        this.itemArray2 = new int[this.stackSize];
    }    
    public void printStack() {
        if(isEmpty()){
            System.out.println("������ �������");
        }else{
            System.out.println("<<Stack>>");
            for(int i=top1; i>-1; i--){
                System.out.println(itemArray[i]+" "+min_value);
            }
            System.out.println();
        }
    }
    
    public boolean isEmpty() {
        return (top1==-1);
    }
    public boolean isFull() {
        return (top1==stackSize-1);
    }
    
    public void push(int item) {
        if(isFull()){
            System.out.println("������ ��������");
        }else{
            itemArray[++top1] = item;            
            if(top1==0 || item<min_value) {
            	itemArray2[++top2]=item;
            	min_value=item;
            }
            
        }
    }
    
    public void pop() {
        if(isEmpty()){
            System.out.println("������ �������");
            
        }else {
       	 	 
        	if(itemArray[top1]>min_value) {
        		top1--;
        	}else if(itemArray[top1] == min_value){
        		top1--;
        		min_value = itemArray2[--top2];
        	}
        }
    }
    

    public static void main(String[] args) {
        int stackSize = 5;
        ArrayList_chap3_3_2 S = new ArrayList_chap3_3_2(stackSize);
        
        S.push(4);
        S.printStack();

        S.push(3);       
        S.printStack();

        S.push(2);
        S.printStack();

        S.push(5);
        S.printStack();

        S.push(1);
        S.printStack();
        

        
        S.pop();
        S.printStack();
        S.pop();
        S.printStack();
        S.pop();
        S.printStack();
        S.pop();
        S.printStack();
    
        
    }
   }

 //O(1)�� �˰����� ����ð��� �ԷµǴ� �������� ũ�⿡ ������� �׻� ���� ��츦 �ǹ��Ѵ�.
//���� ���Ҵ� ���� ������ �ʴ´�. �� ���� ���Ұ� �߰��ǰų� �ּ� ���Ҹ� �������Ҷ��� �ٲ��.
//������ ���� ��忡�� �߰� �����͸� �����ϰ� �ִٸ� ���? � ������ �����͸� �����־�� ������ Ǯ�� ��������?
//������ ��尡 �κн����� �ּڰ��� �˰��ִٰ� ��������.



