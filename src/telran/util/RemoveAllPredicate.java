package src.telran.util;

import java.util.function.Predicate;

public class RemoveAllPredicate<T> implements Predicate<T> {
 List<T> others;
 
	public RemoveAllPredicate(List<T> others) {
	this.others = others;
}

	@Override
	public boolean test(T t) {
		return others.contains(t);
	}

}
