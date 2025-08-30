import java.util.LinkedList;
public class hashmap_class_framework {
    public static class hashmap<k,v>{
        public static final int default_cap=4;
        public static final float default_load=0.75f;
        private class Node{
            k key;
            v val;
            Node(k key,v val){
                this.key=key;
                this.val=val;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;

        private void initbuckets(int N){
            buckets=new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunc(k key){
            int hc=key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }
        private int searchInBucket(LinkedList<Node>ll,k key){
            for(int i=0;i< ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        public hashmap(){
            initbuckets(default_cap);
        }
        public int size(){
            return n;
        }
        public void put(k key,v val){
            int bi =hashFunc(key);
            LinkedList<Node> currbucket=buckets[bi];
            int ei=searchInBucket(currbucket,key);
            if(ei==-1){
                Node node=new Node(key, val);
                currbucket.add(node);
                n++;
            }
            else{
                Node currNode=currbucket.get(ei);
                currNode.val=val;
            }
        }
        public v get(k key){
            int bi =hashFunc(key);
            LinkedList<Node> currbucket=buckets[bi];
            int ei =searchInBucket(currbucket, key);
            if(ei!=-1){
                Node currNode=currbucket.get(ei);
                return currNode.val;
            }
            else{
                return null;
            }
        }
        public v remove(k key){
            int bi =hashFunc(key);
            LinkedList<Node> currbucket=buckets[bi];
            int ei=searchInBucket(currbucket,key);
            if(ei!=-1){
                Node currNode=currbucket.get(ei);
                v value=currNode.val;
                currbucket.remove(ei);
                n--;
                return value;
            }
            else{
                return null;
            }
        }
    }

    public static void main(String[] args) {
        hashmap<String,Integer> mp=new hashmap<>();
        System.out.println("testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        System.out.println(mp.size());
        mp.put("c", 5);
        System.out.println(mp.get("c"));
        System.out.println(mp.get("sudarshan"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("sudarshan"));
        System.out.println(mp.size());
    }
}
