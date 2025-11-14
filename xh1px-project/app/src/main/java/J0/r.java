package J0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.e f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2335b;

    public r(s sVar, t.e eVar) {
        this.f2335b = sVar;
        this.f2334a = eVar;
    }

    @Override // J0.q, J0.n
    public final void d(p pVar) {
        ((ArrayList) this.f2334a.get(this.f2335b.f2337e)).remove(pVar);
        pVar.z(this);
    }
}
