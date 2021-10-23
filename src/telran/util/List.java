package telran.util;

public interface List<T> {
	/**
	 * adds a given element at end of list
	 * @param element
	 */
	void add(T element);
	
	/**
	 * adds a given element at a given index
	 * @param index
	 * @param element
	 * @return true if the index is correct, false if index incorrect
	 * (index < 0 || index > size)
	 */
	boolean add(int index, T element);
	
	/**
	 * 
	 * @return amount of all elements in list
	 */
	int size();
	
	/**
	 * 
	 * @param index
	 * @return reference to element at a given index or null if the index is incorrect
	 * (index < 0 || index >= size)
	 */
	T get(int index);
	
	/**
	 * removes element from a list at a given index
	 * @param index
	 * @return reference to being removed element or null if the index is incorrect
	 * (index < 0 || index >= size)
	 */
	T remove(int index);
}
