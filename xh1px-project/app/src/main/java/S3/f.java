package S3;

import D4.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f5339e;

    public /* synthetic */ f(g gVar, int i4) {
        this.f5338d = i4;
        this.f5339e = gVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5338d) {
            case 0:
                return this.f5339e.n();
            default:
                return new y(this.f5339e.m(), 17);
        }
    }
}
