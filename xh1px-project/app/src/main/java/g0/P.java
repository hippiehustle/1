package g0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P implements O {

    /* renamed from: a, reason: collision with root package name */
    public final String f10877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f10879c;

    public P(T t8, String str, int i4) {
        this.f10879c = t8;
        this.f10877a = str;
        this.f10878b = i4;
    }

    @Override // g0.O
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10879c.f10884A;
        if (abstractComponentCallbacksC0755y != null && this.f10878b < 0 && this.f10877a == null && abstractComponentCallbacksC0755y.i().T(-1, 0)) {
            return false;
        }
        return this.f10879c.U(arrayList, arrayList2, this.f10877a, this.f10878b, 1);
    }
}
