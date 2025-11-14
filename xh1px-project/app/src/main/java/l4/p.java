package l4;

import L7.AbstractC0160s;
import M3.W;
import O7.P;
import O7.V;
import O7.i0;
import R3.r;
import a6.AbstractC0436k;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import j2.AbstractC0901a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final Y1.d f12287b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.n f12288c;

    /* renamed from: d, reason: collision with root package name */
    public final J2.b f12289d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f12290e;

    /* renamed from: f, reason: collision with root package name */
    public final P f12291f;

    /* renamed from: g, reason: collision with root package name */
    public final r f12292g;

    /* renamed from: h, reason: collision with root package name */
    public final W f12293h;

    /* renamed from: i, reason: collision with root package name */
    public final r f12294i;

    public p(Context context, AbstractC0160s abstractC0160s, Y1.d dVar, b2.r rVar, q1.e eVar, H3.n nVar, J2.b bVar) {
        o6.j.e(dVar, "displayConfigManager");
        o6.j.e(rVar, "repository");
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(nVar, "editionRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        this.f12287b = dVar;
        this.f12288c = nVar;
        this.f12289d = bVar;
        P7.n nVar2 = nVar.f1950e.f1987h;
        i0 c6 = V.c(0);
        this.f12290e = c6;
        P t8 = V.t(V.q(new A4.c(c6, nVar2, new m(eVar, null), 27), abstractC0160s), U.g(this), O7.Z.f4117a, null);
        this.f12291f = t8;
        this.f12292g = new r(t8, 23, this);
        this.f12293h = new W(nVar2, context, 2);
        this.f12294i = rVar.f9113c;
    }

    public final boolean e(int i4, boolean z8) {
        H3.n nVar = this.f12288c;
        List e9 = nVar.f1950e.e();
        if (e9 != null) {
            ArrayList S02 = AbstractC0436k.S0(e9);
            if (i4 >= 0 && i4 < S02.size()) {
                nVar.d((AbstractC0901a) S02.get(i4));
                if (!z8 && nVar.f1950e.h()) {
                    nVar.g();
                    return false;
                }
                nVar.a();
                return true;
            }
        }
        return false;
    }
}
