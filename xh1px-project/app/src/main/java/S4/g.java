package S4;

import D4.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class g implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f5374e;

    public /* synthetic */ g(h hVar, int i4) {
        this.f5373d = i4;
        this.f5374e = hVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5373d) {
            case 0:
                return this.f5374e.n();
            default:
                return new y(this.f5374e.m(), 18);
        }
    }
}
