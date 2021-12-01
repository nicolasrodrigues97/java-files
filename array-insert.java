public static void arrayInsert (int a [ ]) {
    int L,C;
    int value;
    int end = a.length – 1;
    for (L = 1; L <= end; L++) {
        value = a [L];
        C = L – 1;
        while (C >= 0 && a[C] > value) {
            a[C+1] = a[C];
            C = C – 1;
        }
        a[C+1] = value;
    }
}
