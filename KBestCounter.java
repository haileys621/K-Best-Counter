import java.util.*;
public class KBestCounter<T extends Comparable<? super T>> implements KBest<T>{
    PriorityQueue<T> queue;
    int n;
    
    public KBestCounter(int k){
        queue = new PriorityQueue<T>(k);
        n = k;
    }
    
    public void count(T x){
        if(queue.size() < n){
            queue.add(x);
        }
        else if(queue.size() == n && (queue.peek()).compareTo(x) < 0){
            queue.remove();
            queue.add(x);
        }
        
    }
	public List<T> kbest(){
        List<T> largestEls = new ArrayList<T>();
        int queueSize = queue.size();
        for(int i = 0; i < queueSize; i++){
            largestEls.add(queue.remove());
        }
        
        for(int i = 0; i < queueSize; i++){
            queue.add(largestEls.get(i));
        }
        return largestEls;
    }
    
}