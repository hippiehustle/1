package U1;

import T1.EnumC0305d;
import Z5.y;
import android.content.ContentValues;
import kotlin.NoWhenBranchMatchedException;
import n1.AbstractC1149a;
import n1.C1150b;
import n1.C1152d;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class k implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1.i f6063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1.i f6064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R.g f6065g;

    public /* synthetic */ k(n1.i iVar, n1.i iVar2, R.g gVar, int i4) {
        this.f6062d = i4;
        this.f6063e = iVar;
        this.f6064f = iVar2;
        this.f6065g = gVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Long valueOf;
        Integer num;
        Long valueOf2;
        String str;
        int i4 = this.f6062d;
        y yVar = y.f7506a;
        R.g gVar = this.f6065g;
        n1.i iVar = this.f6064f;
        n1.i iVar2 = this.f6063e;
        switch (i4) {
            case 0:
                n1.j jVar = (n1.j) obj;
                o6.j.e(jVar, "row");
                if (iVar2 instanceof C1150b) {
                    valueOf = (Long) Boolean.valueOf(jVar.a(((C1150b) iVar2).f12838a));
                } else if (iVar2 instanceof n1.h) {
                    valueOf = (Long) jVar.d(((n1.h) iVar2).f12853a);
                } else if (iVar2 instanceof n1.e) {
                    valueOf = (Long) Integer.valueOf(jVar.b(((n1.e) iVar2).f12845a));
                } else {
                    if (!(iVar2 instanceof n1.g) && !(iVar2 instanceof C1152d) && !(iVar2 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf = Long.valueOf(jVar.c(iVar2.a()));
                }
                if (iVar instanceof C1150b) {
                    num = (Integer) Boolean.valueOf(jVar.a(((C1150b) iVar).f12838a));
                } else if (iVar instanceof n1.h) {
                    num = (Integer) jVar.d(((n1.h) iVar).f12853a);
                } else if (iVar instanceof n1.e) {
                    num = Integer.valueOf(jVar.b(((n1.e) iVar).f12845a));
                } else {
                    if (!(iVar instanceof n1.g) && !(iVar instanceof C1152d) && !(iVar instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = (Integer) Long.valueOf(jVar.c(iVar.a()));
                }
                int intValue = num.intValue();
                long longValue = valueOf.longValue();
                l lVar = l.f6066c;
                int i8 = intValue + 3;
                if (i8 > 20) {
                    i8 = 20;
                }
                String f8 = AbstractC1149a.f("WHERE `id` = ", longValue);
                ContentValues contentValues = new ContentValues();
                contentValues.put(l.f6068e.f12845a, Integer.valueOf(i8));
                gVar.S(f8, contentValues);
                return yVar;
            default:
                n1.j jVar2 = (n1.j) obj;
                o6.j.e(jVar2, "row");
                if (iVar2 instanceof C1150b) {
                    valueOf2 = (Long) Boolean.valueOf(jVar2.a(((C1150b) iVar2).f12838a));
                } else if (iVar2 instanceof n1.h) {
                    valueOf2 = (Long) jVar2.d(((n1.h) iVar2).f12853a);
                } else if (iVar2 instanceof n1.e) {
                    valueOf2 = (Long) Integer.valueOf(jVar2.b(((n1.e) iVar2).f12845a));
                } else {
                    if (!(iVar2 instanceof n1.g) && !(iVar2 instanceof C1152d) && !(iVar2 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf2 = Long.valueOf(jVar2.c(iVar2.a()));
                }
                if (iVar instanceof C1150b) {
                    str = (String) Boolean.valueOf(jVar2.a(((C1150b) iVar).f12838a));
                } else if (iVar instanceof n1.h) {
                    str = jVar2.d(((n1.h) iVar).f12853a);
                } else if (iVar instanceof n1.e) {
                    str = (String) Integer.valueOf(jVar2.b(((n1.e) iVar).f12845a));
                } else {
                    if (!(iVar instanceof n1.g) && !(iVar instanceof C1152d) && !(iVar instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = (String) Long.valueOf(jVar2.c(iVar.a()));
                }
                long longValue2 = valueOf2.longValue();
                if (EnumC0305d.valueOf(str) == EnumC0305d.f5582d) {
                    m mVar = m.f6069c;
                    String f9 = AbstractC1149a.f("WHERE `id` = ", longValue2);
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(m.f6073g.f12845a, (Integer) 0);
                    gVar.S(f9, contentValues2);
                }
                return yVar;
        }
    }
}
