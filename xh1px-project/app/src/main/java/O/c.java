package O;

import o6.j;
import x.C1764c;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3848a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3849b;

    /* renamed from: c, reason: collision with root package name */
    public int f3850c;

    public c(int i4) {
        this.f3848a = 0;
        if (i4 > 0) {
            this.f3849b = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        switch (this.f3848a) {
            case 0:
                int i4 = this.f3850c;
                if (i4 <= 0) {
                    return null;
                }
                int i8 = i4 - 1;
                Object[] objArr = this.f3849b;
                Object obj = objArr[i8];
                j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i8] = null;
                this.f3850c--;
                return obj;
            default:
                int i9 = this.f3850c;
                if (i9 <= 0) {
                    return null;
                }
                int i10 = i9 - 1;
                Object[] objArr2 = this.f3849b;
                Object obj2 = objArr2[i10];
                objArr2[i10] = null;
                this.f3850c = i9 - 1;
                return obj2;
        }
    }

    public void b(C1764c c1764c) {
        int i4 = this.f3850c;
        Object[] objArr = this.f3849b;
        if (i4 < objArr.length) {
            objArr[i4] = c1764c;
            this.f3850c = i4 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z8;
        j.e(obj, "instance");
        int i4 = this.f3850c;
        int i8 = 0;
        while (true) {
            objArr = this.f3849b;
            if (i8 < i4) {
                if (objArr[i8] == obj) {
                    z8 = true;
                    break;
                }
                i8++;
            } else {
                z8 = false;
                break;
            }
        }
        if (!z8) {
            int i9 = this.f3850c;
            if (i9 >= objArr.length) {
                return false;
            }
            objArr[i9] = obj;
            this.f3850c = i9 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public c() {
        this.f3848a = 1;
        this.f3849b = new Object[256];
    }
}
