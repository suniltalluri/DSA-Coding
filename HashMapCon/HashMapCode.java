
import java.util.*;

public class HashMapCode {
    static class HashMap<k,v>{
        private class Node{
            k key;
            v value;
            public Node(k key, v value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> bucket[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i = 0; i < bucket.length; i++) {
                this.bucket[i] = new LinkedList<>();
                
            }
        }
        public void rehash(){
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N * 2];
            for (int i = 0; i < N*2; i++) {
                bucket[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> LL = bucket[i];
                for (int j = 0; j < LL.size(); j++) {
                    Node node  = LL.get(i);
                    put(node.key, node.value);
                }
            }
        }

        public int hashFunction(k key){
            int bi = key.hashCode();
           return  Math.abs(bi) % N;
        }
        public int searchInLL(k key, int bi){
            LinkedList<Node> LL = bucket[bi];
            for (int i = 0; i < LL.size(); i++) {
                if(LL.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public void put(k key, v value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){ // doesn't exist
                bucket[bi].add(new Node(key, value));
                n++;
            }else{// exist
                Node node = bucket[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;
            if(lambda > 2.0){
                // rehashing...
                rehash();
            }
        }
    }
}
