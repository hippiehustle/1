package p4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class o implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f13769e;

    public /* synthetic */ o(p pVar, int i4) {
        this.f13768d = i4;
        this.f13769e = pVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13768d) {
            case 0:
                return this.f13769e.n();
            default:
                return new C0932r(this.f13769e.m(), 14);
        }
    }
}
