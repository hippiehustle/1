package c7;

import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.C0428c;
import a6.C0435j;
import a6.s;
import java.util.ArrayList;
import java.util.List;
import o6.j;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0582a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9675b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9676c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9677d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9678e;

    public AbstractC0582a(int... iArr) {
        int i4;
        int i8;
        List list;
        j.e(iArr, "numbers");
        this.f9674a = iArr;
        Integer Y02 = AbstractC0434i.Y0(iArr, 0);
        if (Y02 != null) {
            i4 = Y02.intValue();
        } else {
            i4 = -1;
        }
        this.f9675b = i4;
        Integer Y03 = AbstractC0434i.Y0(iArr, 1);
        if (Y03 != null) {
            i8 = Y03.intValue();
        } else {
            i8 = -1;
        }
        this.f9676c = i8;
        Integer Y04 = AbstractC0434i.Y0(iArr, 2);
        this.f9677d = Y04 != null ? Y04.intValue() : -1;
        if (iArr.length > 3) {
            if (iArr.length <= 1024) {
                list = AbstractC0436k.Q0(new C0428c(new C0435j(iArr), 3, iArr.length));
            } else {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
        } else {
            list = s.f7766d;
        }
        this.f9678e = list;
    }

    public final boolean a(int i4, int i8, int i9) {
        int i10 = this.f9675b;
        if (i10 > i4) {
            return true;
        }
        if (i10 < i4) {
            return false;
        }
        int i11 = this.f9676c;
        if (i11 > i8) {
            return true;
        }
        if (i11 >= i8 && this.f9677d >= i9) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            AbstractC0582a abstractC0582a = (AbstractC0582a) obj;
            if (this.f9675b == abstractC0582a.f9675b && this.f9676c == abstractC0582a.f9676c && this.f9677d == abstractC0582a.f9677d && j.a(this.f9678e, abstractC0582a.f9678e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f9675b;
        int i8 = (i4 * 31) + this.f9676c + i4;
        int i9 = (i8 * 31) + this.f9677d + i8;
        return this.f9678e.hashCode() + (i9 * 31) + i9;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i4 : this.f9674a) {
            if (i4 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i4));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return AbstractC0436k.v0(arrayList, ".", null, null, null, 62);
    }
}
