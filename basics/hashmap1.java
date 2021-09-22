/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


class KeyValuePair<K, V>{
	K key;
	V value;
	KeyValuePair(K key, V value){
		this.key = key;
		this.value = value;
	}
	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object instanceof KeyValuePair) {
			KeyValuePair keyValuePair = (KeyValuePair) object;
			if(this.key.equals(keyValuePair.key)) {
				return true;
			}
			
		}
		return false;
	}
	@Override
	public String toString() {
		return "KeyValuePair [key=" + key + ", value=" + value + "]";
	}
	
}
class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
	
}
class LinkedList<T>{
	Node<T> start;
	Node<T> tail;
	int size;
	
	T getAtIndex(int index){
		int i = 0;
		Node<T> temp = start;
		while(i<index) {
			
			i++;
			temp = temp.next;
		}
		return temp.data;
	}
	int search(T data){
		int index = 0;
		Node<T> temp = start;
		while(temp!=null) {
			if(temp.data.equals(data)) {
				return index;
			}
			index++;
			temp = temp.next;
		}
		return -1;
	}
	int getSize() {
		return size;
	}
	T removeAt(int index){
		Node<T> temp = start;
		if(start == null) {
			return null;
		}
		if(index == 0 ) {
			T data = temp.data;
			start = start.next;
			temp = null;
			size--;
			return data;
		}
		int count = 0;
		Node<T> prev = start;
		while(count<index) {
			prev = temp;
			temp= temp.next;
			count++;
		}
		Node<T> temp2 = temp;
		T data = temp.data;
		prev.next = temp.next;
		temp2 = null;
		size--;
		return data;
		
		
	}
	void print() {
		
		Node<T> temp = start;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	void addInLast(T data) {
		Node<T> node = new Node<>(data);
		if(start == null) {
			
			tail = start = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
	size++;
	}
}
class HashMap<K, V>{
	LinkedList<KeyValuePair<K,V>> buckets[];
	static final int DEFAULT_CAPACITY = 10;
	int size ;
	HashMap(int capacity){
		buckets = new LinkedList[capacity];
	}
	HashMap(){
		this(DEFAULT_CAPACITY);
	}
	void print() {
		for(LinkedList<KeyValuePair<K,V>> bucket : buckets) {
			if(bucket!=null) {
				bucket.print();
			}
		}
	}
	V get (K key){
		int bucketIndex = hashFunction(key);
		LinkedList<KeyValuePair<K,V>> bucket = buckets[bucketIndex];
		KeyValuePair<K,V> keyValuePair = new KeyValuePair<>(key, null);
		if(bucket == null) {
			return null;
		}
		else {
			int index = bucket.search(keyValuePair);
			if(index==-1) {
				return null;
			}
			else {
				KeyValuePair keyValueTemp = bucket.getAtIndex(index);
				return (V) keyValueTemp.value;
			}
		}
	
	}
	private void rehashing() {
		double lambda = (size * 1.0)/buckets.length;
		System.out.println("Lambda is "+lambda);
		if(lambda>2) {
			System.out.println("ReHash Called... LAMBDA "+lambda);
			reHash();
		}
	}
	private void reHash() {
		LinkedList<KeyValuePair<K,V>> backupArr[] = buckets;
		buckets = new LinkedList[2 * backupArr.length];
		System.out.println("Now Bucket size is "+buckets.length);
		size = 0;
		int index = 0;
		for(LinkedList<KeyValuePair<K,V>> bucket : backupArr) {
			if(bucket!=null) {
				
				while(bucket.getSize()!=0) {
				KeyValuePair<K,V> pair = bucket.removeAt(0);
				
				put(pair.key, pair.value);
				}
			}
		}
		
	}
	V put(K key, V value) {
		int bucketIndex = hashFunction(key);
		LinkedList<KeyValuePair<K,V>> bucket = buckets[bucketIndex];
		KeyValuePair<K,V> keyValuePair = new KeyValuePair<>(key, value);
		System.out.println("Before ReHash "+size);
		if(bucket == null) {
			bucket = new LinkedList<KeyValuePair<K,V>>();
			bucket.addInLast(keyValuePair);
			buckets[bucketIndex] = bucket;
			size++;
		}
		else {
			int index = bucket.search(keyValuePair);
			if(index==-1) {
				bucket.addInLast(keyValuePair);
				size++;
			}
			else {
				KeyValuePair keyValueTemp = bucket.getAtIndex(index);
				keyValueTemp.value = value;
			}
		}
		rehashing();
		return value;
	}
	/* 
	 * Pass a Key and get the Bucket Index
	 */
	private int hashFunction(K key) {
		int hashCode = Math.abs(key.hashCode());
		int bucketIndex = hashCode % buckets.length;
		System.out.println("Bucket Index is "+bucketIndex);
		return bucketIndex ; 
	}
	
}
//class Customer{
//	
//}
public class hashmap1 {

	public static void main(String[] args) {
		//HashMap<Integer,Integer> map2 = new HashMap<>();
		HashMap<String,Integer> map = new HashMap<>(5);
		map.put("amit",2222);
		map.put("amit",2222);
		map.put("amit",5555);
		map.put("anil",2222);
		map.put("ram",2222);
		map.put("shyam",2222);
		map.put("tim",2222);
		map.put("kim",2222);
		map.put("vim",2222);
		map.put("sim",2222);
		map.put("rim",2222);
		map.put("zim",2222);
		map.put("sohan",2222);
		map.put("mohan",2222);
		map.put("rajesh",2222);
		map.put("ramesh",2222);
		map.put("mahesh",2222);
		map.put("nimesh",2222);
		
		System.out.println("NOW PRINT IS ...................");
		map.print();
		String name = "ramesh";
//		System.out.println(name.hashCode());
//		System.out.println(Math.abs(name.hashCode()) % 10);
		System.out.println(map.get(name));
//		 V remove(key) ,boolean containsKey(key)
		

	}

}



