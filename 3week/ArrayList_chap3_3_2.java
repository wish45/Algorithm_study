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
            System.out.println("스택이 비어있음");
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
            System.out.println("스택이 꽉차있음");
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
            System.out.println("스택이 비어있음");
            
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

 //O(1)은 알고리즘의 실행시간이 입력되는 데이터의 크기에 상관없이 항상 같은 경우를 의미한다.
//최초 원소는 자주 변하지 않는다. 더 작은 원소가 추가되거나 최소 원소를 빼내야할때만 바뀐다.
//각각의 스택 노드에서 추가 데이터를 저장하고 있다면 어떨까? 어떤 종류의 데이터를 갖고있어야 문제를 풀기 쉬워지나?
//각각의 노드가 부분스택의 최솟값을 알고있다고 가정하자.



