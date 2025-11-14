package r2;

import L7.AbstractC0166y;
import L7.EnumC0164w;
import L7.InterfaceC0163v;
import L7.k0;
import O7.i0;
import Z5.y;
import a6.AbstractC0438m;
import android.graphics.Point;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import n6.InterfaceC1164c;
import u2.C1630a;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14270h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f14271i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431c(j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14271i = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1431c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1431c(this.f14271i, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r14.b(r7, r13) == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r14.O(r13) == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0047, code lost:
    
        if (r14 == r9) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[LOOP:0: B:18:0x0074->B:20:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        v2.j jVar;
        Iterator it;
        Q7.d dVar;
        j jVar2 = this.f14271i;
        i0 i0Var = jVar2.f14305o;
        int i4 = this.f14270h;
        y yVar = y.f7506a;
        k kVar = k.f14311g;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    a2.h hVar = jVar2.f14297e;
                    u2.b bVar = jVar2.f14296d;
                    Point b4 = bVar.b();
                    Collection values = bVar.f15314b.values();
                    ArrayList arrayList = new ArrayList(AbstractC0438m.d0(values, 10));
                    it = values.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C1630a) it.next()).f15310a);
                    }
                    bVar.a(b4, arrayList);
                    this.f14270h = 3;
                }
            } else {
                Z5.a.d(obj);
                jVar = jVar2.f14307q;
                if (jVar != null) {
                    this.f14270h = 2;
                }
                a2.h hVar2 = jVar2.f14297e;
                u2.b bVar2 = jVar2.f14296d;
                Point b42 = bVar2.b();
                Collection values2 = bVar2.f15314b.values();
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(values2, 10));
                it = values2.iterator();
                while (it.hasNext()) {
                }
                bVar2.a(b42, arrayList2);
                this.f14270h = 3;
            }
        } else {
            Z5.a.d(obj);
            if (i0Var.f() == kVar) {
                k0 k0Var = jVar2.f14302l;
                if (k0Var != null) {
                    this.f14270h = 1;
                    k0Var.d(null);
                    Object v8 = k0Var.v(this);
                    if (v8 != enumC0646a) {
                        v8 = yVar;
                    }
                }
                jVar = jVar2.f14307q;
                if (jVar != null) {
                }
            }
            a2.h hVar22 = jVar2.f14297e;
            u2.b bVar22 = jVar2.f14296d;
            Point b422 = bVar22.b();
            Collection values22 = bVar22.f15314b.values();
            ArrayList arrayList22 = new ArrayList(AbstractC0438m.d0(values22, 10));
            it = values22.iterator();
            while (it.hasNext()) {
            }
            bVar22.a(b422, arrayList22);
            this.f14270h = 3;
        }
        if (i0Var.f() == kVar && (dVar = jVar2.k) != null) {
            k0 q6 = AbstractC0166y.q(dVar, null, EnumC0164w.f3249e, new C1430b(jVar2, null), 1);
            jVar2.f14302l = q6;
            q6.start();
        }
        return yVar;
    }
}
