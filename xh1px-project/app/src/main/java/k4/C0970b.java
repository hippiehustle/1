package k4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0971c f12080e;

    public /* synthetic */ C0970b(C0971c c0971c, int i4) {
        this.f12079d = i4;
        this.f12080e = c0971c;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12079d) {
            case 0:
                return this.f12080e.n();
            default:
                return new C0932r(this.f12080e.m(), 3);
        }
    }
}
