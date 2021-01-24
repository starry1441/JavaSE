package sequence_table;

/**
 * Created with IntelliJ IDEA.
 * Description:实现顺序表代码
 * User: starry
 * Date: 2020 -12 -29
 * Time: 21:01
 */

class SeqList {
    private int[] elem;
    private int usedSize;

    public SeqList(){
        this.elem=new int[5];
    }

    public SeqList(int capacity){
        this.elem=new int[capacity];
    }

    //判断是否满
    public boolean isFull(){
        return this.usedSize == this.elem.length;
    }

    // 打印顺序表
    public void display() {
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //判断顺序表是否为满
        if(isFull()){
            System.out.println("该顺序表已满，不能插入数据");
            return;
        }
        //判断pos位置是否合法
        if(pos<0 || pos>usedSize){
            System.out.println("pos位置不合法");
            return;
        }
        //移动数据
        for(int i=usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i=0;i<usedSize;i++){
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i=0;i<usedSize;i++){
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0 || pos>usedSize){
            System.out.println("pos位置不合法");
            return -1;
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0 || pos>usedSize){
            System.out.println("pos位置不合法");
            return;
        }
        this.elem[pos]=value;
    }

    //删除第一次出现的关键字toRemove
    public void remove(int toRemove) {
        for(int i=0;i<usedSize;i++){
            if(this.elem[i]==toRemove){
                for(int j=i;j<usedSize-1;j++){
                    this.elem[i]=this.elem[i+1];
                }
            }
        }
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }

}

public class SequenceTable {

    public static void main(String[] args){
        SeqList seq = new SeqList();
        System.out.println("测试add方法");
        seq.add(0,3);
        seq.add(1,8);
        seq.add(2,4);
        seq.add(3,6);
        seq.display();
        System.out.println("=================");
        System.out.println("测试-->判定是否包含某个元素");
        System.out.println(seq.contains(8));
        System.out.println("=================");
        System.out.println("测试-->查找某个元素对应的位置");
        System.out.println(seq.search(8));
        System.out.println("=================");
        System.out.println("测试-->获取 pos 位置的元素");
        System.out.println(seq.getPos(2));
        System.out.println("=================");
        System.out.println("测试-->给 pos 位置的元素设为 value");
        seq.setPos(2,5);
        seq.display();
        System.out.println("=================");
        System.out.println("测试-->删除第一次出现的关键字toRemove");
        seq.remove(2);
        seq.display();
        System.out.println("=================");
        System.out.println("测试-->获取顺序表长度");
        System.out.println(seq.size());
        System.out.println("=================");
        System.out.println("测试-->清空顺序表");
        seq.clear();
        seq.display();
    }
}
