package P7;

import O7.U;
import d6.InterfaceC0617c;
import java.util.Arrays;

/* renamed from: P7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0284a {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0286c[] f4635d;

    /* renamed from: e, reason: collision with root package name */
    public int f4636e;

    /* renamed from: f, reason: collision with root package name */
    public int f4637f;

    /* renamed from: g, reason: collision with root package name */
    public D f4638g;

    public final AbstractC0286c a() {
        AbstractC0286c abstractC0286c;
        D d2;
        synchronized (this) {
            try {
                AbstractC0286c[] abstractC0286cArr = this.f4635d;
                if (abstractC0286cArr == null) {
                    abstractC0286cArr = c();
                    this.f4635d = abstractC0286cArr;
                } else if (this.f4636e >= abstractC0286cArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0286cArr, abstractC0286cArr.length * 2);
                    o6.j.d(copyOf, "copyOf(...)");
                    this.f4635d = (AbstractC0286c[]) copyOf;
                    abstractC0286cArr = (AbstractC0286c[]) copyOf;
                }
                int i4 = this.f4637f;
                do {
                    abstractC0286c = abstractC0286cArr[i4];
                    if (abstractC0286c == null) {
                        abstractC0286c = b();
                        abstractC0286cArr[i4] = abstractC0286c;
                    }
                    i4++;
                    if (i4 >= abstractC0286cArr.length) {
                        i4 = 0;
                    }
                } while (!abstractC0286c.a(this));
                this.f4637f = i4;
                this.f4636e++;
                d2 = this.f4638g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d2 != null) {
            d2.w(1);
        }
        return abstractC0286c;
    }

    public abstract AbstractC0286c b();

    public abstract AbstractC0286c[] c();

    public final void d(AbstractC0286c abstractC0286c) {
        D d2;
        int i4;
        InterfaceC0617c[] b4;
        synchronized (this) {
            try {
                int i8 = this.f4636e - 1;
                this.f4636e = i8;
                d2 = this.f4638g;
                if (i8 == 0) {
                    this.f4637f = 0;
                }
                o6.j.c(abstractC0286c, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b4 = abstractC0286c.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0617c interfaceC0617c : b4) {
            if (interfaceC0617c != null) {
                interfaceC0617c.k(Z5.y.f7506a);
            }
        }
        if (d2 != null) {
            d2.w(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [P7.D, O7.U] */
    public final D e() {
        D d2;
        synchronized (this) {
            D d3 = this.f4638g;
            d2 = d3;
            if (d3 == null) {
                int i4 = this.f4636e;
                ?? u8 = new U(1, Integer.MAX_VALUE, N7.a.f3796e);
                u8.t(Integer.valueOf(i4));
                this.f4638g = u8;
                d2 = u8;
            }
        }
        return d2;
    }
}
