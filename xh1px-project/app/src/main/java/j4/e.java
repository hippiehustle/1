package j4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class e implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f11922e;

    public /* synthetic */ e(f fVar, int i4) {
        this.f11921d = i4;
        this.f11922e = fVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f11921d) {
            case 0:
                return this.f11922e.n();
            default:
                return new C0932r(this.f11922e.m(), 1);
        }
    }
}
