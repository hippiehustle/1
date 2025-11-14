package E4;

import D4.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f1214e;

    public /* synthetic */ f(g gVar, int i4) {
        this.f1213d = i4;
        this.f1214e = gVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f1213d) {
            case 0:
                return this.f1214e.n();
            default:
                return new y(this.f1214e.m(), 2);
        }
    }
}
