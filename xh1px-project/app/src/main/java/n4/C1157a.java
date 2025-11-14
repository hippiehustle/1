package n4;

import android.content.Context;
import d4.C0600f;
import j2.C0903c;
import n6.InterfaceC1162a;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1157a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f12929e;

    public /* synthetic */ C1157a(o oVar, int i4) {
        this.f12928d = i4;
        this.f12929e = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        String str;
        switch (this.f12928d) {
            case 0:
                o.G(this.f12929e);
                break;
            default:
                o oVar = this.f12929e;
                C1.g o7 = oVar.o();
                Context k = oVar.k();
                C0903c c0903c = (C0903c) oVar.J().f12987b.f1950e.b();
                if (c0903c == null || (str = c0903c.f11801d) == null) {
                    str = "";
                }
                o7.d(k, new C0600f(str, new C1158b(oVar, 5), true), true);
                break;
        }
        return Z5.y.f7506a;
    }
}
