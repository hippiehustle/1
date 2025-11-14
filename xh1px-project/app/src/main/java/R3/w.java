package R3;

import D4.C0040p;
import O7.InterfaceC0233f;
import O7.V;
import a6.AbstractC0437l;
import androidx.lifecycle.Z;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f5096b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0233f f5097c;

    /* renamed from: d, reason: collision with root package name */
    public final C4.e f5098d;

    /* renamed from: e, reason: collision with root package name */
    public final r f5099e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5100f;

    /* renamed from: g, reason: collision with root package name */
    public final List f5101g;

    /* renamed from: h, reason: collision with root package name */
    public final W0.c f5102h;

    /* renamed from: i, reason: collision with root package name */
    public final p f5103i;
    public final C0040p j;

    public w(H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f5096b = nVar;
        H3.y yVar = nVar.f1950e;
        C4.e eVar = new C4.e(yVar.f1992o, 13);
        this.f5097c = V.j(V.k(nVar.k));
        this.f5098d = new C4.e(new p(eVar, 0), 12);
        this.f5099e = new r(eVar, 0, this);
        this.f5100f = AbstractC0437l.X(x.f5104a, x.f5105b, x.f5106c, x.f5107d, x.f5108e, x.f5109f, x.f5110g, x.f5111h);
        this.f5101g = AbstractC0437l.X(x.f5112i, x.j);
        this.f5102h = new W0.c(15, eVar);
        this.f5103i = new p(eVar, 1);
        this.j = new C0040p(yVar.f1992o, 20);
    }
}
