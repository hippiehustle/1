package M7;

import G.k;
import I7.m;
import K3.D;
import K3.s;
import P.C0267o;
import S1.C0295f;
import S1.L;
import S1.o;
import S1.p;
import S1.v;
import T1.O;
import T1.r;
import Z.g;
import Z3.C0374i;
import Z5.y;
import a0.C0407b;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.datastore.core.CorruptionException;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import f2.n;
import j2.C0905e;
import j2.EnumC0904d;
import java.util.Iterator;
import k3.C0959f;
import k3.C0965l;
import n0.AbstractC1120J;
import n0.AbstractC1143u;
import n0.C1111A;
import n0.C1131i;
import n0.C1144v;
import n0.C1146x;
import n0.C1148z;
import n6.InterfaceC1163b;
import o6.i;
import o6.j;
import q0.C1350f;
import t0.C1536c;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3502f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(A4.a aVar, InterfaceC1163b interfaceC1163b) {
        this.f3500d = 1;
        this.f3501e = aVar;
        this.f3502f = (i) interfaceC1163b;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [o6.i, n6.b] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        C1144v c1144v;
        AbstractC1143u c6;
        EnumC0904d enumC0904d;
        int i4 = this.f3500d;
        Drawable drawable = null;
        r5 = null;
        n nVar = null;
        y yVar = y.f7506a;
        Object obj2 = this.f3502f;
        Object obj3 = this.f3501e;
        switch (i4) {
            case 0:
                ((e) obj3).f3505f.removeCallbacks((k) obj2);
                return yVar;
            case 1:
                D2.d dVar = (D2.d) obj;
                j.e(dVar, "selectedItem");
                ((MaterialAutoCompleteTextView) ((A4.a) obj3).f282g).dismissDropDown();
                ((i) obj2).m(dVar);
                return yVar;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                Q2.c cVar = (Q2.c) obj2;
                PointF pointF = (PointF) obj;
                j.e(pointF, "position");
                ((F1.e) obj3).S(new Q2.c(cVar.f4780a, pointF, cVar.f4782c));
                return yVar;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                s sVar = (s) obj3;
                D d2 = (D) obj2;
                V3.k kVar = (V3.k) obj;
                j.e(kVar, "choiceClicked");
                if (kVar instanceof V3.c) {
                    E2.d.S(sVar, d2);
                } else {
                    E2.d.R(sVar, d2, d2.f(sVar.k(), kVar));
                }
                return yVar;
            case g.LONG_FIELD_NUMBER /* 4 */:
                D d3 = (D) obj2;
                f2.a aVar = (f2.a) obj;
                j.e(aVar, "newCopyAction");
                d3.getClass();
                H3.b bVar = d3.f2642d.f1949d;
                E2.d.R((w1.e) obj3, d3, bVar.a(aVar, bVar.h()));
                return yVar;
            case g.STRING_FIELD_NUMBER /* 5 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((C1.b) obj3).l(bool, Boolean.valueOf(((L1.b) obj2).f2756a));
                return yVar;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                D0.a aVar2 = (D0.a) obj;
                j.e(aVar2, "_connection");
                ((o) ((p) obj3).f5289e).l(aVar2, (r) obj2);
                return yVar;
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                D0.a aVar3 = (D0.a) obj;
                j.e(aVar3, "_connection");
                ((o) ((p) obj3).f5289e).l(aVar3, (r) obj2);
                return yVar;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                O o7 = (O) obj2;
                D0.a aVar4 = (D0.a) obj;
                j.e(aVar4, "_connection");
                C1536c c1536c = ((L) obj3).f5242b;
                c1536c.getClass();
                try {
                    ((v) c1536c.f14808e).u(aVar4, o7);
                } catch (SQLException e9) {
                    String message = e9.getMessage();
                    if (message != null) {
                        if (!m.b0(message, "unique", true) && !m.b0(message, "2067", false) && !m.b0(message, "1555", false)) {
                            throw e9;
                        }
                        ((C0295f) c1536c.f14809f).l(aVar4, o7);
                    } else {
                        throw e9;
                    }
                }
                return yVar;
            case 9:
                A4.d dVar2 = (A4.d) obj3;
                X4.e eVar = (X4.e) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((ImageView) dVar2.f296f).setImageBitmap(bitmap);
                } else {
                    A4.d dVar3 = eVar.f6954u;
                    ImageView imageView = (ImageView) dVar3.f296f;
                    Drawable drawable2 = ((MaterialCardView) dVar3.f295e).getContext().getDrawable(R.drawable.ic_cancel);
                    if (drawable2 != null) {
                        drawable2.setTint(-65536);
                        drawable = drawable2;
                    }
                    imageView.setImageDrawable(drawable);
                }
                return yVar;
            case 10:
                Z3.o oVar = (Z3.o) obj3;
                C0374i c0374i = (C0374i) obj2;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    nVar = n.f10746d;
                } else if (num != null && num.intValue() == 1) {
                    nVar = n.f10748f;
                } else if (num != null && num.intValue() == 2) {
                    nVar = n.f10747e;
                }
                oVar.f7393v.l(c0374i.f7380a, nVar);
                return yVar;
            case 11:
                CorruptionException corruptionException = (CorruptionException) obj;
                j.e(corruptionException, "exception");
                Log.e("PreferencesDataSource", "Preferences file " + ((String) obj3) + " is corrupted", corruptionException);
                return (C0407b) ((InterfaceC1163b) obj2).m(corruptionException);
            case 12:
                j.e((C0965l) obj, "it");
                ((InterfaceC1163b) obj3).m((C0959f) obj2);
                return yVar;
            case 13:
                AbstractC1143u abstractC1143u = (AbstractC1143u) obj3;
                C1350f c1350f = ((C1146x) obj2).f12819b;
                C1111A c1111a = (C1111A) obj;
                j.e(c1111a, "$this$navOptions");
                C0267o c0267o = c1111a.f12713a;
                c0267o.f4298a = 0;
                c0267o.f4299b = 0;
                if (abstractC1143u instanceof C1144v) {
                    int i8 = AbstractC1143u.f12811i;
                    Iterator it = H7.m.T(abstractC1143u, new H7.o(26)).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC1143u abstractC1143u2 = (AbstractC1143u) it.next();
                            AbstractC1143u f8 = c1350f.f();
                            if (f8 != null) {
                                c1144v = f8.f12814f;
                            } else {
                                c1144v = null;
                            }
                            if (j.a(abstractC1143u2, c1144v)) {
                            }
                        } else {
                            int i9 = C1144v.k;
                            c1111a.f12716d = ((AbstractC1143u) H7.m.V(H7.m.T(c1350f.g(), new H7.o(27)))).f12813e.f13342a;
                            c1111a.f12717e = true;
                        }
                    }
                }
                return yVar;
            case 14:
                AbstractC1120J abstractC1120J = (AbstractC1120J) obj3;
                C1148z c1148z = (C1148z) obj2;
                C1131i c1131i = (C1131i) obj;
                j.e(c1131i, "backStackEntry");
                G5.n nVar2 = c1131i.k;
                AbstractC1143u abstractC1143u3 = c1131i.f12759e;
                if (abstractC1143u3 == null) {
                    abstractC1143u3 = null;
                }
                if (abstractC1143u3 == null || (c6 = abstractC1120J.c(abstractC1143u3, nVar2.b(), c1148z)) == null) {
                    return null;
                }
                if (c6.equals(abstractC1143u3)) {
                    return c1131i;
                }
                return abstractC1120J.b().b(c6, c6.g(nVar2.b()));
            default:
                D2.d dVar4 = (D2.d) obj3;
                o4.O o8 = (o4.O) obj2;
                C0905e c0905e = (C0905e) obj;
                j.e(c0905e, "old");
                if (j.a(dVar4, o8.f13541c)) {
                    enumC0904d = EnumC0904d.f11805g;
                } else if (j.a(dVar4, o8.f13542d)) {
                    enumC0904d = EnumC0904d.f11806h;
                } else if (j.a(dVar4, o8.f13543e)) {
                    enumC0904d = EnumC0904d.f11802d;
                } else if (j.a(dVar4, o8.f13544f)) {
                    enumC0904d = EnumC0904d.f11804f;
                } else {
                    if (!j.a(dVar4, o8.f13545g)) {
                        return null;
                    }
                    enumC0904d = EnumC0904d.f11803e;
                }
                return C0905e.i(c0905e, null, null, null, null, enumC0904d, null, 47);
        }
    }

    public /* synthetic */ c(Object obj, int i4, Object obj2) {
        this.f3500d = i4;
        this.f3501e = obj;
        this.f3502f = obj2;
    }
}
