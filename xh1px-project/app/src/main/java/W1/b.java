package W1;

import T1.B;
import T1.C0304c;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.H;
import T1.N;
import T1.r;
import a8.u;
import h4.AbstractC0832f;
import i.AbstractC0863b;
import java.util.ArrayList;
import java.util.Iterator;
import o6.j;
import t6.C1590e;

/* loaded from: classes.dex */
public final class b extends d {
    @Override // G5.e
    public final C0304c f(u uVar, ArrayList arrayList, int i4) {
        Integer i8;
        Integer num;
        Integer num2;
        Long l6;
        EnumC0307f enumC0307f;
        int i9;
        long j;
        Object obj;
        Long l8;
        Long m6 = AbstractC0863b.m(uVar, "id", true);
        if (m6 != null) {
            long longValue = m6.longValue();
            Long m8 = AbstractC0863b.m(uVar, "eventId", true);
            if (m8 != null) {
                long longValue2 = m8.longValue();
                Boolean f8 = AbstractC0863b.f(uVar, "clickOnCondition");
                if (f8 != null) {
                    if (f8.booleanValue()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (j.a(((r) obj).f5623m, Boolean.TRUE)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        r rVar = (r) obj;
                        if (rVar != null) {
                            l8 = Long.valueOf(rVar.f5613a);
                        } else {
                            l8 = null;
                        }
                        l6 = l8;
                        enumC0307f = EnumC0307f.f5595e;
                        num = null;
                        num2 = null;
                    } else {
                        Integer i10 = AbstractC0863b.i(uVar, "x", true);
                        if (i10 != null && (i8 = AbstractC0863b.i(uVar, "y", true)) != null) {
                            num = i10;
                            num2 = i8;
                            l6 = null;
                            enumC0307f = EnumC0307f.f5594d;
                        }
                    }
                    String p8 = AbstractC0863b.p(uVar, "name", false);
                    if (p8 == null) {
                        p8 = "";
                    }
                    String str = p8;
                    Integer i11 = AbstractC0863b.i(uVar, "priority", false);
                    if (i11 != null) {
                        int intValue = i11.intValue();
                        if (intValue < 0) {
                            intValue = 0;
                        }
                        i9 = intValue;
                    } else {
                        i9 = 0;
                    }
                    Long m9 = AbstractC0863b.m(uVar, "pressDuration", false);
                    long j5 = 1;
                    if (m9 != null) {
                        j = longValue;
                        j5 = AbstractC0832f.i(m9.longValue(), new C1590e(1L, 59999L));
                    } else {
                        j = longValue;
                    }
                    return new C0304c(j, longValue2, i9, str, EnumC0305d.f5582d, enumC0307f, num, num2, l6, Long.valueOf(j5), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -1024, 31);
                }
            }
        }
        return null;
    }

    @Override // G5.e
    public final int p(u uVar) {
        return super.p(uVar) + 600;
    }
}
