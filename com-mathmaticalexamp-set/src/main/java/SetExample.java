package example;

public class SetExample {
    private int size = 0;
    private int elements[] = new int[5];
    private int[] arrayelements= new int[] {1,2,3,4,5};

    boolean isEmpty() {
        return size() == 0;
    }

    void add(int element) {
        if(!contains(element)) {
            elements[size++] = element;
        }
    }

    int size() {
        return size;
    }

    boolean contains(int element) {
        boolean status = false;
        for (int existingElement : elements) {
            if(existingElement == element) {
                status = true;
                break;
            }
        }

        return status;
    }

    public boolean delete() {
    	boolean status=false;
    	for(int i=0;i<arrayelements.length;i++) {
    		if(arrayelements[i]==5) {
    			for (int j=i;j<arrayelements.length-1;j++) {
    				arrayelements[j]=arrayelements[j+1];
    			}
    			status=true;
    			break;
    		}
    	}
		return status;
        
    }
     
    public boolean indexOf() {
    	boolean status=false;
    	for(int i=0;i<arrayelements.length;i++) {
    		if(arrayelements[i]==5) {
    			status=true;
    			break;
    		}
    	}
		return status;
        
    }
    
    void display() {
        throw new RuntimeException("Yet to add test cases");
    }

}
