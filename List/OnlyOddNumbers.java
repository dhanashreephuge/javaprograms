// check if list of integers contains only odd numbers in java
public static boolean OnlyOddNumbers(List<Integer> list) {
	for (int i : list) {
		if (i % 2 == 0)
			return false;
	}

	return true;
}
