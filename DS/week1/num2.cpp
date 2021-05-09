Position BinarySearch( List L, ElementType X ) {
    int i = 1, j = L->Last;
    while(i <= j) {
        long long  mid = i + (j - i) / 2;
        if(L->Data[mid] == X) {
            return mid;
        }else if(L->Data[mid] < X) {
            i = mid + 1;
        }else {
            j = mid - 1;
        }
    }
    return NotFound;
}
