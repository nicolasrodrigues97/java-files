public static void bubblesort (int a [ ]) {
  int end = a.length - 2;
  int pos = 0;
  boolean swap = true;
  int value;
  int i;
  while (swap == true) {
    swap = false;
    for (i = 0; i <= end; i++) {
      if (a[i] > a[i+1]) {
        value = a[i]; a[i] = a[i+1]; a[i+1] = value;
        pos = i; swap = true;
      }
    }
    end = pos-1;
  }
}
