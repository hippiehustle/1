package A1;

import Z5.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f243e;

    public /* synthetic */ d(f fVar, int i4) {
        this.f242d = i4;
        this.f243e = fVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f242d) {
            case 0:
                f fVar = this.f243e;
                fVar.h(new d(fVar, 1));
                break;
            default:
                this.f243e.a();
                break;
        }
        return y.f7506a;
    }
}
