package u7;

import a6.AbstractC0425A;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class m implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15420d;

    /* renamed from: e, reason: collision with root package name */
    public final n f15421e;

    /* renamed from: f, reason: collision with root package name */
    public final o f15422f;

    public /* synthetic */ m(n nVar, o oVar, int i4) {
        this.f15420d = i4;
        this.f15421e = nVar;
        this.f15422f = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15420d) {
            case 0:
                return AbstractC0425A.g0(this.f15421e.f15423a.keySet(), this.f15422f.o());
            default:
                return AbstractC0425A.g0(this.f15421e.f15424b.keySet(), this.f15422f.p());
        }
    }
}
