package c5;

import A1.h;
import J1.e;
import O7.P;
import O7.V;
import P1.w;
import T4.k;
import T4.l;
import Z.g;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import i1.C0879a;
import kotlin.Metadata;
import o6.j;
import x2.f;
import z3.EnumC1856b;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc5/a;", "Landroidx/lifecycle/Z;", "smartautoclicker_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581a extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final A3.a f9667b;

    /* renamed from: c, reason: collision with root package name */
    public final w f9668c;

    /* renamed from: d, reason: collision with root package name */
    public final e f9669d;

    /* renamed from: e, reason: collision with root package name */
    public final f f9670e;

    /* renamed from: f, reason: collision with root package name */
    public final C0879a f9671f;

    /* renamed from: g, reason: collision with root package name */
    public k f9672g;

    /* renamed from: h, reason: collision with root package name */
    public final P f9673h;

    public C0581a(Context context, A3.a aVar, w wVar, e eVar, f fVar, C0879a c0879a) {
        j.e(aVar, "revenueRepository");
        j.e(wVar, "qualityRepository");
        j.e(eVar, "permissionController");
        j.e(fVar, "settingsRepository");
        j.e(c0879a, "appComponentsProvider");
        this.f9667b = aVar;
        this.f9668c = wVar;
        this.f9669d = eVar;
        this.f9670e = fVar;
        this.f9671f = c0879a;
        h hVar = new h(20, this);
        this.f9673h = V.t(aVar.f275a, U.g(this), O7.Z.f4117a, EnumC1856b.f16629d);
        l.f5789c = hVar;
        hVar.m(l.f5788b);
        if (Build.VERSION.SDK_INT >= 33) {
        }
    }

    @Override // androidx.lifecycle.Z
    public final void d() {
        l.f5789c = null;
    }
}
