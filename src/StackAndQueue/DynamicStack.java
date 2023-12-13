package StackAndQueue;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
       if(this.isFull()){
           //double the array and copy to the new array
            int[] temp = new int[data.length * 2];

            // copy all data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
       }

       return super.push(item);
    }
}
