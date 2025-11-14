package D4;

import android.graphics.Point;
import android.graphics.Rect;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public final class I extends AbstractC0720j implements InterfaceC1166e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ s2.p f915h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f916i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ P k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P p8, InterfaceC0617c interfaceC0617c) {
        super(4, interfaceC0617c);
        this.k = p8;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        I i4 = new I(this.k, (InterfaceC0617c) obj4);
        i4.f915h = (s2.p) obj;
        i4.f916i = intValue;
        i4.j = booleanValue;
        return i4.v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        Rect rect;
        s2.p pVar = this.f915h;
        int i4 = this.f916i;
        boolean z9 = this.j;
        Z5.a.d(obj);
        if (pVar != null) {
            Rect rect2 = pVar.f14495c.f11794f;
            if (z9) {
                Point point = pVar.f14496d;
                int width = rect2.width() / 2;
                int height = rect2.height() / 2;
                double d2 = 1.0d - (i4 / 100.0d);
                double d3 = pVar.f14497e;
                if (d2 < d3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (point.x == 0 && point.y == 0) {
                    rect = new Rect();
                } else {
                    int i8 = point.x;
                    int i9 = point.y;
                    rect = new Rect(i8 - width, i9 - height, i8 + width, i9 + height);
                }
                return new C0030f(z8, rect, d3);
            }
            return null;
        }
        return null;
    }
}
