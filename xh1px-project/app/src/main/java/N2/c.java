package N2;

import Z.g;
import Z5.y;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import n6.InterfaceC1163b;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f3727e;

    public /* synthetic */ c(d dVar, int i4) {
        this.f3726d = i4;
        this.f3727e = dVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f3726d) {
            case 0:
                Rect rect = (Rect) obj;
                j.e(rect, "position");
                d dVar = this.f3727e;
                T2.b bVar = dVar.f3731g;
                if (bVar != null) {
                    bVar.f(rect);
                    dVar.a();
                    return y.f7506a;
                }
                j.i("hintsIcons");
                throw null;
            case 1:
                j.e((RectF) obj, "<unused var>");
                this.f3727e.a();
                return y.f7506a;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                float floatValue = ((Float) obj).floatValue();
                R2.c cVar = this.f3727e.f3729e;
                if (cVar != null) {
                    RectF rectF = cVar.f5011i;
                    cVar.e(floatValue, new PointF(rectF.centerX(), rectF.centerY()));
                    return y.f7506a;
                }
                j.i("capture");
                throw null;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                int intValue = ((Integer) obj).intValue();
                R2.g gVar = this.f3727e.f3730f;
                if (gVar != null) {
                    gVar.k.setAlpha(intValue);
                    gVar.a();
                    return y.f7506a;
                }
                j.i("selector");
                throw null;
            case g.LONG_FIELD_NUMBER /* 4 */:
                int intValue2 = ((Integer) obj).intValue();
                R2.g gVar2 = this.f3727e.f3730f;
                if (gVar2 != null) {
                    gVar2.f5027l.setAlpha(intValue2);
                    gVar2.a();
                    return y.f7506a;
                }
                j.i("selector");
                throw null;
            default:
                int intValue3 = ((Integer) obj).intValue();
                T2.b bVar2 = this.f3727e.f3731g;
                if (bVar2 != null) {
                    bVar2.e(intValue3);
                    return y.f7506a;
                }
                j.i("hintsIcons");
                throw null;
        }
    }
}
