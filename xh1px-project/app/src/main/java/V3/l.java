package V3;

import D4.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class l implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f6367e;

    public /* synthetic */ l(m mVar, int i4) {
        this.f6366d = i4;
        this.f6367e = mVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f6366d) {
            case 0:
                return this.f6367e.n();
            default:
                return new y(this.f6367e.m(), 21);
        }
    }
}
