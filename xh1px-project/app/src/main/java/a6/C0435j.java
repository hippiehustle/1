package a6;

import java.util.RandomAccess;

/* renamed from: a6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435j extends AbstractC0429d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f7764d;

    public C0435j(int[] iArr) {
        this.f7764d = iArr;
    }

    @Override // a6.AbstractC0426a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f7764d;
        o6.j.e(iArr, "<this>");
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (intValue == iArr[i4]) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < 0) {
            return false;
        }
        return true;
    }

    @Override // a6.AbstractC0426a
    public final int g() {
        return this.f7764d.length;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return Integer.valueOf(this.f7764d[i4]);
    }

    @Override // a6.AbstractC0429d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f7764d;
        o6.j.e(iArr, "<this>");
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (intValue == iArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @Override // a6.AbstractC0426a, java.util.Collection
    public final boolean isEmpty() {
        if (this.f7764d.length == 0) {
            return true;
        }
        return false;
    }

    @Override // a6.AbstractC0429d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f7764d;
        o6.j.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (intValue == iArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }
}
