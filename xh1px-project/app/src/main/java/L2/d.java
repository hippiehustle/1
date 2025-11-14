package L2;

import R2.g;
import Z5.y;
import android.graphics.Rect;
import n6.InterfaceC1163b;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f2771e;

    public /* synthetic */ d(e eVar, int i4) {
        this.f2770d = i4;
        this.f2771e = eVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f2770d) {
            case 0:
                Rect rect = (Rect) obj;
                j.e(rect, "position");
                T2.b bVar = this.f2771e.f2773e;
                if (bVar != null) {
                    bVar.f(rect);
                    return y.f7506a;
                }
                j.i("hintsIcons");
                throw null;
            case 1:
                int intValue = ((Integer) obj).intValue();
                g gVar = this.f2771e.f2772d;
                if (gVar != null) {
                    gVar.k.setAlpha(intValue);
                    gVar.a();
                    return y.f7506a;
                }
                j.i("selector");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                int intValue2 = ((Integer) obj).intValue();
                g gVar2 = this.f2771e.f2772d;
                if (gVar2 != null) {
                    gVar2.f5027l.setAlpha(intValue2);
                    gVar2.a();
                    return y.f7506a;
                }
                j.i("selector");
                throw null;
            default:
                int intValue3 = ((Integer) obj).intValue();
                T2.b bVar2 = this.f2771e.f2773e;
                if (bVar2 != null) {
                    bVar2.e(intValue3);
                    return y.f7506a;
                }
                j.i("hintsIcons");
                throw null;
        }
    }
}
