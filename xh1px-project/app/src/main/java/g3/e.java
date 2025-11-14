package g3;

import C1.f;
import D4.C0037m;
import D4.C0040p;
import O7.V;
import O7.i0;
import R3.r;
import Z5.y;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l1.C1000b;
import o2.C1229a;
import o6.j;
import p2.C1304a;
import t6.C1586a;
import t6.C1588c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C1229a f11148a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f11149b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f11150c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.c f11151d;

    /* renamed from: e, reason: collision with root package name */
    public final f f11152e;

    /* renamed from: f, reason: collision with root package name */
    public final r f11153f;

    public e(C1229a c1229a) {
        j.e(c1229a, "dumbRepository");
        this.f11148a = c1229a;
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f11149b = c6;
        this.f11150c = c6;
        this.f11151d = new A4.c(new C0040p(c6, 18), V.u(new C0040p(c6, 18), new C0037m(interfaceC0617c, this, 7)), new C0778a(3, interfaceC0617c, 0), 27);
        this.f11152e = new f(c6, 6);
        this.f11153f = new r(17);
    }

    public static p2.d b(p2.d dVar, int i4) {
        if (dVar instanceof C1304a) {
            return C1304a.i((C1304a) dVar, null, null, null, i4, 0, false, 0L, null, 0L, 503);
        }
        if (dVar instanceof p2.b) {
            return p2.b.i((p2.b) dVar, null, null, null, i4, 0L, 23);
        }
        if (dVar instanceof p2.c) {
            return p2.c.i((p2.c) dVar, null, null, null, i4, 0, false, 0L, null, null, 0L, 1015);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void h(ArrayList arrayList, C1588c c1588c) {
        int i4 = c1588c.f15123d;
        int i8 = c1588c.f15124e;
        if (i4 > i8) {
            return;
        }
        while (true) {
            Objects.toString(arrayList.get(i4));
            arrayList.set(i4, b((p2.d) arrayList.get(i4), i4));
            if (i4 != i8) {
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [t6.a, t6.c] */
    public final void a(p2.d dVar, Integer num) {
        j.e(dVar, "dumbAction");
        i0 i0Var = this.f11149b;
        p2.e eVar = (p2.e) i0Var.f();
        if (eVar == null) {
            return;
        }
        List list = eVar.f13701c;
        dVar.toString();
        ArrayList S02 = AbstractC0436k.S0(list);
        if (num != null) {
            if (num.intValue() != AbstractC0437l.W(list) + 1) {
                C1588c V6 = AbstractC0437l.V(list);
                int intValue = num.intValue();
                if (intValue >= 0 && intValue <= V6.f15124e) {
                    S02.add(num.intValue(), b(dVar, num.intValue()));
                    h(S02, new C1586a(num.intValue() + 1, AbstractC0437l.W(S02), 1));
                } else {
                    Log.w("DumbEditionRepository", "Invalid insertion index " + num);
                }
                p2.e g8 = p2.e.g(eVar, null, S02, 0, false, 0, false, false, 507);
                i0Var.getClass();
                i0Var.h(null, g8);
            }
        }
        S02.add(b(dVar, AbstractC0437l.W(list) + 1));
        p2.e g82 = p2.e.g(eVar, null, S02, 0, false, 0, false, false, 507);
        i0Var.getClass();
        i0Var.h(null, g82);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC0713c abstractC0713c) {
        b bVar;
        int i4;
        if (abstractC0713c instanceof b) {
            bVar = (b) abstractC0713c;
            int i8 = bVar.f11141i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f11141i = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f11139g;
                i4 = bVar.f11141i;
                i0 i0Var = this.f11149b;
                y yVar = y.f7506a;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    p2.e eVar = (p2.e) i0Var.f();
                    if (eVar == null) {
                        return yVar;
                    }
                    bVar.f11141i = 1;
                    Object f8 = this.f11148a.f13440a.f(eVar, bVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (f8 != enumC0646a) {
                        f8 = yVar;
                    }
                    if (f8 == enumC0646a) {
                        return enumC0646a;
                    }
                }
                i0Var.g(null);
                r rVar = this.f11153f;
                ((C1000b) rVar.f5082e).f12189a = 0L;
                rVar.f5083f = null;
                return yVar;
            }
        }
        bVar = new b(this, abstractC0713c);
        Object obj2 = bVar.f11139g;
        i4 = bVar.f11141i;
        i0 i0Var2 = this.f11149b;
        y yVar2 = y.f7506a;
        if (i4 == 0) {
        }
        i0Var2.g(null);
        r rVar2 = this.f11153f;
        ((C1000b) rVar2.f5082e).f12189a = 0L;
        rVar2.f5083f = null;
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j, AbstractC0713c abstractC0713c) {
        d dVar;
        int i4;
        p2.e eVar;
        if (abstractC0713c instanceof d) {
            dVar = (d) abstractC0713c;
            int i8 = dVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.j = i8 - Integer.MIN_VALUE;
                Object obj = dVar.f11146h;
                i4 = dVar.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        j = dVar.f11145g;
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    dVar.f11145g = j;
                    dVar.j = 1;
                    obj = this.f11148a.f13440a.d(j, dVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                eVar = (p2.e) obj;
                if (eVar != null) {
                    Log.e("DumbEditionRepository", "Can't start edition, dumb scenario " + j + " not found");
                    return Boolean.FALSE;
                }
                i0 i0Var = this.f11149b;
                i0Var.getClass();
                i0Var.h(null, eVar);
                C0999a c0999a = eVar.f13699a;
                r rVar = this.f11153f;
                rVar.getClass();
                j.e(c0999a, "scenarioId");
                ((C1000b) rVar.f5082e).f12189a = 0L;
                rVar.f5083f = c0999a;
                return Boolean.TRUE;
            }
        }
        dVar = new d(this, abstractC0713c);
        Object obj2 = dVar.f11146h;
        i4 = dVar.j;
        if (i4 == 0) {
        }
        eVar = (p2.e) obj2;
        if (eVar != null) {
        }
    }

    public final void e(p2.d dVar) {
        j.e(dVar, "dumbAction");
        i0 i0Var = this.f11149b;
        p2.e eVar = (p2.e) i0Var.f();
        if (eVar == null) {
            return;
        }
        List list = eVar.f13701c;
        Iterator it = list.iterator();
        int i4 = 0;
        while (true) {
            if (it.hasNext()) {
                if (j.a(((p2.d) it.next()).getId(), dVar.getId())) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 == -1) {
            Log.w("DumbEditionRepository", "Can't update action, it is not in the edited scenario.");
            return;
        }
        ArrayList S02 = AbstractC0436k.S0(list);
        S02.set(i4, dVar);
        p2.e g8 = p2.e.g(eVar, null, S02, 0, false, 0, false, false, 507);
        i0Var.getClass();
        i0Var.h(null, g8);
    }

    public final void f(ArrayList arrayList) {
        i0 i0Var = this.f11149b;
        p2.e eVar = (p2.e) i0Var.f();
        if (eVar == null) {
            return;
        }
        arrayList.toString();
        ArrayList S02 = AbstractC0436k.S0(arrayList);
        h(S02, AbstractC0437l.V(S02));
        p2.e g8 = p2.e.g(eVar, null, S02, 0, false, 0, false, false, 507);
        i0Var.getClass();
        i0Var.h(null, g8);
    }

    public final void g(p2.e eVar) {
        eVar.toString();
        i0 i0Var = this.f11149b;
        i0Var.getClass();
        i0Var.h(null, eVar);
    }
}
