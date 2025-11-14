package n4;

import android.text.Editable;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import j2.C0903c;
import n6.InterfaceC1163b;

/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1158b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f12931e;

    public /* synthetic */ C1158b(o oVar, int i4) {
        this.f12930d = i4;
        this.f12931e = oVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        String str;
        switch (this.f12930d) {
            case 0:
                o6.j.e((View) obj, "it");
                this.f12931e.a();
                return Z5.y.f7506a;
            case 1:
                o.I(this.f12931e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o.H(this.f12931e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                z J6 = this.f12931e.J();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                H3.n nVar = J6.f12987b;
                C0903c c0903c = (C0903c) nVar.f1950e.b();
                if (c0903c != null) {
                    nVar.k(C0903c.i(c0903c, null, obj2, null, 11));
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                this.f12931e.J().e(editable2.toString());
                return Z5.y.f7506a;
            default:
                String str2 = (String) obj;
                o oVar = this.f12931e;
                z J8 = oVar.J();
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                J8.e(str);
                A4.a aVar = oVar.f12958w;
                if (aVar != null) {
                    ((TextInputEditText) ((A4.a) aVar.f281f).f283h).setText(str2);
                    return Z5.y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
