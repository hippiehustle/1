package o4;

import android.text.Editable;
import android.view.View;
import e2.C0638a;
import j2.C0905e;
import n6.InterfaceC1163b;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1265b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f13559e;

    public /* synthetic */ C1265b(t tVar, int i4) {
        this.f13558d = i4;
        this.f13559e = tVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f13558d) {
            case 0:
                String str = (String) obj;
                o6.j.e(str, "counterName");
                this.f13559e.J().f(new C0638a(str));
                return Z5.y.f7506a;
            case 1:
                o6.j.e((View) obj, "it");
                this.f13559e.a();
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                t.I(this.f13559e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                t.G(this.f13559e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                O J6 = this.f13559e.J();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                H3.n nVar = J6.f13540b;
                C0905e c0905e = (C0905e) nVar.f1950e.b();
                if (c0905e != null) {
                    nVar.k(C0905e.i(c0905e, null, null, obj2, null, null, null, 59));
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                this.f13559e.J().e(editable2.toString());
                return Z5.y.f7506a;
            default:
                Editable editable3 = (Editable) obj;
                o6.j.e(editable3, "it");
                this.f13559e.J().f(new C0638a(editable3.toString()));
                return Z5.y.f7506a;
        }
    }
}
