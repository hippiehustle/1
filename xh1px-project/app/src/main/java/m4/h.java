package m4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class h implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f12512e;

    public /* synthetic */ h(i iVar, int i4) {
        this.f12511d = i4;
        this.f12512e = iVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f12511d) {
            case 0:
                return this.f12512e.n();
            default:
                return new C0932r(this.f12512e.m(), 9);
        }
    }
}
