package y2;

import L7.AbstractC0160s;
import O7.InterfaceC0233f;
import O7.V;
import R3.r;
import a0.C0407b;
import a6.x;
import android.content.Context;
import e6.EnumC0646a;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r f16463a;

    public c(AbstractC0160s abstractC0160s, Context context) {
        this.f16463a = new r(context, abstractC0160s, "smartConfig", null, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0407b c0407b, AbstractC0713c abstractC0713c) {
        b bVar;
        int i4;
        Boolean bool;
        if (abstractC0713c instanceof b) {
            bVar = (b) abstractC0713c;
            int i8 = bVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.j = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f16461h;
                i4 = bVar.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c0407b = bVar.f16460g;
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    InterfaceC0233f interfaceC0233f = (InterfaceC0233f) this.f16463a.f5083f;
                    bVar.f16460g = c0407b;
                    bVar.j = 1;
                    obj = V.n(interfaceC0233f, bVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                bool = (Boolean) ((C0407b) obj).c(d.f16464a);
                if (bool == null) {
                    C0407b c0407b2 = new C0407b(x.T0(c0407b.a()), false);
                    c0407b2.d(p.f16488c, bool);
                    return new C0407b(x.T0(c0407b2.a()), true);
                }
                return c0407b;
            }
        }
        bVar = new b(this, abstractC0713c);
        Object obj2 = bVar.f16461h;
        i4 = bVar.j;
        if (i4 == 0) {
        }
        bool = (Boolean) ((C0407b) obj2).c(d.f16464a);
        if (bool == null) {
        }
    }
}
