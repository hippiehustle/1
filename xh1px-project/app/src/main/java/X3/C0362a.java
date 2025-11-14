package X3;

import android.graphics.Point;
import android.graphics.PointF;
import android.text.Editable;
import android.view.View;
import n6.InterfaceC1163b;

/* renamed from: X3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0362a implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f6880e;

    public /* synthetic */ C0362a(p pVar, int i4) {
        this.f6879d = i4;
        this.f6880e = pVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Long l6;
        switch (this.f6879d) {
            case 0:
                o6.j.e((View) obj, "it");
                this.f6880e.a();
                break;
            case 1:
                p.H(this.f6880e, (View) obj);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                p.I(this.f6880e, (View) obj);
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                C J6 = this.f6880e.J();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                H3.n nVar = J6.f6871b;
                f2.k kVar = (f2.k) nVar.f1950e.a();
                if (kVar != null) {
                    nVar.j(f2.k.i(kVar, null, null, obj2, 0, null, null, null, 123));
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                C J8 = this.f6880e.J();
                if (editable2.length() > 0) {
                    l6 = Long.valueOf(Long.parseLong(editable2.toString()));
                } else {
                    l6 = null;
                }
                Long l8 = l6;
                H3.n nVar2 = J8.f6871b;
                f2.k kVar2 = (f2.k) nVar2.f1950e.a();
                if (kVar2 != null) {
                    nVar2.j(f2.k.i(kVar2, null, null, null, 0, l8, null, null, 111));
                }
                return Z5.y.f7506a;
            default:
                P2.a aVar = (P2.a) obj;
                o6.j.e(aVar, "description");
                Q2.p pVar = (Q2.p) aVar;
                C J9 = this.f6880e.J();
                PointF pointF = pVar.f4837b;
                o6.j.b(pointF);
                Point point = new Point((int) pointF.x, (int) pointF.y);
                PointF pointF2 = pVar.f4838c;
                o6.j.b(pointF2);
                Point point2 = new Point((int) pointF2.x, (int) pointF2.y);
                H3.n nVar3 = J9.f6871b;
                f2.k kVar3 = (f2.k) nVar3.f1950e.a();
                if (kVar3 != null) {
                    nVar3.j(f2.k.i(kVar3, null, null, null, 0, null, point, point2, 31));
                }
                return Z5.y.f7506a;
        }
        return Z5.y.f7506a;
    }
}
