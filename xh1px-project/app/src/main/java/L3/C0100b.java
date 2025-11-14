package L3;

import android.text.Editable;
import android.view.View;
import e2.C0638a;
import n6.InterfaceC1163b;

/* renamed from: L3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0100b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f2842e;

    public /* synthetic */ C0100b(w wVar, int i4) {
        this.f2841d = i4;
        this.f2842e = wVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f2841d) {
            case 0:
                String str = (String) obj;
                o6.j.e(str, "counterName");
                this.f2842e.J().f(new C0638a(str));
                return Z5.y.f7506a;
            case 1:
                o6.j.e((View) obj, "it");
                this.f2842e.a();
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                w.G(this.f2842e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                w.I(this.f2842e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                S J6 = this.f2842e.J();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                H3.n nVar = J6.f2825b;
                f2.c cVar = (f2.c) nVar.f1950e.a();
                if (cVar != null) {
                    nVar.j(f2.c.i(cVar, null, null, obj2, 0, null, null, null, 123));
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                this.f2842e.J().e(editable2.toString());
                return Z5.y.f7506a;
            default:
                Editable editable3 = (Editable) obj;
                o6.j.e(editable3, "it");
                this.f2842e.J().f(new C0638a(editable3.toString()));
                return Z5.y.f7506a;
        }
    }
}
