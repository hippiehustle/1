package N3;

import D4.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class c implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f3741e;

    public /* synthetic */ c(d dVar, int i4) {
        this.f3740d = i4;
        this.f3741e = dVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3740d) {
            case 0:
                return this.f3741e.n();
            default:
                return new y(this.f3741e.m(), 10);
        }
    }
}
