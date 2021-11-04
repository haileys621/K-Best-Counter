# K-Best-Counter

This project finds the k-best (i.e. largest) values in a set of data, given a sequence of values, one value at a time. We do not know how many elements there are in this sequence. In fact, there could be infinitely many. The KBestCounter class keeps track of the k-largest elements seen so far in the sequence of data, and has the following methods:

public KBestCounter(int k) - constructor: takes in an int k that indicates the amount of largest elements you want to return.

public void count(T x) - processes the next element in the set of data.

public List<T> kbest() - returns a sorted (smallest to largest) list of the k-largest elements. 
