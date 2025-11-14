package q0;

import Z5.y;
import a6.C0433h;
import n0.C1131i;
import n6.InterfaceC1163b;
import o6.j;
import o6.r;

/* renamed from: q0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1347c implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f13871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f13872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1350f f13873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0433h f13875h;

    public /* synthetic */ C1347c(r rVar, r rVar2, C1350f c1350f, boolean z8, C0433h c0433h) {
        this.f13871d = rVar;
        this.f13872e = rVar2;
        this.f13873f = c1350f;
        this.f13874g = z8;
        this.f13875h = c0433h;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        C1131i c1131i = (C1131i) obj;
        j.e(c1131i, "entry");
        this.f13871d.f13639d = true;
        this.f13872e.f13639d = true;
        this.f13873f.m(c1131i, this.f13874g, this.f13875h);
        return y.f7506a;
    }
}
