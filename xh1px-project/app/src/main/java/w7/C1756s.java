package w7;

import C6.InterfaceC0007h;

/* renamed from: w7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756s extends O {

    /* renamed from: b, reason: collision with root package name */
    public final C6.T[] f16010b;

    /* renamed from: c, reason: collision with root package name */
    public final M[] f16011c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16012d;

    public C1756s(C6.T[] tArr, M[] mArr, boolean z8) {
        o6.j.e(tArr, "parameters");
        o6.j.e(mArr, "arguments");
        this.f16010b = tArr;
        this.f16011c = mArr;
        this.f16012d = z8;
    }

    @Override // w7.O
    public final boolean b() {
        return this.f16012d;
    }

    @Override // w7.O
    public final M d(AbstractC1759v abstractC1759v) {
        C6.T t8;
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 instanceof C6.T) {
            t8 = (C6.T) c6;
        } else {
            t8 = null;
        }
        if (t8 != null) {
            int index = t8.getIndex();
            C6.T[] tArr = this.f16010b;
            if (index < tArr.length && o6.j.a(tArr[index].B(), t8.B())) {
                return this.f16011c[index];
            }
        }
        return null;
    }

    @Override // w7.O
    public final boolean e() {
        if (this.f16011c.length == 0) {
            return true;
        }
        return false;
    }
}
