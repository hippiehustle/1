package M3;

import android.graphics.Point;
import android.graphics.PointF;
import android.text.Editable;
import android.view.View;
import n6.InterfaceC1163b;

/* renamed from: M3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0169b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0183p f3429e;

    public /* synthetic */ C0169b(C0183p c0183p, int i4) {
        this.f3428d = i4;
        this.f3429e = c0183p;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Long l6;
        f2.d dVar;
        switch (this.f3428d) {
            case 0:
                P2.a aVar = (P2.a) obj;
                o6.j.e(aVar, "description");
                PointF pointF = ((Q2.c) aVar).f4781b;
                if (pointF != null) {
                    Z J6 = this.f3429e.J();
                    Point point = new Point((int) pointF.x, (int) pointF.y);
                    H3.n nVar = J6.f3416c;
                    f2.e eVar = (f2.e) nVar.f1950e.a();
                    if (eVar != null) {
                        nVar.j(f2.e.i(eVar, null, null, null, 0, null, null, point, null, null, 447));
                    }
                }
                return Z5.y.f7506a;
            case 1:
                o6.j.e((View) obj, "it");
                this.f3429e.a();
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0183p.G(this.f3429e, (View) obj);
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0183p.I(this.f3429e, (View) obj);
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                Z J8 = this.f3429e.J();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                H3.n nVar2 = J8.f3416c;
                f2.e eVar2 = (f2.e) nVar2.f1950e.a();
                if (eVar2 != null) {
                    nVar2.j(f2.e.i(eVar2, null, null, obj2, 0, null, null, null, null, null, 507));
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                Z J9 = this.f3429e.J();
                if (editable2.length() > 0) {
                    l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                } else {
                    l6 = null;
                }
                Long l8 = l6;
                H3.n nVar3 = J9.f3416c;
                f2.e eVar3 = (f2.e) nVar3.f1950e.a();
                if (eVar3 != null) {
                    nVar3.j(f2.e.i(eVar3, null, null, null, 0, l8, null, null, null, null, 495));
                }
                return Z5.y.f7506a;
            default:
                Integer num = (Integer) obj;
                Z J10 = this.f3429e.J();
                if (num != null && num.intValue() == 0) {
                    dVar = f2.d.f10687d;
                } else {
                    dVar = f2.d.f10688e;
                }
                f2.d dVar2 = dVar;
                H3.n nVar4 = J10.f3416c;
                f2.e eVar4 = (f2.e) nVar4.f1950e.a();
                if (eVar4 != null) {
                    nVar4.j(f2.e.i(eVar4, null, null, null, 0, null, dVar2, null, null, null, 479));
                }
                return Z5.y.f7506a;
        }
        return Z5.y.f7506a;
    }
}
