package e8;

import d8.l;
import o6.j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f10672a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(l lVar, int i4) {
        int i8;
        int[] iArr = lVar.f10555i;
        int i9 = i4 + 1;
        int length = lVar.f10554h.length;
        j.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 < i9) {
                    i11 = i8 + 1;
                } else {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        if (i8 >= 0) {
            return i8;
        }
        return ~i8;
    }
}
