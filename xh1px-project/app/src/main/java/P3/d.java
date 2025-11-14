package P3;

import D4.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f4504e;

    public /* synthetic */ d(e eVar, int i4) {
        this.f4503d = i4;
        this.f4504e = eVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f4503d) {
            case 0:
                return this.f4504e.n();
            default:
                return new y(this.f4504e.m(), 14);
        }
    }
}
