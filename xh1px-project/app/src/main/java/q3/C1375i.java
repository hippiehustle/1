package q3;

import j3.C0932r;
import n6.InterfaceC1162a;

/* renamed from: q3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375i implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f13993e;

    public /* synthetic */ C1375i(j jVar, int i4) {
        this.f13992d = i4;
        this.f13993e = jVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13992d) {
            case 0:
                return this.f13993e.f();
            default:
                return new C0932r(this.f13993e.j(), 15);
        }
    }
}
