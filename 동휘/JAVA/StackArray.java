 
interface IStack{
	boolean isEmpty();
	boolean isFull();
	void push(char item);
	int pop();
	int peek();
	void clear();
}

	public class StackArray implements IStack{
		private int top;
		private int stackSize;
		private char[] stackArr;
		
		public StackArray(int stackSize) {
			top = -1; //스택 포인터 초기화
			this.stackSize =  stackSize;
			stackArr = new char[this.stackSize];
		}
		
		@Override
		public boolean isEmpty() {
			return (top==-1);
		}
		@Override
		public boolean isFull() {
			return (top==this.stackSize-1);
		}
		
		public void push(char item) {
			if(isFull()) {
				System.out.println("Stack is full!");
			}else {
				stackArr[++top] = item;
				System.out.println("Inserted Item : "+item);
			}
		}
		@Override
		public int pop() {
	        if(isEmpty()) {
	            System.out.println("Deleting fail! Stack is empty!");
	            return 0;
	        } else { 
	            System.out.println("Deleted Item : " + stackArr[top]);
	            return stackArr[--top];
	        }                
	    }
	    
	    // 스택의 최상위(마지막) 데이터 추출
	    public int peek() {
	        if(isEmpty()) {
	            System.out.println("Peeking fail! Stack is empty!");
	            return 0;
	        } else { 
	            System.out.println("Peeked Item : " + stackArr[top]);
	            return stackArr[top];
	        }
	    }
	    
	    // 스택 초기화
	    public void clear() {
	        if(isEmpty()) {
	            System.out.println("Stack is already empty!");
	        } else {
	            top = -1;    // 스택 포인터 초기화
	            stackArr = new char[this.stackSize];    // 새로운 스택 배열 생성
	            System.out.println("Stack is clear!");
	        }
	    }
	    public void printStack() {
	        if(isEmpty()) {
	            System.out.println("Stack is empty!");
	        } else {
	            System.out.print("Stack elements : ");
	            for(int i=0; i<=top; i++) {
	                System.out.print(stackArr[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	
	public static void main(String[] args) {
		 int stackSize = 5;
		 StackArray arrStack = new StackArray(stackSize);
		 
	        
	        arrStack.push('A');
	        arrStack.printStack();
	        
	        arrStack.push('B');
	        arrStack.printStack();
	        
	        arrStack.push('C');
	        arrStack.printStack();
	        
	        arrStack.peek();
	        arrStack.printStack();
	        
	        arrStack.pop();
	        arrStack.printStack();
	        
	        arrStack.pop();
	        arrStack.printStack();
	        
	        arrStack.peek();
	        arrStack.printStack();
	        
	        arrStack.clear();
	        arrStack.printStack();
	        
	        arrStack.isEmpty();
	}
}

