package m3;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: m3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078r implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1079s f12470e;

    public /* synthetic */ C1078r(C1079s c1079s, int i4) {
        this.f12469d = i4;
        this.f12470e = c1079s;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12469d) {
            case 0:
                return this.f12470e.n();
            default:
                return new C0932r(this.f12470e.m(), 8);
        }
    }
}
