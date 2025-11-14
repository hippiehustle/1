package d5;

import O7.C0235h;
import O7.P;
import P1.w;
import android.os.Build;
import androidx.lifecycle.Z;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld5/r;", "Landroidx/lifecycle/Z;", "smartautoclicker_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final w f10434b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.a f10435c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.f f10436d;

    /* renamed from: e, reason: collision with root package name */
    public final P f10437e;

    /* renamed from: f, reason: collision with root package name */
    public final P f10438f;

    /* renamed from: g, reason: collision with root package name */
    public final P f10439g;

    /* renamed from: h, reason: collision with root package name */
    public final P f10440h;

    /* renamed from: i, reason: collision with root package name */
    public final P f10441i;
    public final C0235h j;
    public final C0235h k;

    /* renamed from: l, reason: collision with root package name */
    public final C4.e f10442l;

    /* renamed from: m, reason: collision with root package name */
    public final C0235h f10443m;

    public r(w wVar, A3.a aVar, x2.f fVar) {
        boolean z8;
        o6.j.e(wVar, "qualityRepository");
        o6.j.e(aVar, "revenueRepository");
        o6.j.e(fVar, "settingsRepository");
        this.f10434b = wVar;
        this.f10435c = aVar;
        this.f10436d = fVar;
        this.f10437e = fVar.f16111i;
        this.f10438f = fVar.f16106d;
        this.f10439g = fVar.f16108f;
        this.f10440h = fVar.f16110h;
        this.f10441i = fVar.k;
        if (Build.VERSION.SDK_INT >= 35) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.j = new C0235h(Boolean.valueOf(z8));
        this.k = aVar.f276b;
        this.f10442l = new C4.e(aVar.f277c, 24);
        this.f10443m = new C0235h(Boolean.valueOf(h2.a.r()));
    }
}
