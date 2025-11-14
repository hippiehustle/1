package o4;

import j3.C0932r;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class s implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f13594e;

    public /* synthetic */ s(t tVar, int i4) {
        this.f13593d = i4;
        this.f13594e = tVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13593d) {
            case 0:
                return this.f13594e.n();
            default:
                return new C0932r(this.f13594e.m(), 12);
        }
    }
}
