package T3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import n6.InterfaceC1163b;
import o.p1;

/* renamed from: T3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0318b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5713e;

    public /* synthetic */ C0318b(o oVar, int i4) {
        this.f5712d = i4;
        this.f5713e = oVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f5712d) {
            case 0:
                o6.j.e((View) obj, "it");
                this.f5713e.a();
                return Z5.y.f7506a;
            case 1:
                o.I(this.f5713e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o.G(this.f5713e, (View) obj);
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                H J6 = this.f5713e.J();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                H3.n nVar = J6.f5700b;
                f2.h hVar = (f2.h) nVar.f1950e.a();
                if (hVar != null) {
                    nVar.j(f2.h.i(hVar, null, null, obj2, 0, null, null, null, 0, 251));
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                H J8 = this.f5713e.J();
                String obj3 = editable2.toString();
                o6.j.e(obj3, "message");
                H3.n nVar2 = J8.f5700b;
                f2.h hVar2 = (f2.h) nVar2.f1950e.a();
                if (hVar2 != null) {
                    nVar2.j(f2.h.i(hVar2, null, null, null, 0, null, obj3, null, 0, 223));
                }
                return Z5.y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Editable editable3 = (Editable) obj;
                o6.j.e(editable3, "it");
                this.f5713e.J().e(editable3.toString());
                return Z5.y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                o6.j.e((View) obj, "it");
                o oVar = this.f5713e;
                oVar.J();
                if (Build.VERSION.SDK_INT >= 26) {
                    C1.g o7 = oVar.o();
                    Context k = oVar.k();
                    Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.addFlags(268435456);
                    intent.putExtra("android.provider.extra.APP_PACKAGE", "com.buzbuz.smartautoclicker");
                    o7.d(k, new F1.a(intent), true);
                }
                return Z5.y.f7506a;
            default:
                String str = (String) obj;
                o6.j.e(str, "counterName");
                o oVar2 = this.f5713e;
                oVar2.J().e(str);
                p1 p1Var = oVar2.f5740w;
                if (p1Var != null) {
                    E2.d.O((A4.a) p1Var.f13352h, str);
                    return Z5.y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
