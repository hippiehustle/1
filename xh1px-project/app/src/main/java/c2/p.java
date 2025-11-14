package c2;

import android.graphics.Rect;
import d6.InterfaceC0617c;
import e2.AbstractC0640c;
import e2.C0639b;
import f6.AbstractC0720j;
import j2.AbstractC0901a;
import j2.C0902b;
import j2.C0903c;
import j2.C0905e;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9562h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9563i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9563i = j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((p) p((InterfaceC0617c) obj2, (AbstractC0901a) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        p pVar = new p(this.f9563i, interfaceC0617c);
        pVar.f9562h = obj;
        return pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        j2.g i4;
        T1.u uVar;
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        AbstractC0901a abstractC0901a = (AbstractC0901a) this.f9562h;
        Z5.a.d(obj);
        boolean z8 = abstractC0901a instanceof C0902b;
        long j = this.f9563i;
        if (z8) {
            C0902b i8 = C0902b.i((C0902b) abstractC0901a, null, new C0999a(j, (Long) null), null, 0, null, 0, 0, false, null, 1021);
            long j5 = i8.f11789a.f12187a;
            long j8 = i8.f11790b.f12187a;
            String str2 = i8.f11791c;
            int i9 = i8.f11792d;
            String str3 = i8.f11793e;
            Rect rect = i8.f11794f;
            int i10 = rect.left;
            int i11 = rect.top;
            int i12 = rect.right;
            int i13 = rect.bottom;
            int i14 = i8.f11795g;
            int i15 = i8.f11796h;
            boolean z9 = i8.f11797i;
            Rect rect2 = i8.j;
            if (rect2 != null) {
                num2 = Integer.valueOf(rect2.left);
            } else {
                num2 = null;
            }
            if (rect2 != null) {
                num3 = Integer.valueOf(rect2.top);
            } else {
                num3 = null;
            }
            if (rect2 != null) {
                num4 = Integer.valueOf(rect2.right);
            } else {
                num4 = null;
            }
            if (rect2 != null) {
                num5 = Integer.valueOf(rect2.bottom);
            } else {
                num5 = null;
            }
            return new T1.r(j5, j8, str2, T1.s.f5638f, i9, str3, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Boolean.valueOf(z9), num2, num3, num4, num5, (String) null, (String) null, (T1.t) null, (T1.u) null, (Integer) null, (String) null, (Long) null, (Boolean) null, 33423360);
        }
        if (abstractC0901a instanceof j2.g) {
            j2.g gVar = (j2.g) abstractC0901a;
            C0999a c0999a = new C0999a(j, (Long) null);
            gVar.getClass();
            if (gVar instanceof C0903c) {
                i4 = C0903c.i((C0903c) gVar, c0999a, null, null, 13);
            } else if (gVar instanceof C0905e) {
                i4 = C0905e.i((C0905e) gVar, null, c0999a, null, null, null, null, 61);
            } else if (gVar instanceof j2.f) {
                i4 = j2.f.i((j2.f) gVar, null, c0999a, null, 0L, false, 29);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (i4 instanceof C0903c) {
                C0903c c0903c = (C0903c) i4;
                return new T1.r(c0903c.f11798a.f12187a, c0903c.f11799b.f12187a, c0903c.f11800c, T1.s.f5636d, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, c0903c.f11801d, (String) null, (T1.t) null, (T1.u) null, (Integer) null, (String) null, (Long) null, (Boolean) null, 33423328);
            }
            if (i4 instanceof C0905e) {
                C0905e c0905e = (C0905e) i4;
                AbstractC0640c abstractC0640c = c0905e.f11813f;
                boolean z10 = abstractC0640c instanceof C0639b;
                long j9 = c0905e.f11808a.f12187a;
                long j10 = c0905e.f11809b.f12187a;
                String str4 = c0905e.f11810c;
                String str5 = c0905e.f11811d;
                T1.t valueOf = T1.t.valueOf(c0905e.f11812e.name());
                if (z10) {
                    uVar = T1.u.f5647d;
                } else {
                    uVar = T1.u.f5648e;
                }
                T1.u uVar2 = uVar;
                if (z10) {
                    num = Integer.valueOf(((C0639b) abstractC0640c).f10598a);
                } else {
                    num = null;
                }
                if (z10) {
                    str = null;
                } else {
                    Object a3 = abstractC0640c.a();
                    o6.j.c(a3, "null cannot be cast to non-null type kotlin.String");
                    str = (String) a3;
                }
                return new T1.r(j9, j10, str4, T1.s.f5637e, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, str5, valueOf, uVar2, num, str, (Long) null, (Boolean) null, 25427936);
            }
            if (i4 instanceof j2.f) {
                j2.f fVar = (j2.f) i4;
                return new T1.r(fVar.f11814a.f12187a, fVar.f11815b.f12187a, fVar.f11816c, T1.s.f5639g, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (T1.t) null, (T1.u) null, (Integer) null, (String) null, Long.valueOf(fVar.f11817d), Boolean.valueOf(fVar.f11818e), 8388576);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
