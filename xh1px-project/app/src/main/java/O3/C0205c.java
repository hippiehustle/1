package O3;

import android.content.ComponentName;
import android.text.Editable;
import com.google.android.material.textfield.TextInputEditText;
import g2.C0777a;
import n6.InterfaceC1163b;

/* renamed from: O3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0205c implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0219q f3946e;

    public /* synthetic */ C0205c(C0219q c0219q, int i4) {
        this.f3945d = i4;
        this.f3946e = c0219q;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        String str;
        switch (this.f3945d) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                C0219q c0219q = this.f3946e;
                c0219q.t().f(num);
                F3.a aVar = c0219q.f3990m;
                if (aVar != null) {
                    E2.d.L((A4.a) aVar.f1308i, String.valueOf(intValue));
                    return Z5.y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                String str2 = (String) obj;
                C0219q c0219q2 = this.f3946e;
                a0 t8 = c0219q2.t();
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                t8.e(str);
                F3.a aVar2 = c0219q2.f3990m;
                if (aVar2 != null) {
                    ((TextInputEditText) ((A4.a) aVar2.f1306g).f283h).setText(str2);
                    return Z5.y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0777a c0777a = (C0777a) obj;
                o6.j.e(c0777a, "extra");
                C0219q c0219q3 = this.f3946e;
                c0219q3.c(new A1.n(c0219q3, 9, c0777a));
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                this.f3946e.t().h(editable.toString());
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                this.f3946e.t().e(editable2.toString());
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Editable editable3 = (Editable) obj;
                o6.j.e(editable3, "it");
                a0 t9 = this.f3946e.t();
                Integer num2 = null;
                try {
                    if (editable3.length() > 0) {
                        num2 = Integer.valueOf(Integer.parseInt(editable3.toString()));
                    }
                } catch (NumberFormatException unused) {
                }
                t9.f(num2);
                return Z5.y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Editable editable4 = (Editable) obj;
                o6.j.e(editable4, "it");
                a0 t10 = this.f3946e.t();
                String obj2 = editable4.toString();
                o6.j.e(obj2, "componentName");
                H3.n nVar = t10.f3924b;
                f2.f fVar = (f2.f) nVar.f1950e.a();
                if (fVar != null) {
                    nVar.j(f2.f.i(fVar, null, null, null, 0, null, false, null, ComponentName.unflattenFromString(obj2), null, null, 895));
                }
                return Z5.y.f7506a;
            default:
                ComponentName componentName = (ComponentName) obj;
                o6.j.e(componentName, "newCompName");
                C0219q c0219q4 = this.f3946e;
                H3.n nVar2 = c0219q4.t().f3924b;
                f2.f fVar2 = (f2.f) nVar2.f1950e.a();
                if (fVar2 != null) {
                    nVar2.j(f2.f.i(fVar2, null, null, null, 0, null, false, null, componentName.clone(), null, null, 895));
                }
                F3.a aVar3 = c0219q4.f3990m;
                if (aVar3 != null) {
                    E2.d.O((A4.a) aVar3.f1307h, componentName.flattenToString());
                    return Z5.y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
