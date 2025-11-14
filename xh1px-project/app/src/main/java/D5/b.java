package D5;

import android.graphics.Typeface;
import q4.X;

/* loaded from: classes.dex */
public final class b extends G.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f1004h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f1005i;

    public b(d dVar, X x8) {
        this.f1005i = dVar;
        this.f1004h = x8;
    }

    @Override // G.b
    public final void g(int i4) {
        this.f1005i.f1020m = true;
        this.f1004h.F(i4);
    }

    @Override // G.b
    public final void h(Typeface typeface) {
        d dVar = this.f1005i;
        dVar.f1021n = Typeface.create(typeface, dVar.f1012c);
        dVar.f1020m = true;
        this.f1004h.G(dVar.f1021n, false);
    }
}
