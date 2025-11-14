package N1;

import L7.AbstractC0160s;
import R3.r;
import Z5.y;
import a0.C0407b;
import a0.C0409d;
import android.content.Context;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final C0409d f3710b = new C0409d("lastServiceStartTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final C0409d f3711c = new C0409d("lastServiceForegroundTimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final C0409d f3712d = new C0409d("accessibilityPermissionLossCount");

    /* renamed from: e, reason: collision with root package name */
    public static final C0409d f3713e = new C0409d("accessibilityTroubleshootingDialogDisplayCount");

    /* renamed from: a, reason: collision with root package name */
    public final r f3714a;

    public c(AbstractC0160s abstractC0160s, Context context) {
        this.f3714a = new r(context, abstractC0160s, "quality", null, 24);
    }

    public static final d a(c cVar, C0407b c0407b) {
        long j;
        int i4;
        cVar.getClass();
        Long l6 = (Long) c0407b.c(f3710b);
        long j5 = -1;
        if (l6 != null) {
            j = l6.longValue();
        } else {
            j = -1;
        }
        Long l8 = (Long) c0407b.c(f3711c);
        if (l8 != null) {
            j5 = l8.longValue();
        }
        long j8 = j5;
        Integer num = (Integer) c0407b.c(f3712d);
        int i8 = 0;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        Integer num2 = (Integer) c0407b.c(f3713e);
        if (num2 != null) {
            i8 = num2.intValue();
        }
        return new d(i4, i8, j, j8);
    }

    public final Object b(InterfaceC1164c interfaceC1164c, AbstractC0720j abstractC0720j) {
        Object P4 = this.f3714a.P(new a(this, interfaceC1164c, null), abstractC0720j);
        if (P4 == EnumC0646a.f10656d) {
            return P4;
        }
        return y.f7506a;
    }
}
