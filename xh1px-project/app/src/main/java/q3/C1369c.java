package q3;

import Z5.y;
import android.content.Context;
import g0.b0;
import h4.AbstractC0832f;
import n6.InterfaceC1162a;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1369c implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f13981e;

    public /* synthetic */ C1369c(j jVar, int i4) {
        this.f13980d = i4;
        this.f13981e = jVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13980d) {
            case 0:
                j jVar = this.f13981e;
                m t8 = jVar.t();
                return t8.f14007b.f11153f.v(jVar.h());
            default:
                j jVar2 = this.f13981e;
                C1.g o7 = jVar2.i().o();
                Context h8 = jVar2.h();
                b0 b0Var = jVar2.f13999q;
                if (b0Var != null) {
                    R.g gVar = jVar2.f13997o;
                    if (gVar != null) {
                        AbstractC0832f.A(o7, gVar, h8, b0Var);
                        return y.f7506a;
                    }
                    o6.j.i("createCopyActionUiFlowListener");
                    throw null;
                }
                o6.j.i("dumbActionCreator");
                throw null;
        }
    }
}
